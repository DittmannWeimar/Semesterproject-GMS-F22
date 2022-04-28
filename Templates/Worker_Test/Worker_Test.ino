#include <esp_now.h>
#include <esp_wifi.h>
#include <WiFi.h>

#include <Wire.h>
#include <Adafruit_AM2320.h>

#include "DHT.h"
#define DHTPIN 4     // Digital pin connected to the DHT sensor
#define DHTTYPE DHT11   // DHT 11

uint8_t gatewayAddress[] = {0x84, 0xCC, 0xA8, 0x2D, 0xDE, 0x3C};
esp_now_peer_info_t gatewayInfo;
String success;

enum MESSAGE_TYPE { Ping, Setting, Sample };
float sampleRate = 0.1;

// Readings cache
float temperature;
float humidity;

DHT dht(DHTPIN, DHTTYPE);

uint8_t dhtPin = 4;

const int ledPin = 26;

const int freq = 5000;
const int ledChannel = 0;
const int resolution = 8;
const bool scan = true;
const String STATION_NAME = "Gateway";

float ledTreshold = 255;
int espnow_channel = 0;

void setup() {
  WiFi.mode(WIFI_STA);
  WiFi.disconnect();

  if(scan) {
    uint8_t networks = WiFi.scanNetworks();
    for(int n=0;n<networks;n++) {
        Serial.printf("%d %s   %d   %d %s \n", n,WiFi.SSID(n).c_str(),WiFi.RSSI(n), WiFi.channel(n), WiFi.BSSIDstr(n).c_str());
        for(int i=0;i<8;i++) {
            Serial.print(WiFi.BSSID(n)[i]);
            Serial.print(" ");
        }
        Serial.println();

        if(WiFi.SSID(n).indexOf(STATION_NAME) == 0)
        {
            Serial.println("Found");
            memcpy(gatewayAddress, WiFi.BSSID(n), 6);
            espnow_channel = WiFi.channel(n);
        }
        
    }

    WiFi.scanDelete();
  }
  
  esp_wifi_set_promiscuous(true);
  esp_wifi_set_channel(espnow_channel, WIFI_SECOND_CHAN_NONE);
  esp_wifi_set_promiscuous(false);

  // Set pinModes
  pinMode(ledPin, OUTPUT);
  Serial.begin(115200);
 
  // Set device as a Wi-Fi Station
  WiFi.mode(WIFI_STA);
  Serial.print("Worker starting with MAC address ");
  Serial.println(WiFi.macAddress());

  ledcSetup(ledChannel, freq, resolution);
  
  // attach the channel to the GPIO to be controlled
  ledcAttachPin(ledPin, ledChannel);

  Serial.println("Initializing DHT sensor..");
  dht.begin();
  Serial.println("DHT initiated");

  // Init ESP-NOW
  if (esp_now_init() != ESP_OK) {
    Serial.println("Error initializing ESP-NOW");
    return;
  }

  // Once ESPNow is successfully Init, we will register for Send CB to
  // get the status of Trasnmitted packet
  esp_now_register_send_cb(OnDataSent);
  
  // Register peer
  memcpy(gatewayInfo.peer_addr, gatewayAddress, 6);
  gatewayInfo.channel = 0;  
  gatewayInfo.encrypt = false;
  
  // Add peer        
  if (esp_now_add_peer(&gatewayInfo) != ESP_OK){
    Serial.println("Failed to add peer");
    return;
  }else{
    Serial.println("Succesfully added peer");
  }
  
  // Register for a callback function that will be called when data is received
  esp_now_register_recv_cb(OnDataRecv);
}

typedef struct message_base {
  MESSAGE_TYPE type;
} message_base;
message_base baseMessage;

typedef struct message_setting : message_base {
  int setting;
  float newValue;
} message_setting;
message_setting settingMessage;

typedef struct message_sample : message_base {
    float temp;
    float hum;
} message_sample;
message_sample sampleMessage;

void loop() {
  // put your main code here, to run repeatedly:
  update_color();
  int sampleDelay = 1.0 / sampleRate * 1000;
  delay(max(sampleDelay, 1000));
  sample();
  send_message(gatewayAddress, (uint8_t *) &sampleMessage, sizeof(sampleMessage));
}

void sample () {
  Serial.println("Sampling..");

  // Reading temperature or humidity takes about 250 milliseconds!
  // Sensor readings may also be up to 2 seconds 'old' (its a very slow sensor)
  //humidity = dht.getHumidity();
  // Read temperature as Celsius (the default)
  temperature = dht.readTemperature();
  humidity = dht.readHumidity();

  // Check if any reads failed and exit early (to try again).
  if (isnan(humidity) && isnan(temperature)) {
    Serial.println(F("Failed to read from DHT sensor!"));
    return;
  }

  Serial.print("Sample temperature: ");
  Serial.println(String(temperature));

  Serial.print("Sample humidity: ");
  Serial.println(String(humidity));

  sampleMessage.type = Sample;
  sampleMessage.temp = temperature;
  sampleMessage.hum = humidity;

  // Wait a few seconds between measurements.
  delay(2000);
}

void update_color () {
  Serial.println("Threshold: " + String(ledTreshold));
  if (20 > ledTreshold) {
    ledcWrite(ledChannel, ledTreshold);    
  }else{
    ledcWrite(ledChannel, ledTreshold);    
  }
}

void OnDataSent(const uint8_t *mac_addr, esp_now_send_status_t status) {
  Serial.print("Last Packet Send Status:\t");
  Serial.println(status == ESP_NOW_SEND_SUCCESS ? "Delivery Success" : "Delivery Fail");
  if (status ==0){
    success = "Delivery Success :)";
  }
  else{
    success = "Delivery Fail :(";
  }
}

void OnDataRecv(const uint8_t * mac, const uint8_t *incomingData, int len) {  
  memcpy(&baseMessage, incomingData, sizeof(baseMessage));
  
  Serial.print("Type " + String(baseMessage.type) + " ");
  Serial.print("message received: ");
  Serial.println(len);
  
  switch (baseMessage.type) {
    case Ping:
      handle_ping(mac, incomingData, len);
      break;
    case Setting:
      handle_setting(mac, incomingData, len);
      break;
  }

  update_color();
}

void print_mac(const uint8_t * mac) {
  String result = "";
  for (int i = 0; i < 6; i++) {
    uint8_t b = mac[i];
    Serial.print(b, HEX);
    if (i != 6 - 1) {
      Serial.print(":");
    }
  }
}

void handle_ping(const uint8_t * mac, const uint8_t *incomingData, int len) {
  Serial.print("Ping recieved from ");
  print_mac(mac);
  Serial.println("");
  
  send_message(mac, incomingData, len);
}

void handle_setting(const uint8_t * mac, const uint8_t *incomingData, int len) {
  memcpy(&settingMessage, incomingData, sizeof(settingMessage));
  if (settingMessage.setting == 0) {
    ledTreshold = settingMessage.newValue;
  }
}

void send_message(const uint8_t * mac, const uint8_t *incomingData, int len) {
  esp_err_t result = esp_now_send(mac, incomingData, len);
}
