package dk.sdu.gms.dds.sensors

import dk.sdu.gms.dds.deviceDefinition.Sensor
import dk.sdu.gms.dds.deviceDefinition.SensorOutput

class MoistureSensor extends SensorDefinition {
	
	new () {
		type = "Moisture";
		pinCount = 1;
		outputs = #["moisture"];
	}
	
	override getSampleCode(Sensor sensor, SensorOutput output)
	'''analogRead(«getPinName(sensor, sensor.pins.get(0))»)'''
}