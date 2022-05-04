package dk.sdu.gms.dds.sensors;

import dk.sdu.gms.dds.deviceDefinition.ADC;
import dk.sdu.gms.dds.deviceDefinition.Pin;
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
    CharSequence _xifexpression = null;
    Pin _get = sensor.getPins().get(0);
    if ((_get instanceof ADC)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("analogRead(");
      int _number = sensor.getPins().get(0).getNumber();
      _builder.append(_number);
      _builder.append(")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("digitalRead(");
      int _number_1 = sensor.getPins().get(0).getNumber();
      _builder_1.append(_number_1);
      _builder_1.append(")");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
}
