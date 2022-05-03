package dk.sdu.gms.dds.sensors

import dk.sdu.gms.dds.deviceDefinition.Sensor
import dk.sdu.gms.dds.deviceDefinition.SensorOutput
import static dk.sdu.gms.dds.Utils.*

class TemperatureHumiditySensor extends SensorDefinition {
	
	new () {
		type = "TemperatureHumidity";
		pinCount = 1;
		outputs = #["temperature", "humidity"]
	}
	
	override generateDirectives() '''
	#include "DHT.h"
	#define DHTTYPE DHT11
	'''
	
	override generateInitializers(Sensor sensor) '''
	DHT «getVariablePrefix(sensor)»dht(«sensor.pins.get(0)», DHTTYPE);
	«super.generateInitializers(sensor)»
	'''
	
	override generateSetup(Sensor sensor) '''
	«getVariablePrefix(sensor)»dht.begin();
	Serial.println("DHT sensor initialized!");
	'''
	
	override getSampleCode(Sensor sensor, SensorOutput output) {
		switch (getSampleType(sensor, output)) {
			case "temperature": '''«getVariablePrefix(sensor)»dht.readTemperature()'''
			case "humidity": '''«getVariablePrefix(sensor)»dht.readHumidity()'''
		}
	}
}