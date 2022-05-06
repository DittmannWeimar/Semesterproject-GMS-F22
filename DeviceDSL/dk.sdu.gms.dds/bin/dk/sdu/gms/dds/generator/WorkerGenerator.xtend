package dk.sdu.gms.dds.generator

import dk.sdu.gms.dds.deviceDefinition.Worker
import org.eclipse.xtext.generator.IFileSystemAccess2
import static dk.sdu.gms.dds.Utils.*
import dk.sdu.gms.dds.DeviceDefinition
import java.util.ArrayList

public class WorkerGenerator {
	
	public static def generateWorker(Worker worker, IFileSystemAccess2 fsa) {
		fsa.generateFile(worker.mac.replace(':', '') + "/" + worker.mac.replace(':', '') + ".ino", generateCode(worker));
	}
	
	public static def generateCode (Worker worker) '''
	#include <esp_now.h>
	#include <esp_wifi.h>
	#include <WiFi.h>
	#include <Wire.h>
		
	// GENERATED DIRECTIVES
	�FOR device : worker.devices�
	�val generatedDirectives = new ArrayList<Class<?>>()�
	�IF !generatedDirectives.contains(device.getClass())�
	�DeviceDefinition.getDefinition(device).generateDirectives()�	
	�{ generatedDirectives.add(device.getClass()); "" /* lol gross */ }�
	�ENDIF�
	�ENDFOR�
	�val bytes = macAsBytes(gateway(worker).mac)�
	uint8_t gatewayAddress[] = {�bytes.get(0)�, �bytes.get(1)�, �bytes.get(2)�, �bytes.get(3)�, �bytes.get(4)�, �bytes.get(5)�};
	esp_now_peer_info_t gatewayInfo;
	
	enum MESSAGE_TYPE { Ping, Setting, Sample };
	
	// GENERATED SETTINGS
	�FOR setting : settings(worker)�
	float �getBindingName(setting)� = �generateExpression(setting.value)�;
	�ENDFOR�
	
	// GENERATED INITIALIZATIONS
	�FOR device : worker.devices�
	�DeviceDefinition.getDefinition(device).generateInitializers(device)�
	�ENDFOR�
	
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
	  
	  �FOR i : 0 ..< dacPins.length�
	  ledcSetup(�i�, freq, resolution);
	  ledcAttachPin(�dacPins.get(i)�, �i�);
	  pinMode(�dacPins.get(i)�, OUTPUT);
	  �ENDFOR�
	 
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
		�FOR device : worker.devices�
	  	�DeviceDefinition.getDefinition(device).generateSetup(device)�
	  	�ENDFOR�
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
		�FOR output: getWorkerSensorOutputs(gateway(worker))�
		float �getSampleMessageName(output)�;
		�ENDFOR�
	} message_sample;
	message_sample sampleMessage;

	void loop() {
	  // put your main code here, to run repeatedly:
	  �FOR output: getWorkerSensorOutputs(gateway(worker))�
	  sampleMessage.�getSampleMessageName(output)� = 1.0 / 0.0;
	  �ENDFOR�
	  
	  float value = 0;
	  
	  �FOR device : worker.devices�
	  �DeviceDefinition.getDefinition(device).generateLoop(device)�
	  �ENDFOR�
	  
	  �IF hasSensors(worker)�
	  sampleMessage.type = Sample;
	  send_message(gatewayAddress, (uint8_t *) &sampleMessage, sizeof(sampleMessage));
	  �ENDIF�
	  delay(�worker.sleepTime * getTimeUnitMsMultiplier(worker.timeUnit)�);
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
	  �FOR setting : settings(worker)�
	  if (settingMessage.setting == �indexOfSetting(setting)�) {
	  	�getBindingName(setting)� = settingMessage.newValue;
	  }
	  �ENDFOR�
	}
	
	void send_message(const uint8_t * mac, const uint8_t *incomingData, int len) {
	  esp_err_t result = esp_now_send(mac, incomingData, len);
	}'''
}