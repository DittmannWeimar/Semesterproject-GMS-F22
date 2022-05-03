/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.validation;

import com.google.common.base.Objects;
import dk.sdu.gms.dds.ActuatorDefinition;
import dk.sdu.gms.dds.deviceDefinition.Actuator;
import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage;
import dk.sdu.gms.dds.deviceDefinition.Sensor;
import dk.sdu.gms.dds.sensors.SensorDefinition;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DeviceDefinitionValidator extends AbstractDeviceDefinitionValidator {
  @Check
  public Object deviceExists(final Device device) {
    Object _xblockexpression = null;
    {
      boolean _switchResult = false;
      boolean _matched = false;
      if (Objects.equal(device, Actuator.class)) {
        _matched=true;
        ActuatorDefinition _actuatorDefinition = ActuatorDefinition.getActuatorDefinition(((Actuator) device));
        _switchResult = (_actuatorDefinition != null);
      }
      if (!_matched) {
        if (Objects.equal(device, Sensor.class)) {
          _matched=true;
          SensorDefinition _sensorDefinition = SensorDefinition.getSensorDefinition(((Sensor) device));
          _switchResult = (_sensorDefinition != null);
        }
      }
      final boolean exists = _switchResult;
      Object _xifexpression = null;
      if ((!exists)) {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Check
  public void checkDevicePins(final Device device) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (Objects.equal(device, Actuator.class)) {
      _matched=true;
      int _size = device.getPins().size();
      _switchResult = (_size == ActuatorDefinition.getActuatorDefinition(((Actuator) device)).pinCount);
    }
    if (!_matched) {
      if (Objects.equal(device, Sensor.class)) {
        _matched=true;
        int _size_1 = device.getPins().size();
        _switchResult = (_size_1 == SensorDefinition.getSensorDefinition(((Sensor) device)).pinCount);
      }
    }
    final boolean hasAllPins = _switchResult;
    if ((!hasAllPins)) {
      boolean _matched_1 = false;
      if (Objects.equal(device, Actuator.class)) {
        _matched_1=true;
        this.warning((("Device needs " + Integer.valueOf(ActuatorDefinition.getActuatorDefinition(((Actuator) device)).pinCount)) + " pins"), 
          DeviceDefinitionPackage.Literals.DEVICE__PINS);
      }
      if (!_matched_1) {
        if (Objects.equal(device, Sensor.class)) {
          _matched_1=true;
          this.warning((("Device needs " + Integer.valueOf(SensorDefinition.getSensorDefinition(((Sensor) device)).pinCount)) + " pins"), 
            DeviceDefinitionPackage.Literals.DEVICE__PINS);
        }
      }
    }
  }
}
