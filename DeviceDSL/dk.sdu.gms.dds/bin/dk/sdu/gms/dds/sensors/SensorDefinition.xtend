package dk.sdu.gms.dds.sensors

import dk.sdu.gms.dds.sensors.TemperatureHumiditySensor
import dk.sdu.gms.dds.deviceDefinition.Sensor
import static dk.sdu.gms.dds.Utils.*
import dk.sdu.gms.dds.deviceDefinition.SensorOutput
import dk.sdu.gms.dds.DeviceDefinition
import dk.sdu.gms.dds.deviceDefinition.Device

abstract class SensorDefinition extends DeviceDefinition {
	
	public static SensorDefinition[] Sensors = #[
		new TemperatureHumiditySensor(),
		new MoistureSensor(),
		new DummySensor()
	];
	
	public static def SensorDefinition getSensorDefinition(Sensor sensor) {
		for (s: Sensors) {
			if (s.type.equals(sensor.type)) {
				return s;
			}
		}
		return null;
	}
	
	public String type;
	public int pinCount;
	public String[] outputs;
	
	public def boolean isSingleOutput () {
		return outputs.length == 1;
	}
	
	public override CharSequence generateDirectives() { }
	
	public override CharSequence generateInitializers (Device device) {
		return generateInitializers(device as Sensor);
	}
	
	public def CharSequence generateInitializers (Sensor sensor) '''
	«FOR pin : sensor.pins»
	int «getPinName(sensor, pin)» = «pin»;
	«ENDFOR»
	«FOR output : sensor.outputs»
	float «getBindingName(output)»;
	«ENDFOR»
	'''
	
	public override CharSequence generateSetup (Device device) {
		return generateSetup(device as Sensor);
	}
	
	public def CharSequence generateSetup (Sensor sensor) { }
	
	public override def CharSequence generateLoop (Device device) {
		return generateLoop(device as Sensor);
	}
	public def CharSequence generateLoop (Sensor sensor) {
		val sampleCode = '''
		«FOR output : sensor.outputs»
			«generateSampleAssignment(sensor, output, getSampleCode(sensor, output))»
			«IF output.mapping !== null»
			«generateMappingExpression(sensor, output)»
			«ENDIF»
			sampleMessage.«getSampleMessageName(output)» = «getBindingName(output)»;
		«ENDFOR»
		'''	
		return generateIfPredicate(sensor, sampleCode);
	}
	
	protected def generateIfPredicate(Sensor sensor, CharSequence content)'''
	«IF sensor.predicate.size() != 0»
	if ((bool)(«generateExpression(sensor.predicate.get(0))»)) {
	«ENDIF»
	«content»
	«IF sensor.predicate.size() != 0»	
	}
	«ENDIF»
	'''
	
	protected def generateSampleAssignment(Sensor sensor, SensorOutput output, CharSequence sampleCode)
	'''«getBindingName(output)» = «sampleCode»;'''
	
	protected def generateMappingExpression(Sensor sensor, SensorOutput output)'''
	value = «getBindingName(output)»;
	«getBindingName(output)» = «generateExpression(output.mapping)»;
	'''
	
	protected def getPinName (Sensor sensor, int pinNumber) {
		sensor.name + "_pin" + pinNumber;
	}
	
	protected def getSampleType (Sensor sensor, SensorOutput output) {
		outputs.get(sensor.outputs.indexOf(output));
	}
	
	public def CharSequence getSampleCode (Sensor sensor, SensorOutput output)
}
