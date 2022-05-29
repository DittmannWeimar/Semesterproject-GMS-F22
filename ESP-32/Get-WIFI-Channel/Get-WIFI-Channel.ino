#include <esp_now.h>
#include <esp_wifi.h>
#include <WiFi.h>
#include "EspMQTTClient.h"

typedef struct worker_info {
  uint8_t address[6];
  esp_now_peer_info_t info;
};

const int numWorkers = 3;
struct worker_info workers[numWorkers];
worker_info null_worker;
bool messageSuccess = false;

enum MESSAGE_TYPE { Ping, Setting, Sample };

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
  float Worker_1_th_temperature;
  float Worker_1_th_humidity;
  float Worker_2_th_temperature;
  float Worker_2_th_humidity;
  float Worker_3_th_temperature;
  float Worker_3_th_humidity;
} message_sample;
message_sample sampleMessage;

const char* WIFI_SSID = "Nova 5T";
const char* WIFI_PW = "meeeeeep";

EspMQTTClient client(
  WIFI_SSID,
  WIFI_PW,
  "vald.io",
  "kristian",
  "1234",
  "gms-gateway-7936dc2a-7941-4d2f-b180-b9ce3662ed7a",
  3001
);

void setup() {
  // Init Serial Monitor
  WiFi.disconnect();
  Serial.begin(115200);
  
  WiFi.mode(WIFI_AP_STA);
  Serial.print("Gateway starting with MAC address ");
  Serial.println(WiFi.macAddress());
  
  int32_t channel = 11;
  esp_wifi_set_channel(channel, WIFI_SECOND_CHAN_NONE);
  
  WiFi.begin(WIFI_SSID, WIFI_PW);

  while (WiFi.status() != WL_CONNECTED) {
    delay(1000);
    Serial.println("Establishing connection to WiFi..");
  }

  // Init ESP-NOW
  if (esp_now_init() != ESP_OK) {
    Serial.println("Error initializing ESP-NOW");
    return;
  }
  
  pinMode(15, OUTPUT);
  

  // Register peer
  populate_worker_infos();
  
  for (int i = 0; i < numWorkers; i++) {
    // Add peer        
    if (esp_now_add_peer(&workers[i].info) != ESP_OK){
      Serial.println("Failed to add peer");
      return;
    }else{
      Serial.println("Succesfully added peer");
    }
  }
  

  // Register for a callback function that will be called when data is received
  esp_now_register_recv_cb(OnDataRecv);
  esp_now_register_send_cb(OnDataSent);
}

void populate_worker_infos () {
    set_mac_bytes(workers[0].address, 0x10, 0x97, 0xBD, 0xD4, 0x3E, 0xAC);
    memcpy(workers[0].info.peer_addr, workers[0].address, 6);
    workers[0].info.channel = 11;  
    workers[0].info.encrypt = false;
    set_mac_bytes(workers[1].address, 0x10, 0x97, 0xBD, 0xD4, 0x36, 0x94);
    memcpy(workers[1].info.peer_addr, workers[1].address, 6);
    workers[1].info.channel = 11;  
    workers[1].info.encrypt = false;
    set_mac_bytes(workers[2].address, 0x10, 0x97, 0xBD, 0xD5, 0x69, 0xF0);
    memcpy(workers[2].info.peer_addr, workers[2].address, 6);
    workers[2].info.channel = 11;  
    workers[2].info.encrypt = false;
}

void set_mac_bytes(uint8_t arr[6], uint8_t b0, uint8_t b1, uint8_t b2, uint8_t b3, uint8_t b4, uint8_t b5) {
  arr[0] = b0;
  arr[1] = b1;
  arr[2] = b2;
  arr[3] = b3;
  arr[4] = b4;
  arr[5] = b5;
}

int32_t getWiFiChannel(const char *ssid) {
  if (int32_t n = WiFi.scanNetworks()) {
      for (uint8_t i=0; i<n; i++) {
          if (!strcmp(ssid, WiFi.SSID(i).c_str())) {
              return WiFi.channel(i);
          }
      }
  }
  return 0;
}

void onConnectionEstablished()
{
}

worker_info get_worker_info(const uint8_t* mac) {
  for (int i = 0; i < numWorkers; i++) {
    bool anyFalse = false;
    for (int j = 0; j < 6; j++) {
      if (mac[j] != workers[i].address[j]) {
        anyFalse = true;
      }
    }
    if (anyFalse == false) {
      return workers[i];
    }
  }
  return null_worker;
}

