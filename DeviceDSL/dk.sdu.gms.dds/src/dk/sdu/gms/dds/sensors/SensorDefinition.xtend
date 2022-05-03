package dk.sdu.gms.dds

import dk.sdu.gms.dds.sensors.TemperatureHumiditySensor

abstract class SensorDefinition {
	
	public static SensorDefinition[] Sensors = #[
		new TemperatureHumiditySensor(),
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
	
	public def boolean isSingleOutput () {
		return outputs.length == 1;
	}
	
	public def String generateDirectives()
	
	public def String generateInitializers (String variablePrefix, int[] pins)
	
	public def String generateSetup (String variablePrefix, int[] pins) 
	
	public def String generateLoop (String variablePredix, int[] pins)
}