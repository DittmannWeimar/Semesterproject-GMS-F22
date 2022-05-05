package dk.sdu.gms.dds

import dk.sdu.gms.dds.deviceDefinition.Gateway
import java.util.ArrayList
import dk.sdu.gms.dds.deviceDefinition.Sensor
import dk.sdu.gms.dds.deviceDefinition.Actuator
import dk.sdu.gms.dds.deviceDefinition.Setting
import dk.sdu.gms.dds.deviceDefinition.Worker
import dk.sdu.gms.dds.deviceDefinition.Device
import dk.sdu.gms.dds.deviceDefinition.SensorOutput
import dk.sdu.gms.dds.sensors.SensorDefinition
import dk.sdu.gms.dds.deviceDefinition.Expression
import dk.sdu.gms.dds.deviceDefinition.TimeUnit
import dk.sdu.gms.dds.deviceDefinition.Second
import dk.sdu.gms.dds.deviceDefinition.Minute
import dk.sdu.gms.dds.deviceDefinition.Hour
import dk.sdu.gms.dds.deviceDefinition.Plus
import dk.sdu.gms.dds.deviceDefinition.Minus
import dk.sdu.gms.dds.deviceDefinition.Mult
import dk.sdu.gms.dds.deviceDefinition.Div
import dk.sdu.gms.dds.deviceDefinition.Parenthesis
import dk.sdu.gms.dds.deviceDefinition.VariableUse
import dk.sdu.gms.dds.deviceDefinition.Primitive
import dk.sdu.gms.dds.deviceDefinition.ExternalCall
import dk.sdu.gms.dds.deviceDefinition.Greater
import dk.sdu.gms.dds.deviceDefinition.Lesser
import dk.sdu.gms.dds.deviceDefinition.GreaterOrEquals
import dk.sdu.gms.dds.deviceDefinition.LesserOrEquals
import dk.sdu.gms.dds.deviceDefinition.Equals
import dk.sdu.gms.dds.deviceDefinition.NotEquals
import dk.sdu.gms.dds.deviceDefinition.And
import dk.sdu.gms.dds.deviceDefinition.Or
import dk.sdu.gms.dds.deviceDefinition.DecimalPrimitive
import dk.sdu.gms.dds.deviceDefinition.IntPrimitive
import dk.sdu.gms.dds.deviceDefinition.BooleanTrue
import dk.sdu.gms.dds.deviceDefinition.BooleanFalse
import dk.sdu.gms.dds.deviceDefinition.InternalVariableUse
import dk.sdu.gms.dds.deviceDefinition.ExternalVariableUse
import dk.sdu.gms.dds.deviceDefinition.Value
import java.util.List
import dk.sdu.gms.dds.deviceDefinition.Pin
import dk.sdu.gms.dds.deviceDefinition.GenericOut
import dk.sdu.gms.dds.deviceDefinition.ADC
import dk.sdu.gms.dds.deviceDefinition.GenericIn
import java.util.Arrays

class Utils {
	
	public static int[] dacPins = #[25, 26]
	
	public static def createSettingIndex (Gateway gateway) {
		val list = new ArrayList<String>();
		for (worker : gateway.workers) {
			val settingList = worker.settings;
			for (setting : settingList) {
				list.add(setting.bindingName);
			}
		}
		return list;
	}
	
	public static def indexOfSetting(Setting setting) {
		return createSettingIndex(setting.device.worker.gateway).indexOf(setting.bindingName);
	}
	
	public static def settings(Worker worker) {
		val list = new ArrayList<Setting>();
		for (device : worker.devices) {
			if (device instanceof Sensor) {
				for (setting : device.settings) {
					list.add(setting);
				}
			}
			if (device instanceof Actuator) {
				for (setting : device.settings) {
					list.add(setting);
				}
			}
		}
		return list;
	}
	
	public static def sensor(SensorOutput output) {
		output.eContainer as Sensor;
	}
	
	public static def device(Setting setting) {
		setting.eContainer as Device;
	}
	
	public static def worker(Device device) {
		device.eContainer as Worker;
	}
	
	public static def gateway(Worker worker) {
		worker.eContainer as Gateway; 
	}
	
	public static def system (Gateway gateway) {
		return gateway.eContainer as dk.sdu.gms.dds.deviceDefinition.System
	}
	
	public static def indexOf (Gateway gateway, Worker worker) {
		return gateway.workers.indexOf(worker);
	}
	
	public static def macAsBytes(String mac) {
		var bytes = mac.split(':');
		for (var i = 0; i < bytes.length; i++) {
			bytes.set(i, '0x' + bytes.get(i));
		}
		return bytes;
	}
	
	public static def getWorkerSensorOutputs(Gateway gateway) {
		val outputs = new ArrayList<SensorOutput>();
		for (worker: gateway.workers) {
			for (device : worker.devices) {
				if (device instanceof Sensor) {
					for (output: device.outputs) {
						outputs.add(output);
					}
				}
			}
		}
		return outputs;
	}
	
	public static dispatch def getSampleMessageName (SensorOutput output) {
		output.sensor.worker.name + "_" + output.sensor.name + "_" + getOutputName(output.sensor, output)
	}
	
