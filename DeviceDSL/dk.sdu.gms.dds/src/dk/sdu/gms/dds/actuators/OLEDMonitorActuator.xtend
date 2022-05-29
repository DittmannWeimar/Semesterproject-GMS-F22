package dk.sdu.gms.dds.actuators

import dk.sdu.gms.dds.actuators.ActuatorDefinition
import dk.sdu.gms.dds.deviceDefinition.Actuator
import static dk.sdu.gms.dds.Utils.*
import dk.sdu.gms.dds.deviceDefinition.Sensor
import java.util.ArrayList
import java.util.stream.Collectors

class OLEDMonitorActuator extends ActuatorDefinition {
	
	new () {
		type = "OLED";
		pinCount = 4;
		requiredPinIds = #["MOSI", "CLK", "DC", "RST", "CS"]
	}
	
	override generateDirectives() '''
	#include <Adafruit_GFX.h>
	#include <Adafruit_SH110X.h>
	'''
	override generateInitializers (Actuator actuator) {
		
		val mosi = getPinById(actuator.pins, "MOSI").number;
		val clk = getPinById(actuator.pins, "CLK").number;
		val dc = getPinById(actuator.pins, "DC").number;
		val rst = getPinById(actuator.pins, "RST").number;
		val cs = getPinById(actuator.pins, "CS").number;
		
		return '''
		Adafruit_SH1106G «getVariablePrefix(actuator)»display = Adafruit_SH1106G(128, 64, «mosi», «clk», «dc», «rst», «cs»);
		'''
	}
	
	
	override generateSetup (Actuator actuator) {
		'''
		«getVariablePrefix(actuator)»display.begin(0, true);
		«getVariablePrefix(actuator)»display.display();
		delay(2000);
		«getVariablePrefix(actuator)»display.clearDisplay();
		'''
	}
	
	override generateLoop (Actuator actuator) {
		
		val thisIndex = worker(actuator).devices.indexOf(actuator);
		val temp = new ArrayList(worker(actuator).devices);
		
		val prevSensor = temp.stream.filter(x | x instanceof Sensor).filter(x | worker(actuator).devices.indexOf(x) < thisIndex).findFirst().orElse(null) as Sensor;
		val outputBindings = prevSensor.outputs.stream.map(x | getBindingName(x)).collect(Collectors.toList());
		
		return '''
		«getVariablePrefix(actuator)»display.clearDisplay();
		«getVariablePrefix(actuator)»display.setTextSize(2);
		«getVariablePrefix(actuator)»display.setTextColor(SH110X_WHITE);
		«FOR binding : outputBindings»
		«getVariablePrefix(actuator)»display.setCursor(0, «outputBindings.indexOf(binding)»);
		«getVariablePrefix(actuator)»display.print("«getOutputName(prevSensor, prevSensor.outputs.get(outputBindings.indexOf(binding))).substring(0, 4)»");
		«getVariablePrefix(actuator)»display.setCursor(60, «outputBindings.indexOf(binding)»);
		«getVariablePrefix(actuator)»display.print(«binding»);
		«ENDFOR»
		«getVariablePrefix(actuator)»display.display();
		'''
	}
	
	override generateEnableActuatorCode(Actuator actuator, CharSequence enabledBoolString) {
	}
}