package dk.sdu.gms.dds.sensors

import dk.sdu.gms.dds.SensorDefinition

class TemperatureHumiditySensor extends SensorDefinition {
	
	new () {
		name = "TemperatureHunidity";
		pinCount = 1;
		outputs = #["temperature", "humidity"]
	}
	
	override generateDirectives() '''
	#include "DHT.h"
	#define DHTTYPE DHT11   // DHT 11
	'''
	
	override generateInitializers(String variablePrefix, int[] pins) '''
		
	'''
	
	override generateSetup(String variablePrefix, int[] pins) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override generateLoop(String variablePredix, int[] pins) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}