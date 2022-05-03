package dk.sdu.gms.dds.validation

class SensorDefinition {
	
	public static SensorDefinition[] Sensors = #[
		new SensorDefinition("TemperatureHumidity", 1, "temperature", "humidity"),
		new SensorDefinition("Moisture", 1, "moisture")
	];
	
	public static def SensorDefinition getDefinition(String name) {
		for (s: Sensors) {
			if (s.name == name) {
				return s;
			}
		}
		return null;
	}
	
	public String name;
	public int pinCount;
	public String[] outputs;
	
	public new(String _name, int _pinCount, String... _outputs) {
		this.name = _name;
		this.pinCount = _pinCount;
		this.outputs = outputs;
	}
	
	public def boolean IsSingleOutput () {
		return outputs.length == 1;
	}
	
}