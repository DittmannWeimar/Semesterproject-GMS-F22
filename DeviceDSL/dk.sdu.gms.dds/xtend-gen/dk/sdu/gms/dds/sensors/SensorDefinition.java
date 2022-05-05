package dk.sdu.gms.dds.sensors;

import dk.sdu.gms.dds.DeviceDefinition;
import dk.sdu.gms.dds.Utils;
import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.Expression;
import dk.sdu.gms.dds.deviceDefinition.Sensor;
import dk.sdu.gms.dds.deviceDefinition.SensorOutput;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class SensorDefinition extends DeviceDefinition {
  public static SensorDefinition[] Sensors = new SensorDefinition[] { new TemperatureHumiditySensor(), new GenericSensor(), new DummySensor() };
  
  public static SensorDefinition getSensorDefinition(final Sensor sensor) {
    for (final SensorDefinition s : SensorDefinition.Sensors) {
      boolean _equals = s.type.equals(sensor.getType());
      if (_equals) {
        return s;
      }
    }
    return null;
  }
  
  public String type;
  
  public int pinCount;
  
  public String[] outputs;
  
  public boolean isSingleOutput() {
    int _length = this.outputs.length;
    return (_length == 1);
  }
  
  @Override
  public CharSequence generateDirectives() {
    return null;
  }
  
  @Override
  public CharSequence generateInitializers(final Device device) {
    return this.generateInitializers(((Sensor) device));
  }
  
  public CharSequence generateInitializers(final Sensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<SensorOutput> _outputs = sensor.getOutputs();
      for(final SensorOutput output : _outputs) {
        _builder.append("float ");
        String _bindingName = Utils.getBindingName(output);
        _builder.append(_bindingName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  @Override
  public CharSequence generateSetup(final Device device) {
    return this.generateSetup(((Sensor) device));
  }
  
  public CharSequence generateSetup(final Sensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generatePinsSetup = Utils.generatePinsSetup(sensor.getPins());
    _builder.append(_generatePinsSetup);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generateLoop(final Device device) {
    return this.generateLoop(((Sensor) device));
  }
  
  public CharSequence generateLoop(final Sensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<SensorOutput> _outputs = sensor.getOutputs();
      for(final SensorOutput output : _outputs) {
        CharSequence _generateSampleAssignment = this.generateSampleAssignment(sensor, output, this.getSampleCode(sensor, output));
        _builder.append(_generateSampleAssignment);
        _builder.newLineIfNotEmpty();
        {
          Expression _mapping = output.getMapping();
          boolean _tripleNotEquals = (_mapping != null);
          if (_tripleNotEquals) {
            CharSequence _generateMappingExpression = this.generateMappingExpression(sensor, output);
            _builder.append(_generateMappingExpression);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("sampleMessage.");
        String _sampleMessageName = Utils.getSampleMessageName(output);
        _builder.append(_sampleMessageName);
        _builder.append(" = ");
        String _bindingName = Utils.getBindingName(output);
        _builder.append(_bindingName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    final String sampleCode = _builder.toString();
    return this.generateIfPredicate(sensor, sampleCode);
  }
  
  protected CharSequence generateIfPredicate(final Sensor sensor, final CharSequence content) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = sensor.getPredicate().size();
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        _builder.append("if ((bool)(");
        String _generateExpression = Utils.generateExpression(sensor.getPredicate().get(0));
        _builder.append(_generateExpression);
        _builder.append(")) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(content, "\t");
        _builder.newLineIfNotEmpty();
        {
          int _size_1 = sensor.getPredicate().size();
          boolean _notEquals_1 = (_size_1 != 0);
          if (_notEquals_1) {
            _builder.append("}");
            _builder.newLine();
          }
        }
      } else {
        _builder.append(content);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence generateSampleAssignment(final Sensor sensor, final SensorOutput output, final CharSequence sampleCode) {
    StringConcatenation _builder = new StringConcatenation();
    String _bindingName = Utils.getBindingName(output);
    _builder.append(_bindingName);
    _builder.append(" = ");
    _builder.append(sampleCode);
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence generateMappingExpression(final Sensor sensor, final SensorOutput output) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("value = ");
    String _bindingName = Utils.getBindingName(output);
    _builder.append(_bindingName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    String _bindingName_1 = Utils.getBindingName(output);
    _builder.append(_bindingName_1);
    _builder.append(" = ");
    String _generateExpression = Utils.generateExpression(output.getMapping());
    _builder.append(_generateExpression);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected String getSampleType(final Sensor sensor, final SensorOutput output) {
    return this.outputs[sensor.getOutputs().indexOf(output)];
  }
  
  public abstract CharSequence getSampleCode(final Sensor sensor, final SensorOutput output);
}
