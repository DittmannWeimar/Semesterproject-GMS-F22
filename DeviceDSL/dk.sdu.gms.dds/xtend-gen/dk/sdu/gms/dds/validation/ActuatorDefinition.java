package dk.sdu.gms.dds.validation;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class ActuatorDefinition {
  public static ActuatorDefinition[] Actuators = new ActuatorDefinition[] { new ActuatorDefinition("LED", 1, "brightness"), new ActuatorDefinition("Pump", 1, "power") };
  
  public static ActuatorDefinition getDefinition(final String name) {
    for (final ActuatorDefinition s : ActuatorDefinition.Actuators) {
      boolean _equals = Objects.equal(s.name, name);
      if (_equals) {
        return s;
      }
    }
    return null;
  }
  
  public String name;
  
  public int pinCount;
  
  public String[] requiredSettings;
  
  public ActuatorDefinition(final String _name, final int _pinCount, final String... _requiredSettings) {
    this.name = _name;
    this.pinCount = _pinCount;
    this.requiredSettings = _requiredSettings;
  }
}
