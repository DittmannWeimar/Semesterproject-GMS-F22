package dk.sdu.gms.dds.sensors;

import dk.sdu.gms.dds.SensorDefinition;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TemperatureHumiditySensor extends SensorDefinition {
  public TemperatureHumiditySensor() {
    this.name = "TemperatureHunidity";
    this.pinCount = 1;
    this.outputs = new String[] { "temperature", "humidity" };
  }
  
  @Override
  public String generateDirectives() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include \"DHT.h\"");
    _builder.newLine();
    _builder.append("#define DHTTYPE DHT11   // DHT 11");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String generateInitializers(final String variablePrefix, final int[] pins) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String generateSetup(final String variablePrefix, final int[] pins) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public String generateLoop(final String variablePredix, final int[] pins) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
