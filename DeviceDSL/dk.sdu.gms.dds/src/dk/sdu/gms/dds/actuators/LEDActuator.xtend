package dk.sdu.gms.dds.actuators

import dk.sdu.gms.dds.deviceDefinition.Actuator
import dk.sdu.gms.dds.deviceDefinition.DAC
import static dk.sdu.gms.dds.Utils.*

class LEDActuator extends ActuatorDefinition {
	
	new() {
		type = "LED";
		pinCount = 1;
		requiredSettings = #["brightness"]
	}
	
	override protected generateEnableActuatorCode(Actuator actuator, CharSequence enabledBoolString) {
		if (actuator.pins.get(0).type instanceof DAC) {
			'''ledcWrite(«pinNumberToDacChannel(actuator.pins.get(0).number)», (float)(«enabledBoolString») * «getSettingBindingBySettingName(actuator, "brightness")»);'''
		}else{
			'''digitalWrite(«actuator.pins.get(0).number», «enabledBoolString»);'''
		}		
	}
}