	public static dispatch def getSampleMqttSubject (SensorOutput output) {
		output.sensor.name + "," + getOutputName(output.sensor, output)
	}
	
	public static def getOutputName (Sensor sensor, SensorOutput output) {
		if (output.output === null) {
			val definition = SensorDefinition.getSensorDefinition(sensor);
			if (definition.outputs.length != 1) {
				throw new IllegalArgumentException("Attempted to fetch single output name for sensor with 0 or multiple outputs.")
			}
			return definition.outputs.get(0);
		}else{
			return output.output;
		}
	}
	
	public static def generatePrimitive (Primitive primitive) {
		switch (primitive) {
			DecimalPrimitive: primitive.value.toString()
			IntPrimitive: primitive.value.toString()
			BooleanTrue: 'true'
			BooleanFalse: 'false' 
		}
	}
	
	public static def generateVariableUse (VariableUse variableUse) {
		switch (variableUse) {
			InternalVariableUse: getBindingName(variableUse.ref)
			ExternalVariableUse: getBindingName(variableUse.ref)
		}
	}
	
	public static def String generateExternalCall (ExternalCall call) {
		var index = 0;
		var builder = new StringBuilder();
		
		builder.append(call.func + "(");
		for (arg: call.args) {
			index++;
			builder.append(arg.generateExpression);
			if (index != call.args.size()) {
				builder.append(", ");
			}
		}
		builder.append(")");
		return builder.toString();
	}
	
	public static def generateExpression (Expression exp) {
		switch (exp) {
			Plus: exp.left.generateExpression + " + " + exp.right.generateExpression
			Minus: exp.left.generateExpression + " - " + exp.right.generateExpression
			Mult: exp.left.generateExpression + " * " + exp.right.generateExpression
			Div: exp.left.generateExpression + " / " + exp.right.generateExpression
			Greater: exp.left.generateExpression + " > " + exp.right.generateExpression
			Lesser: exp.left.generateExpression + " < " + exp.right.generateExpression
			GreaterOrEquals: exp.left.generateExpression + " >= " + exp.right.generateExpression
			LesserOrEquals: exp.left.generateExpression + " <= " + exp.right.generateExpression
			Equals: exp.left.generateExpression + " == " + exp.right.generateExpression
			NotEquals: exp.left.generateExpression + " != " + exp.right.generateExpression
			And: exp.left.generateExpression + " && " + exp.right.generateExpression
			Or: exp.left.generateExpression + " || " + exp.right.generateExpression
			Parenthesis: "(" + exp.exp.generateExpression + ")"
			VariableUse: exp.generateVariableUse
			Primitive: exp.generatePrimitive
			ExternalCall: exp.generateExternalCall
			Value: 'value'
		}
	}
	
	public static dispatch def getBindingName (SensorOutput output) {
		getVariablePrefix(sensor(output)) + getOutputName(sensor(output), output);
	}
	
	public static dispatch def getBindingName (Setting setting) {
		getVariablePrefix(setting) + setting.name;
	}
	
	public static dispatch def getVariablePrefix (Sensor sensor) {
		sensor.name + "_"
	}
	
	public static dispatch def getVariablePrefix (Actuator actuator) {
		actuator.name + "_"
	}
	
	public static dispatch def getVariablePrefix (Setting setting) {
		val container = setting.eContainer;
		switch (container) {
			Sensor: container.name + "_"
			Actuator: container.name + "_"
		}
	}
	
	public static def getTimeUnitMsMultiplier(TimeUnit unit) {
		switch (unit) {
			Second: 1000
			Minute: 1000 * 60
			Hour: 1000 * 60 * 60
		}
	}
	
	public static def getDacPinVariableName(int pin) 
	'''dacPin«pin»'''
	
	public static def getDacChannelName(int channel)
	'''dacChannel«channel»'''
	
	public static def pinNumberToDacChannel(int pin) {
		return dacPins.indexOf(pin);
	}
		
	public static def generatePinsSetup(List<Pin> pins) '''
	«FOR pin : pins»
	«IF pin.type instanceof ADC || pin.type instanceof GenericIn»
	pinMode(«pin.number», INPUT);
	«ENDIF»
	«IF pin.type instanceof GenericOut»
	pinMode(«pin.number», OUTPUT);
	«ENDIF»
	«ENDFOR»
	'''
	
	public static def findSettingByName (Device device, String name) {
		val settings = switch (device) {
			Sensor: device.settings
			Actuator: device.settings
		}
		for (setting : settings) {
			if (setting.name.equals(name)) {
				return setting;
			}
		}
		return null;
	}
	
	public static def getSettingBindingBySettingName(Device device, String name) {
		return getBindingName(findSettingByName(device, name));
	}
	
	public static def hasSensors (Worker worker) {
		for (device : worker.devices) {
			if (device instanceof Sensor) {
				return true;
			}
		}
		return false;
	}
	
	public static def hasActuators (Worker worker) {
		for (device : worker.devices) {
			if (device instanceof Actuator) {
				return true;
			}
		}
		return false;
	}
}