package dk.sdu.gms.dds.actuators

import dk.sdu.gms.dds.deviceDefinition.Actuator
import dk.sdu.gms.dds.deviceDefinition.DAC
import static dk.sdu.gms.dds.Utils.*

class GenericActuator extends ActuatorDefinition {
	
	new() {
		type = "Generic";
		pinCount = 1;
		requiredSettings = #["power"]
	}
	
	override protected generateEnableActuatorCode(Actuator actuator, CharSequence enabledBoolString) {
		if (actuator.pins.get(0).type instanceof DAC) {
			'''ledcWrite(«pinNumberToDacChannel(actuator.pins.get(0).number)», (float)(«enabledBoolString») * «getSettingBindingBySettingName(actuator, "power")»);'''
		}else{
			'''digitalWrite(«actuator.pins.get(0).number», «enabledBoolString»);'''
		}		
	}
}