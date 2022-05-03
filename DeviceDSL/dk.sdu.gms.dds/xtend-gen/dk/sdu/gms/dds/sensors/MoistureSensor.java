package dk.sdu.gms.dds.sensors;

import dk.sdu.gms.dds.deviceDefinition.Sensor;
import dk.sdu.gms.dds.deviceDefinition.SensorOutput;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MoistureSensor extends SensorDefinition {
  public MoistureSensor() {
    this.type = "Moisture";
    this.pinCount = 1;
    this.outputs = new String[] { "moisture" };
  }
  
  @Override
  public CharSequence getSampleCode(final Sensor sensor, final SensorOutput output) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("analogRead(");
    String _pinName = this.getPinName(sensor, (sensor.getPins().get(0)).intValue());
    _builder.append(_pinName);
    _builder.append(")");
    return _builder;
  }
}
