package dk.sdu.gms.dds.validation;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class SensorDefinition {
  public static SensorDefinition[] Sensors = new SensorDefinition[] { new SensorDefinition("TemperatureHumidity", 1, "temperature", "humidity"), new SensorDefinition("Moisture", 1, "moisture") };
  
  public static SensorDefinition getDefinition(final String name) {
    for (final SensorDefinition s : SensorDefinition.Sensors) {
      boolean _equals = Objects.equal(s.name, name);
      if (_equals) {
        return s;
      }
    }
    return null;
  }
  
  public String name;
  
  public int pinCount;
  
  public String[] outputs;
  
  public SensorDefinition(final String _name, final int _pinCount, final String... _outputs) {
    this.name = _name;
    this.pinCount = _pinCount;
    this.outputs = this.outputs;
  }
  
  public boolean IsSingleOutput() {
    int _length = this.outputs.length;
    return (_length == 1);
  }
}
