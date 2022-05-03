/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.validation

import dk.sdu.gms.dds.deviceDefinition.Device
import dk.sdu.gms.dds.deviceDefinition.Actuator
import dk.sdu.gms.dds.deviceDefinition.Sensor
import dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DeviceDefinitionValidator extends AbstractDeviceDefinitionValidator {
	
	@Check
	def deviceExists (Device device) {
		val exists = switch (device) {
			case Actuator: ActuatorDefinition.getDefinition(device.type) !== null
			case Sensor: SensorDefinition.getDefinition(device.type) !== null
		}
		
		if (!exists) {
			//error('Device not defined', DeviceDefinitionPackage.Literals.DEVICE__TYPE)
		}
	}

	@Check // Yes this code is gross, shut up.
	def checkDevicePins (Device device) {
		val hasAllPins = switch (device) {
			case Actuator: device.pins.size() == ActuatorDefinition.getDefinition(device.type).pinCount
			case Sensor: device.pins.size() == SensorDefinition.getDefinition(device.type).pinCount
		}
		
		if (!hasAllPins) {
			switch (device) {
				case Actuator: warning('Device needs ' + ActuatorDefinition.getDefinition(device.type).pinCount + " pins", 
					DeviceDefinitionPackage.Literals.DEVICE__PINS)
				case Sensor: warning('Device needs ' + SensorDefinition.getDefinition(device.type).pinCount + " pins", 
					DeviceDefinitionPackage.Literals.DEVICE__PINS)
			}
		}
	}
	
}
