package dk.sdu.gms.dds.sensors

import dk.sdu.gms.dds.deviceDefinition.Sensor
import dk.sdu.gms.dds.deviceDefinition.SensorOutput
import dk.sdu.gms.dds.deviceDefinition.ADC

class MoistureSensor extends SensorDefinition {
	
	new () {
		type = "Moisture";
		pinCount = 1;
		outputs = #["moisture"];
	}
	
	override getSampleCode(Sensor sensor, SensorOutput output) {
		if (sensor.pins.get(0) instanceof ADC) {
			'''analogRead(«sensor.pins.get(0).number»)'''	
		}else{
			'''digitalRead(«sensor.pins.get(0).number»)'''	
		}
	}
}