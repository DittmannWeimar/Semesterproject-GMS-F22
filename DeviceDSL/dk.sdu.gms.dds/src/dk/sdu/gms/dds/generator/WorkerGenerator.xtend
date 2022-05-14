package dk.sdu.gms.dds.generator

import dk.sdu.gms.dds.deviceDefinition.Worker
import org.eclipse.xtext.generator.IFileSystemAccess2
import static dk.sdu.gms.dds.Utils.*
import dk.sdu.gms.dds.DeviceDefinition
import java.util.ArrayList
import java.util.stream.Collectors
import dk.sdu.gms.dds.deviceDefinition.Actuator
import dk.sdu.gms.dds.actuators.ActuatorDefinition
import dk.sdu.gms.dds.deviceDefinition.OnOff
import dk.sdu.gms.dds.sensors.SensorDefinition
import dk.sdu.gms.dds.deviceDefinition.Sensor

public class WorkerGenerator {
	
	public static def generateWorker(Worker worker, IFileSystemAccess2 fsa) {
		fsa.generateFile(system(worker).name + "/" + worker.mac.replace(':', '') + "/" + worker.mac.replace(':', '') + ".ino", generateCode(worker));
	}
	
	public static def generateCode (Worker worker) '''
	#include <esp_now.h>
	#include <esp_wifi.h>
	#include <WiFi.h>
	#include <Wire.h>
		
	// GENERATED DIRECTIVES
	«FOR device : worker.devices»
	«val generatedDirectives = new ArrayList<Class<?>>()»
	«IF !generatedDirectives.contains(device.getClass())»
	«DeviceDefinition.getDefinition(device).generateDirectives()»	
	«{ generatedDirectives.add(device.getClass()); "" /* lol gross */ }»
	«ENDIF»
	«ENDFOR»
	«val bytes = macAsBytes(gateway(worker).mac)»
	uint8_t gatewayAddress[] = {«bytes.get(0)», «bytes.get(1)», «bytes.get(2)», «bytes.get(3)», «bytes.get(4)», «bytes.get(5)»};
	esp_now_peer_info_t gatewayInfo;
	
	enum MESSAGE_TYPE { Ping, Setting, Sample };
	
	// GENERATED SETTINGS
	«FOR setting : settings(worker)»
	float «getBindingName(setting)» = «generateExpression(setting.value)»;
	«ENDFOR»
	
	// GENERATED INITIALIZATIONS
	«FOR device : worker.devices»
	«DeviceDefinition.getDefinition(device).generateInitializers(device)»
	«ENDFOR»
	
	// GENERATED TIMERS
	uint64_t last_loop_time;
	«FOR actuator : getTimedActuators(worker)»
	«IF isTimed(actuator.trigger)»
	uint64_t «getTimerName(actuator)»;
	«ENDIF»
	«ENDFOR»
	
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
	  esp_wifi_set_channel(«gateway(worker).channel», WIFI_SECOND_CHAN_NONE);
	  esp_wifi_set_promiscuous(false);
	 
	  Serial.begin(115200);
	  
	  «FOR i : 0 ..< dacPins.length»
	  ledcSetup(«i», freq, resolution);
	  ledcAttachPin(«dacPins.get(i)», «i»);
	  pinMode(«dacPins.get(i)», OUTPUT);
	  «ENDFOR»
	  
	  pinMode(«getErrorLedOrDefault(worker)», OUTPUT);
	  
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
	  gatewayInfo.channel = «gateway(worker).channel»;  
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
		«FOR device : worker.devices»
	  	«DeviceDefinition.getDefinition(device).generateSetup(device)»
	  	«ENDFOR»
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
		«FOR output: getWorkerSensorOutputs(gateway(worker))»
		float «getSampleMessageName(output)»;
		«ENDFOR»
	} message_sample;
	message_sample sampleMessage;

	void loop() {
	  
	  float value = 0;
	  uint64_t current_time = esp_timer_get_time() / 1000ULL;
	  if (current_time > last_loop_time + «asFloat(worker.sleepTime) * getTimeUnitMsMultiplier(worker.timeUnit)») {
	    
	    «IF hasSensors(worker)»
	    sampleMessage.type = Sample;
	    send_message(gatewayAddress, (uint8_t *) &sampleMessage, sizeof(sampleMessage));
	    «ENDIF»
	    
	   	«FOR output: getWorkerSensorOutputs(gateway(worker))»
	   	sampleMessage.«getSampleMessageName(output)» = 1.0 / 0.0; // This is terrible don't hate me.
	    «ENDFOR»
	    
	   	«FOR device : worker.devices»
	    «DeviceDefinition.getDefinition(device).generateLoop(device)»
	    «ENDFOR»
	    
	    last_loop_time = current_time;
	  }
	  
	  «FOR actuator : worker.devices.stream().filter(x | x instanceof Actuator).map(x | x as Actuator).collect(Collectors.toList())»
	  «IF actuator.trigger instanceof OnOff && isTimed(actuator.trigger)»
	  if (current_time > «getTimerName(actuator)» + «(actuator.trigger as OnOff).time * getTimeUnitMsMultiplier((actuator.trigger as OnOff).unit)» && «getEnabledVariableName(actuator)») {
	    «getEnabledVariableName(actuator)» = false;
	    «ActuatorDefinition.getActuatorDefinition(actuator).generateEnableActuatorCode(actuator, getEnabledVariableName(actuator))»
	  }
	  «ELSEIF actuator.trigger instanceof OnOff»
	  «FOR sensor : getChildrenOfType((actuator.trigger as OnOff).offExp, typeof(Sensor)).stream().filter(x | x !== null).distinct().collect(Collectors.toList())»
	  if («getEnabledVariableName(actuator)») {
	  	«SensorDefinition.getSensorDefinition(sensor).generateLoop(sensor)»
	  }
	  if («getEnabledVariableName(actuator)» == true && (bool)(«generateExpression((actuator.trigger as OnOff).offExp)»)) {
	  	«getEnabledVariableName(actuator)» = false;
	  }
	  «ENDFOR»
	  «ENDIF»
	  «ENDFOR»

	  
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
	  «FOR setting : settings(worker)»
	  if (settingMessage.setting == «indexOfSetting(setting)») {
	  	«getBindingName(setting)» = settingMessage.newValue;
	  }
	  «ENDFOR»
	}
	
	void send_message(const uint8_t * mac, const uint8_t *incomingData, int len) {
	  bool success = false;
	  for (int i = 0; i < «getRetriesOrDefault(worker)»; i++) {
	    esp_err_t result = esp_now_send(mac, incomingData, len);
	    delay((uint64_t)«getRetryDelayOrDefault(worker) * getTimeUnitMsMultiplier(worker.delayTimeUnit)»);
	    if (messageSuccess) {
	      success = true;
	      break;
	    }
	  }
	  Serial.println("Send message success: " + String(success));
	  digitalWrite(«getErrorLedOrDefault(worker)», success ? LOW : HIGH);
	}'''
}