#include <esp_now.h>
#include <esp_wifi.h>
#include <WiFi.h>
#include <Wire.h>
  
// GENERATED DIRECTIVES
#include "DHT.h"
#define DHTTYPE DHT11
uint8_t gatewayAddress[] = {0x58, 0xBF, 0x25, 0xE0, 0x77, 0x98};
esp_now_peer_info_t gatewayInfo;

enum MESSAGE_TYPE { Ping, Setting, Sample };

// GENERATED SETTINGS
float pump_power = 256;

// GENERATED INITIALIZATIONS
float th_temperature;
float th_humidity;
DHT th_dht(4, DHTTYPE);
float moisture_sample;
bool pump_enabled = false;

// GENERATED TIMERS
uint64_t last_loop_time;
uint64_t pump_last_enable_time;

const int freq = 5000;
const int ledChannel = 0;
const int resolution = 8;
const bool scan = true;
const String STATION_NAME = "Gateway";

const int messageTries = 3;
const int errorLedPin = 2;
bool messageSuccess = false;

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

 
  Serial.begin(115200);
  
  ledcSetup(0, freq, resolution);
  ledcAttachPin(25, 0);
  pinMode(25, OUTPUT);
  ledcSetup(1, freq, resolution);
  ledcAttachPin(26, 1);
  pinMode(26, OUTPUT);

  pinMode(errorLedPin, OUTPUT);
 
  // Set device as a Wi-Fi Station
  WiFi.mode(WIFI_STA);
  Serial.print("Worker starting with MAC address ");
  Serial.println(WiFi.macAddress());

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
  
  // GENERATED SETUP
pinMode(4, INPUT);
th_dht.begin();
Serial.println("DHT sensor initialized!");
pinMode(32, INPUT);
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
  float pump_01_th_temperature;
  float pump_01_th_humidity;
  float pump_01_moisture_sample;
} message_sample;
message_sample sampleMessage;

void loop() {
  uint64_t current_time = esp_timer_get_time() / 1000ULL;
  if (current_time > last_loop_time + 10000) {
  
    sampleMessage.pump_01_th_temperature = 1.0 / 0.0;
    sampleMessage.pump_01_th_humidity = 1.0 / 0.0;
    sampleMessage.pump_01_moisture_sample = 1.0 / 0.0;
    
    float value = 0;
    
    th_temperature = th_dht.readTemperature();
    sampleMessage.pump_01_th_temperature = th_temperature;
    th_humidity = th_dht.readHumidity();
    sampleMessage.pump_01_th_humidity = th_humidity;
    moisture_sample = analogRead(32);
    value = moisture_sample;
    moisture_sample = value / 1024.0 * 100.0;
    sampleMessage.pump_01_moisture_sample = moisture_sample;
    pump_enabled = (bool)(moisture_sample < 50);
    ledcWrite(0, (float)(pump_enabled) * pump_power);
    if (pump_enabled) {
      pump_last_enable_time = current_time;
    }

    
    sampleMessage.type = Sample;
    send_message(gatewayAddress, (uint8_t *) &sampleMessage, sizeof(sampleMessage));
    
    last_loop_time = current_time;
  }
  
  if (current_time > pump_last_enable_time + 2000 && pump_enabled) {
    pump_enabled = false;
    ledcWrite(0, (float)(pump_enabled) * pump_power);
  }

  
  delay(100);
}

void OnDataSent(const uint8_t *mac_addr, esp_now_send_status_t status) {
  messageSuccess = status == ESP_NOW_SEND_SUCCESS;
  Serial.println("Send message status: " + String(status == ESP_NOW_SEND_SUCCESS ? "success" : "failure"));
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
    pump_power = settingMessage.newValue;
  }
}

void send_message(const uint8_t * mac, const uint8_t *incomingData, int len) {
  bool success = false;
  for (int i = 0; i < messageTries; i++) {
    esp_err_t result = esp_now_send(mac, incomingData, len);
    delay(250);
    if (messageSuccess) {
      success = true;
      break;
    }
  }
  Serial.println("Send message success: " + String(success));
  digitalWrite(errorLedPin, success ? LOW : HIGH);
}
