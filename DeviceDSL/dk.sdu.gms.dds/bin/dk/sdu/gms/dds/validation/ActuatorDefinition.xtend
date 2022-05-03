package dk.sdu.gms.dds.validation

class ActuatorDefinition {
	
	public static ActuatorDefinition[] Actuators = #[
		new ActuatorDefinition("LED", 1, "brightness"),
		new ActuatorDefinition("Pump", 1, "power")
	];
	
	public static def ActuatorDefinition getDefinition(String name) {
		for (s: Actuators) {
			if (s.name == name) {
				return s;
			}
		}
		return null;
	}
	
	public String name;
	public int pinCount;
	public String[] requiredSettings;
	
	new(String _name, int _pinCount, String... _requiredSettings) {
		this.name = _name;
		this.pinCount = _pinCount;
		this.requiredSettings = _requiredSettings;
	}
}