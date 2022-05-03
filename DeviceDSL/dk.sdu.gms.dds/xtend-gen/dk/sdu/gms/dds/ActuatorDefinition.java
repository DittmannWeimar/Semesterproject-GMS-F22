package dk.sdu.gms.dds;

import com.google.common.base.Objects;
import dk.sdu.gms.dds.deviceDefinition.Actuator;
import dk.sdu.gms.dds.deviceDefinition.Device;

@SuppressWarnings("all")
public class ActuatorDefinition extends DeviceDefinition {
  public static ActuatorDefinition[] Actuators = new ActuatorDefinition[] { new ActuatorDefinition("LED", 1, "brightness"), new ActuatorDefinition("Pump", 1, "power") };
  
  public static ActuatorDefinition getActuatorDefinition(final Actuator actuator) {
    for (final ActuatorDefinition s : ActuatorDefinition.Actuators) {
      String _type = actuator.getType();
      boolean _equals = Objects.equal(s.type, _type);
      if (_equals) {
        return s;
      }
    }
    return null;
  }
  
  public String type;
  
  public int pinCount;
  
  public String[] requiredSettings;
  
  public ActuatorDefinition(final String _name, final int _pinCount, final String... _requiredSettings) {
    this.type = _name;
    this.pinCount = _pinCount;
    this.requiredSettings = _requiredSettings;
  }
  
  @Override
  public CharSequence generateDirectives() {
    return null;
  }
  
  @Override
  public CharSequence generateInitializers(final Device device) {
    return null;
  }
  
  @Override
  public CharSequence generateSetup(final Device device) {
    return null;
  }
  
  @Override
  public CharSequence generateLoop(final Device device) {
    return null;
  }
}
