package dk.sdu.gms.dds.actuators

import dk.sdu.gms.dds.deviceDefinition.Device
import dk.sdu.gms.dds.deviceDefinition.Actuator
import dk.sdu.gms.dds.DeviceDefinition
import static dk.sdu.gms.dds.Utils.*
import dk.sdu.gms.dds.deviceDefinition.Expression
import dk.sdu.gms.dds.deviceDefinition.Trigger
import dk.sdu.gms.dds.deviceDefinition.When
import dk.sdu.gms.dds.deviceDefinition.OnOff

abstract class ActuatorDefinition extends DeviceDefinition {
	
	public static ActuatorDefinition[] Actuators = #[
		new GenericActuator()
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
	
	override generateDirectives() {
	}
	
	override generateInitializers(Device device) {
		generateInitializers(device as Actuator);
	}
	protected def CharSequence generateInitializers(Actuator actuator)'''
	bool «getEnabledVariableName(actuator)» = false;
	'''
	
	override generateSetup(Device device) {
		generateSetup (device as Actuator);
	}
	protected def CharSequence generateSetup(Actuator actuator) '''
		«generatePinsSetup(actuator.pins)»
	'''
	
	override generateLoop(Device device) {
		generateLoop(device as Actuator);
	}
	
	protected def CharSequence generateLoop(Actuator actuator) '''
	«actuator.generateCheckLoop»
	«actuator.generateEnableActuatorCode(getEnabledVariableName(actuator))»
	«IF isTimed(actuator.trigger)»
	if («getEnabledVariableName(actuator)») {
	  «getTimerName(actuator)» = current_time;
	}
	«ENDIF»
	'''
	
	protected def generateCheckLoop (Actuator actuator) {
		val trigger = actuator.trigger;
		switch (trigger) {
			When: generateWhenLoop(trigger.exp, actuator)
			OnOff: {
				val isTimed = isTimed(trigger);
				if (isTimed) {
					generateWhenLoop(trigger.onExp, actuator)
				}else{
					trigger.generateOnOffLoop(actuator)					
				}
			} 
		}
	}
	
	protected def generateWhenLoop (Expression whenExp, Actuator actuator) '''
	«getEnabledVariableName(actuator)» = (bool)(«generateExpression(whenExp)»);
	'''
	
	protected def generateOnOffLoop (OnOff onOff, Actuator actuator) '''
	if («getEnabledVariableName(actuator)» == false && (bool)(«generateExpression(onOff.onExp)»)) {
		«getEnabledVariableName(actuator)» = true;
	}
	'''
	
	public def CharSequence generateEnableActuatorCode (Actuator actuator, CharSequence enabledBoolString)
	
}