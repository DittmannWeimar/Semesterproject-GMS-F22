package dk.sdu.gms.dds

import dk.sdu.gms.dds.deviceDefinition.Device
import dk.sdu.gms.dds.deviceDefinition.Actuator

class ActuatorDefinition extends DeviceDefinition {
	
	public static ActuatorDefinition[] Actuators = #[
		new ActuatorDefinition("LED", 1, "brightness"),
		new ActuatorDefinition("Pump", 1, "power")
	];
	
	public static def ActuatorDefinition getActuatorDefinition(Actuator actuator) {
		for (s: Actuators) {
			if (s.type == actuator.type) {
				return s;
			}
		}
		return null;
	}
	
	public String type;
	public int pinCount;
	public String[] requiredSettings;
	
	new(String _name, int _pinCount, String... _requiredSettings) {
		this.type = _name;
		this.pinCount = _pinCount;
		this.requiredSettings = _requiredSettings;
	}
	
	override generateDirectives() {
	}
	
	override generateInitializers(Device device) {
	}
	
	override generateSetup(Device device) {
	}
	
	override generateLoop(Device device) {
	}
	
}