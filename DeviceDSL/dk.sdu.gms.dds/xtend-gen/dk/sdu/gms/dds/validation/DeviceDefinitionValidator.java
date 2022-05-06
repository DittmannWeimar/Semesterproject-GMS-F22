/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.validation;

import com.google.common.base.Objects;
import dk.sdu.gms.dds.DeviceDefinition;
import dk.sdu.gms.dds.actuators.ActuatorDefinition;
import dk.sdu.gms.dds.deviceDefinition.Actuator;
import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage;
import dk.sdu.gms.dds.deviceDefinition.ExternalVariableUse;
import dk.sdu.gms.dds.deviceDefinition.Graph;
import dk.sdu.gms.dds.deviceDefinition.GraphVariableUse;
import dk.sdu.gms.dds.deviceDefinition.InternalVariableUse;
import dk.sdu.gms.dds.deviceDefinition.Sensor;
import dk.sdu.gms.dds.deviceDefinition.VariableUse;
import dk.sdu.gms.dds.sensors.SensorDefinition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DeviceDefinitionValidator extends AbstractDeviceDefinitionValidator {
  @Check
  public void deviceExists(final Device device) {
    final DeviceDefinition definition = DeviceDefinition.getDefinition(device);
    if ((definition == null)) {
      String _type = device.getType();
      String _plus = ("Unknown device \"" + _type);
      String _plus_1 = (_plus + "\"");
      this.error(_plus_1, DeviceDefinitionPackage.Literals.DEVICE__TYPE);
    }
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
  
  @Check
  public void checkGraphVariableUse(final VariableUse use) {
    final boolean hgp = this.hasGraphParent(use);
    boolean _matched = false;
    if (use instanceof InternalVariableUse) {
      _matched=true;
      if (hgp) {
        this.error("Can only reference worker variables from the same worker.", DeviceDefinitionPackage.Literals.VARIABLE_USE__REF);
      }
    }
    if (!_matched) {
      if (use instanceof ExternalVariableUse) {
        _matched=true;
        if (hgp) {
          this.error("Can only reference worker variables from the same worker.", DeviceDefinitionPackage.Literals.VARIABLE_USE__REF);
        }
      }
    }
    if (!_matched) {
      if (use instanceof GraphVariableUse) {
        _matched=true;
        if ((!hgp)) {
          this.error("Can only reference other device variables from graphs.", DeviceDefinitionPackage.Literals.VARIABLE_USE__REF);
        }
      }
    }
  }
  
  public boolean hasGraphParent(final EObject obj) {
    EObject current = obj;
    while ((current.eContainer() != null)) {
      {
        current = current.eContainer();
        if ((current instanceof Graph)) {
          return true;
        }
      }
    }
    return false;
  }
}