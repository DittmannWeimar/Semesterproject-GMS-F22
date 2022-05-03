package dk.sdu.gms.dds

import dk.sdu.gms.dds.deviceDefinition.Device
import dk.sdu.gms.dds.sensors.SensorDefinition
import dk.sdu.gms.dds.deviceDefinition.Sensor
import dk.sdu.gms.dds.deviceDefinition.Actuator

public abstract class DeviceDefinition {
	
	public static def DeviceDefinition getDefinition(Device device) {
		switch (device) {
			Sensor: SensorDefinition.getSensorDefinition(device as Sensor)
			Actuator: ActuatorDefinition.getActuatorDefinition(device as Actuator)
		}
	}
	
	public def CharSequence generateDirectives()
		
	public def CharSequence generateInitializers(Device device)
			
	public def CharSequence generateSetup(Device device)
				
	public def CharSequence generateLoop(Device device)
}