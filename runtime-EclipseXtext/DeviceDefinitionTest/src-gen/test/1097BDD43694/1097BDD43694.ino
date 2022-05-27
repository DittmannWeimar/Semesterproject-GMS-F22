#include <esp_now.h>
#include <esp_wifi.h>
#include <WiFi.h>
#include <Wire.h>
	
// GENERATED DIRECTIVES
#include "DHT.h"
#define DHTTYPE DHT11
uint8_t gatewayAddress[2][6] = {{0x9C, 0x9C, 0x1F, 0xC5, 0xF7, 0xEC}, {0x4C, 0x11, 0xAE, 0xD9, 0x48, 0x14}, };
int preferedIndex = 1;
esp_now_peer_info_t gatewayInfo;

enum MESSAGE_TYPE { Ping, Setting, Sample };

// GENERATED SETTINGS

// GENERATED INITIALIZATIONS
float th_temperature;
float th_humidity;
DHT th_dht(4, DHTTYPE);

// GENERATED TIMERS
uint64_t last_loop_time;

const int freq = 5000;
const int ledChannel = 0;
const int resolution = 8;
const bool scan = true;
const String STATION_NAME = "Gateway";

bool messageSuccess = false;

void setup() {
  WiFi.mode(WIFI_STA);
  WiFi.disconnect();
  
  esp_wifi_set_promiscuous(true);
  esp_wifi_set_channel(11, WIFI_SECOND_CHAN_NONE);
  esp_wifi_set_promiscuous(false);
 
  Serial.begin(115200);
  
  ledcSetup(0, freq, resolution);
  ledcAttachPin(25, 0);
  pinMode(25, OUTPUT);
  ledcSetup(1, freq, resolution);
  ledcAttachPin(26, 1);
  pinMode(26, OUTPUT);
  
  pinMode(15, OUTPUT);
  
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
  gatewayInfo.channel = 11;  
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
	float Worker_1_th_temperature;
	float Worker_1_th_humidity;
	float Worker_2_th_temperature;
	float Worker_2_th_humidity;
	float Worker_3_th_temperature;
	float Worker_3_th_humidity;
} message_sample;
message_sample sampleMessage;

void loop() {
  
  float value = 0;
  uint64_t current_time = esp_timer_get_time() / 1000ULL;
  if (current_time > last_loop_time + 10000.0) {
    
    sampleMessage.type = Sample;
    send_message((uint8_t *) &sampleMessage, sizeof(sampleMessage));
    
   	sampleMessage.Worker_1_th_temperature = 1.0 / 0.0; // This is terrible don't hate me.
   	sampleMessage.Worker_1_th_humidity = 1.0 / 0.0; // This is terrible don't hate me.
   	sampleMessage.Worker_2_th_temperature = 1.0 / 0.0; // This is terrible don't hate me.
   	sampleMessage.Worker_2_th_humidity = 1.0 / 0.0; // This is terrible don't hate me.
   	sampleMessage.Worker_3_th_temperature = 1.0 / 0.0; // This is terrible don't hate me.
   	sampleMessage.Worker_3_th_humidity = 1.0 / 0.0; // This is terrible don't hate me.
    
th_temperature = th_dht.readTemperature();
sampleMessage.Worker_2_th_temperature = th_temperature;
th_humidity = th_dht.readHumidity();
sampleMessage.Worker_2_th_humidity = th_humidity;
    
    last_loop_time = current_time;
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

void handle_setting(const uint8_t * mac, const uint8_t *incomingData, int len) {
  memcpy(&settingMessage, incomingData, sizeof(settingMessage));
}

void send_message(const uint8_t *incomingData, int len) {
  bool success = false;
  for (int i = 0; i < 2; i++){
  	uint8_t* mac = gatewayAddress[(i + preferedIndex) % 2];
  	for (int i = 0; i < 5; i++) {
  		esp_err_t result = esp_now_send(mac, incomingData, len);
  		delay((uint64_t)500.0);
  		if (messageSuccess) {
  			success = true;
  			break;
  		}
  	}
  	if (success){
  		break;
  	}
  }
  Serial.println("Send message success: " + String(success));
  digitalWrite(15, success ? LOW : HIGH);
}