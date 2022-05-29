package dk.sdu.gms.dds;

import dk.sdu.gms.dds.actuators.ActuatorDefinition;
import dk.sdu.gms.dds.deviceDefinition.Actuator;
import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.Sensor;
import dk.sdu.gms.dds.sensors.SensorDefinition;

@SuppressWarnings("all")
public abstract class DeviceDefinition {
  public String type;
  
  public int pinCount;
  
  public String[] requiredPinIds;
  
  public static DeviceDefinition getDefinition(final Device device) {
    DeviceDefinition _switchResult = null;
    boolean _matched = false;
    if (device instanceof Sensor) {
      _matched=true;
      _switchResult = SensorDefinition.getSensorDefinition(((Sensor) device));
    }
    if (!_matched) {
      if (device instanceof Actuator) {
        _matched=true;
        _switchResult = ActuatorDefinition.getActuatorDefinition(((Actuator) device));
      }
    }
    return _switchResult;
  }
  
  public abstract CharSequence generateDirectives();
  
  public abstract CharSequence generateInitializers(final Device device);
  
  public abstract CharSequence generateSetup(final Device device);
  
  public abstract CharSequence generateLoop(final Device device);
}