void set_worker_setting(int setting, int workerIndex, float value) {
  settingMessage.type = Setting;
  settingMessage.setting = setting;
  settingMessage.newValue = value;
  send_message(workers[workerIndex].address, (uint8_t *)&settingMessage, sizeof(settingMessage));
}

String get_topic(const String collection, const String gatewayMac, const String workerMac, const String subject) {
  return collection + "/" + gatewayMac + "/" + workerMac + "/" + subject;
}

String get_topic(const String collection, const uint8_t* mac, const String subject) {
  return get_topic(collection, String(WiFi.macAddress()), mac_to_string(mac), subject);
}

String get_topic(const String collection, const String subject) {
    return collection + "/" + String(WiFi.macAddress()) + "/" + subject;
}

void loop() {
  client.loop();
}

void OnDataSent(const uint8_t *mac_addr, esp_now_send_status_t status) {
  messageSuccess = status == ESP_NOW_SEND_SUCCESS;
  Serial.println("Send message status: " + String(status == ESP_NOW_SEND_SUCCESS ? "success" : "failure"));
}

void OnDataRecv(const uint8_t * mac, const uint8_t *incomingData, int len) {  
  memcpy(&baseMessage, incomingData, sizeof(baseMessage));
  
  switch (baseMessage.type) {
    case Ping:
      handle_ping(mac, incomingData, len);
      break;
    case Sample:
      handle_sample(mac, incomingData, len);
      break;
  }
}

void print_mac(const uint8_t* mac) {
  Serial.println(mac_to_string(mac));
}

String mac_to_string(const uint8_t* mac) {
  String result = "";
  for (int i = 0; i < 6; i++) {
    result += hex8_to_string(mac[i]);
    if (i != 6 - 1) {
      result += ":";
    }
  }
  return result;
}

String hex8_to_string(uint8_t data) // prints 8-bit data in hex with leading zeroes
{
  String result = "";
  if (data < 0x10) { result = result + "0"; }
  result += String(data ,HEX);
  result.toUpperCase();
  return result;
}

void handle_ping(const uint8_t* mac, const uint8_t *incomingData, int len) {
  Serial.print("Ping recieved from ");
  print_mac(mac);
  Serial.println("");

  client.publish(get_topic("logs", mac, "ping"), String(millis()));
}

void handle_sample(const uint8_t* mac, const uint8_t *incomingData, int len) {
  memcpy(&sampleMessage, incomingData, sizeof(sampleMessage));
  
  Serial.print("Sample recieved from ");
  print_mac(mac);
  Serial.println("");
  
  if (!isnan(sampleMessage.Worker_1_th_temperature)) {
    client.publish(get_topic("samples", mac, "th,temperature"), String(sampleMessage.Worker_1_th_temperature));
  }
  if (!isnan(sampleMessage.Worker_1_th_humidity)) {
    client.publish(get_topic("samples", mac, "th,humidity"), String(sampleMessage.Worker_1_th_humidity));
  }
  if (!isnan(sampleMessage.Worker_2_th_temperature)) {
    client.publish(get_topic("samples", mac, "th,temperature"), String(sampleMessage.Worker_2_th_temperature));
  }
  if (!isnan(sampleMessage.Worker_2_th_humidity)) {
    client.publish(get_topic("samples", mac, "th,humidity"), String(sampleMessage.Worker_2_th_humidity));
  }
  if (!isnan(sampleMessage.Worker_3_th_temperature)) {
    client.publish(get_topic("samples", mac, "th,temperature"), String(sampleMessage.Worker_3_th_temperature));
  }
  if (!isnan(sampleMessage.Worker_3_th_humidity)) {
    client.publish(get_topic("samples", mac, "th,humidity"), String(sampleMessage.Worker_3_th_humidity));
  }
}

void send_message(const uint8_t * mac, const uint8_t *incomingData, int len) {
  bool success = false;
  for (int i = 0; i < 5; i++) {
    esp_err_t result = esp_now_send(mac, incomingData, len);
    delay((uint64_t)500.0);
    if (messageSuccess) {
      success = true;
      break;
    }
  }
  Serial.println("Send message success: " + String(success));
  digitalWrite(15, success ? LOW : HIGH);
}
