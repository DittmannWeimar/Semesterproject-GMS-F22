package dk.sdu.gms.dds.sensors

import dk.sdu.gms.dds.deviceDefinition.Sensor
import dk.sdu.gms.dds.deviceDefinition.SensorOutput

class DummySensor extends SensorDefinition {
	
	new () {
		type = "Dummy";
		pinCount = 0;
		outputs = #["zero"];
	}
	
	override getSampleCode(Sensor sensor, SensorOutput output) {
		"0"
	}
	
}