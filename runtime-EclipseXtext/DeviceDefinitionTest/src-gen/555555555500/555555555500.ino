#include <esp_now.h>
#include <esp_wifi.h>
#include <WiFi.h>
#include <Wire.h>
	
// GENERATED DIRECTIVES
#include "DHT.h"
#define DHTTYPE DHT11
uint8_t gatewayAddress[] = {0x11, 0x22, 0x33, 0x44, 0x55, 0x66};
esp_now_peer_info_t gatewayInfo;

enum MESSAGE_TYPE { Ping, Setting, Sample };

// GENERATED SETTINGS
float mois_threshold;

// GENERATED INITIALIZATIONS
DHT temp1_dht(4, DHTTYPE);
int temp1_pin4 = 4;
float temp1_temperature;
float temp1_humidity;
int mois_pin5 = 5;
float mois_moisture;
float dummy_zero;

const int freq = 5000;
const int ledChannel = 0;
const int resolution = 8;
const bool scan = true;
const String STATION_NAME = "Gateway";

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
temp1_dht.begin();
Serial.println("DHT sensor initialized!");
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
	float test_worker1_temp1_temperature;
	float test_worker1_temp1_humidity;
	float test_worker1_mois_moisture;
	float test_worker1_dummy_zero;
} message_sample;
message_sample sampleMessage;

void loop() {
  // put your main code here, to run repeatedly:
  float value = 0;
  
  if ((bool)(temp1_temperature == true)) {
  temp1_temperature = temp1_dht.readTemperature();
  value = temp1_temperature;
  temp1_temperature = pow(2, value);
  sampleMessage.test_worker1_temp1_temperature = temp1_temperature;
  temp1_humidity = temp1_dht.readHumidity();
  sampleMessage.test_worker1_temp1_humidity = temp1_humidity;
  }
  if ((bool)(temp1_humidity > mois_threshold)) {
  mois_moisture = analogRead(mois_pin5);
  sampleMessage.test_worker1_mois_moisture = mois_moisture;
  }
  dummy_zero = 0;
  value = dummy_zero;
  dummy_zero = value + 20;
  sampleMessage.test_worker1_dummy_zero = dummy_zero;

  send_message(gatewayAddress, (uint8_t *) &sampleMessage, sizeof(sampleMessage));
  delay(600000);
}

void OnDataSent(const uint8_t *mac_addr, esp_now_send_status_t status) {
  Serial.print("Last Packet Send Status:\t");
  Serial.println(status == ESP_NOW_SEND_SUCCESS ? "Delivery Success" : "Delivery Fail");
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
  	mois_threshold = settingMessage.newValue;
  }
}

void send_message(const uint8_t * mac, const uint8_t *incomingData, int len) {
  esp_err_t result = esp_now_send(mac, incomingData, len);
}