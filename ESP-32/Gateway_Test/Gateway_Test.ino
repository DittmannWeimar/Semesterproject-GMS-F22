#include <esp_now.h>
#include <WiFi.h>

uint8_t workerAddress[] = {0x10, 0x97, 0xBD, 0xD3, 0x00, 0xBC};
esp_now_peer_info_t workerInfo;

enum MESSAGE_TYPE { Ping, Setting, Sample };
float incomingTemp;
float incomingHum;

const int potentiometerInPin = 34;

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

void setup() {
  // Init Serial Monitor
  Serial.begin(115200);
 
  // Set device as a Wi-Fi Station
  WiFi.mode(WIFI_STA);
  Serial.print("Gateway starting with MAC address ");
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
  memcpy(workerInfo.peer_addr, workerAddress, 6);
  workerInfo.channel = 0;  
  workerInfo.encrypt = false;
  
  // Add peer        
  if (esp_now_add_peer(&workerInfo) != ESP_OK){
    Serial.println("Failed to add peer");
    return;
  }
  // Register for a callback function that will be called when data is received
  esp_now_register_recv_cb(OnDataRecv);

  //pinMode(potentiometerOutPin, OUTPUT);
  pinMode(potentiometerInPin, INPUT);
}

void loop() {
  float p = sample_potentiometer();
  Serial.println(String(p));
  
  set_worker_treshold(p);
  delay(1000);
}

float sample_potentiometer () {
  int sample = analogRead(potentiometerInPin);
  Serial.println(String(sample));
  return sample / 4096.0 * 60;
}

void set_worker_treshold(float treshold) {
  settingMessage.type = Setting;
  settingMessage.setting = 0;
  settingMessage.newValue = treshold;
  send_message(workerAddress, (uint8_t *)&settingMessage, sizeof(settingMessage));
}

void OnDataSent(const uint8_t *mac_addr, esp_now_send_status_t status) {
  Serial.print("Last Packet Send Status:\t");
  Serial.println(status == ESP_NOW_SEND_SUCCESS ? "Delivery Success" : "Delivery Fail");
}

void OnDataRecv(const uint8_t * mac, const uint8_t *incomingData, int len) {  
  memcpy(&baseMessage, incomingData, sizeof(baseMessage));
  
  Serial.print(String(baseMessage.type));
  Serial.print(" message received: ");
  Serial.println(len);
  
  switch (baseMessage.type) {
    case Ping:
      handle_ping(mac, incomingData, len);
      break;
    case Sample:
      handle_sample(mac, incomingData, len);
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
  Serial.println("");
}

void handle_ping(const uint8_t * mac, const uint8_t *incomingData, int len) {
  Serial.print("Ping recieved from ");
  print_mac(mac);
  Serial.println("");
}

void handle_sample(const uint8_t * mac, const uint8_t *incomingData, int len) {
  memcpy(&sampleMessage, incomingData, sizeof(sampleMessage));
  
  Serial.print("Sample recieved from ");
  print_mac(mac);
  Serial.println("");

  incomingTemp = sampleMessage.temp;
  incomingHum = sampleMessage.hum;

  Serial.print("Sample temperature: ");
  Serial.println(String(incomingTemp));

  Serial.print("Sample humidity: ");
  Serial.println(String(incomingHum));
}

void send_message(const uint8_t * mac, const uint8_t *incomingData, int len) {
  Serial.println("Sending message with length " + String(len));
  esp_err_t result = esp_now_send(mac, incomingData, len);
}
