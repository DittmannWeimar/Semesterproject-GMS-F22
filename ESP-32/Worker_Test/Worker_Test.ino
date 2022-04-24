#include <esp_now.h>
#include <WiFi.h>

#include <Wire.h>
#include <Adafruit_AM2320.h>

uint8_t gatewayAddress[] = {0x9C, 0x9C, 0x1F, 0xC5, 0xF7, 0xEC};
esp_now_peer_info_t gatewayInfo;
String success;

enum MESSAGE_TYPE { Ping, Setting, Sample };
float sampleRate = 0.1;

// Readings cache
float temperature;
float humidity;

void setup() {
  // Init Serial Monitor
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
  }
  // Register for a callback function that will be called when data is received
  esp_now_register_recv_cb(OnDataRecv);
}

typedef struct message_base {
  MESSAGE_TYPE type;
} message_base;
message_base baseMessage;

typedef struct message_setting : message_base {
  String setting;
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
  int sampleDelay = 1.0 / sampleRate * 1000;
  Serial.println(String(sampleDelay));
  delay(max(sampleDelay, 1000));
  sample();
  send_message(gatewayAddress, (uint8_t *) &sampleMessage, sizeof(sampleMessage));
}

void sample () {
  Serial.println("Sampling..");
  
  temperature++;
  humidity++;

  Serial.print("Sample temperature: ");
  Serial.println(String(temperature));

  Serial.print("Sample humidity: ");
  Serial.println(String(humidity));

  sampleMessage.type = Sample;
  sampleMessage.temp = temperature;
  sampleMessage.hum = humidity;
}

void OnDataSent(const uint8_t *mac_addr, esp_now_send_status_t status) {
  Serial.print("\r\nLast Packet Send Status:\t");
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
  
  Serial.print(String(baseMessage.type));
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
  memcpy(&settingMessage, incomingData, len);
  Serial.println("Recieved setting update for " + settingMessage.setting + " with value " + String(settingMessage.newValue));
  if (settingMessage.setting == "sampleRate") {
    sampleRate = settingMessage.newValue;
    Serial.println("Sample rate updated to " + String(sampleRate));
  }
}

void send_message(const uint8_t * mac, const uint8_t *incomingData, int len) {
  esp_err_t result = esp_now_send(mac, incomingData, len);
   
  if (result == ESP_OK) {
    Serial.println("Sent with success");
  }
  else {
    Serial.println("Error sending the data");
  }
}
