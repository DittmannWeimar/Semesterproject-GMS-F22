package dk.sdu.gms.dds.sensors;

import dk.sdu.gms.dds.Utils;
import dk.sdu.gms.dds.deviceDefinition.Sensor;
import dk.sdu.gms.dds.deviceDefinition.SensorOutput;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TemperatureHumiditySensor extends SensorDefinition {
  public TemperatureHumiditySensor() {
    this.type = "TemperatureHumidity";
    this.pinCount = 1;
    this.outputs = new String[] { "temperature", "humidity" };
  }
  
  @Override
  public CharSequence generateDirectives() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateDirectives = super.generateDirectives();
    _builder.append(_generateDirectives);
    _builder.newLineIfNotEmpty();
    _builder.append("#include \"DHT.h\"");
    _builder.newLine();
    _builder.append("#define DHTTYPE DHT11");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence generateInitializers(final Sensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateInitializers = super.generateInitializers(sensor);
    _builder.append(_generateInitializers);
    _builder.newLineIfNotEmpty();
    _builder.append("DHT ");
    String _variablePrefix = Utils.getVariablePrefix(sensor);
    _builder.append(_variablePrefix);
    _builder.append("dht(");
    int _number = sensor.getPins().get(0).getNumber();
    _builder.append(_number);
    _builder.append(", DHTTYPE);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generateSetup(final Sensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateSetup = super.generateSetup(sensor);
    _builder.append(_generateSetup);
    _builder.newLineIfNotEmpty();
    String _variablePrefix = Utils.getVariablePrefix(sensor);
    _builder.append(_variablePrefix);
    _builder.append("dht.begin();");
    _builder.newLineIfNotEmpty();
    _builder.append("Serial.println(\"DHT sensor initialized!\");");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence getSampleCode(final Sensor sensor, final SensorOutput output) {
    CharSequence _switchResult = null;
    String _sampleType = this.getSampleType(sensor, output);
    if (_sampleType != null) {
      switch (_sampleType) {
        case "temperature":
          StringConcatenation _builder = new StringConcatenation();
          String _variablePrefix = Utils.getVariablePrefix(sensor);
          _builder.append(_variablePrefix);
          _builder.append("dht.readTemperature()");
          _switchResult = _builder;
          break;
        case "humidity":
          StringConcatenation _builder_1 = new StringConcatenation();
          String _variablePrefix_1 = Utils.getVariablePrefix(sensor);
          _builder_1.append(_variablePrefix_1);
          _builder_1.append("dht.readHumidity()");
          _switchResult = _builder_1;
          break;
      }
    }
    return _switchResult;
  }
}
