package dk.sdu.gms.dds.sensors;

import dk.sdu.gms.dds.deviceDefinition.Sensor;
import dk.sdu.gms.dds.deviceDefinition.SensorOutput;

@SuppressWarnings("all")
public class DummySensor extends SensorDefinition {
  public DummySensor() {
    this.type = "Dummy";
    this.pinCount = 0;
    this.outputs = new String[] { "zero" };
  }
  
  @Override
  public CharSequence getSampleCode(final Sensor sensor, final SensorOutput output) {
    return "0";
  }
}
