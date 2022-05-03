package dk.sdu.gms.dds;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public abstract class SensorDefinition {
  public static SensorDefinition[] Sensors /* Skipped initializer because of errors */;
  
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
  
  public boolean isSingleOutput() {
    int _length = this.outputs.length;
    return (_length == 1);
  }
  
  public abstract String generateDirectives();
  
  public abstract String generateInitializers(final String variablePrefix, final int[] pins);
  
  public abstract String generateSetup(final String variablePrefix, final int[] pins);
  
  public abstract String generateLoop(final String variablePredix, final int[] pins);
}
