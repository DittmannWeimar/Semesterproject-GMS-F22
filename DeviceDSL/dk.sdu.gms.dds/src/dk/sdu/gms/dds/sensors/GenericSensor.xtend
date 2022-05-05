package dk.sdu.gms.dds.sensors

import dk.sdu.gms.dds.deviceDefinition.Sensor
import dk.sdu.gms.dds.deviceDefinition.SensorOutput
import dk.sdu.gms.dds.deviceDefinition.ADC

class GenericSensor extends SensorDefinition {
	
	new () {
		type = "Generic";
		pinCount = 1;
		outputs = #["sample"];
	}
	
	override getSampleCode(Sensor sensor, SensorOutput output) {
		if (sensor.pins.get(0).type instanceof ADC) {
			'''analogRead(«sensor.pins.get(0).number»)'''	
		}else{
			'''digitalRead(«sensor.pins.get(0).number»)'''	
		}
	}
}