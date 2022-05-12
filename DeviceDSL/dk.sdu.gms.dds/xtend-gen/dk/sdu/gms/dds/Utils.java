package dk.sdu.gms.dds;

import dk.sdu.gms.dds.deviceDefinition.ADC;
import dk.sdu.gms.dds.deviceDefinition.Actuator;
import dk.sdu.gms.dds.deviceDefinition.And;
import dk.sdu.gms.dds.deviceDefinition.Binding;
import dk.sdu.gms.dds.deviceDefinition.BooleanFalse;
import dk.sdu.gms.dds.deviceDefinition.BooleanTrue;
import dk.sdu.gms.dds.deviceDefinition.DecimalPrimitive;
import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.Div;
import dk.sdu.gms.dds.deviceDefinition.Equals;
import dk.sdu.gms.dds.deviceDefinition.Expression;
import dk.sdu.gms.dds.deviceDefinition.ExternalCall;
import dk.sdu.gms.dds.deviceDefinition.ExternalVariableUse;
import dk.sdu.gms.dds.deviceDefinition.Gateway;
import dk.sdu.gms.dds.deviceDefinition.GenericIn;
import dk.sdu.gms.dds.deviceDefinition.GenericOut;
import dk.sdu.gms.dds.deviceDefinition.Greater;
import dk.sdu.gms.dds.deviceDefinition.GreaterOrEquals;
import dk.sdu.gms.dds.deviceDefinition.Hour;
import dk.sdu.gms.dds.deviceDefinition.IntPrimitive;
import dk.sdu.gms.dds.deviceDefinition.InternalVariableUse;
import dk.sdu.gms.dds.deviceDefinition.Lesser;
import dk.sdu.gms.dds.deviceDefinition.LesserOrEquals;
import dk.sdu.gms.dds.deviceDefinition.Minus;
import dk.sdu.gms.dds.deviceDefinition.Minute;
import dk.sdu.gms.dds.deviceDefinition.Mult;
import dk.sdu.gms.dds.deviceDefinition.NotEquals;
import dk.sdu.gms.dds.deviceDefinition.OnOff;
import dk.sdu.gms.dds.deviceDefinition.Or;
import dk.sdu.gms.dds.deviceDefinition.Parenthesis;
import dk.sdu.gms.dds.deviceDefinition.Pin;
import dk.sdu.gms.dds.deviceDefinition.PinType;
import dk.sdu.gms.dds.deviceDefinition.Plus;
import dk.sdu.gms.dds.deviceDefinition.Primitive;
import dk.sdu.gms.dds.deviceDefinition.Second;
import dk.sdu.gms.dds.deviceDefinition.Sensor;
import dk.sdu.gms.dds.deviceDefinition.SensorOutput;
import dk.sdu.gms.dds.deviceDefinition.Setting;
import dk.sdu.gms.dds.deviceDefinition.TimeUnit;
import dk.sdu.gms.dds.deviceDefinition.Trigger;
import dk.sdu.gms.dds.deviceDefinition.Value;
import dk.sdu.gms.dds.deviceDefinition.VariableUse;
import dk.sdu.gms.dds.deviceDefinition.Worker;
import dk.sdu.gms.dds.sensors.SensorDefinition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class Utils {
  public static int[] dacPins = { 25, 26 };
  
  public static int defaultRetries = 1;
  
  public static int defaultErrorLed = 2;
  
  public static ArrayList<String> createSettingIndex(final Gateway gateway) {
    final ArrayList<String> list = new ArrayList<String>();
    EList<Worker> _workers = gateway.getWorkers();
    for (final Worker worker : _workers) {
      {
        final ArrayList<Setting> settingList = Utils.settings(worker);
        for (final Setting setting : settingList) {
          list.add(Utils.getBindingName(setting));
        }
      }
    }
    return list;
  }
  
  public static int indexOfSetting(final Setting setting) {
    return Utils.createSettingIndex(Utils.gateway(Utils.worker(Utils.device(setting)))).indexOf(Utils.getBindingName(setting));
  }
  
  public static ArrayList<Setting> settings(final Worker worker) {
    final ArrayList<Setting> list = new ArrayList<Setting>();
    EList<Device> _devices = worker.getDevices();
    for (final Device device : _devices) {
      {
        if ((device instanceof Sensor)) {
          EList<Setting> _settings = ((Sensor)device).getSettings();
          for (final Setting setting : _settings) {
            list.add(setting);
          }
        }
        if ((device instanceof Actuator)) {
          EList<Setting> _settings_1 = ((Actuator)device).getSettings();
          for (final Setting setting_1 : _settings_1) {
            list.add(setting_1);
          }
        }
      }
    }
    return list;
  }
  
  public static Sensor sensor(final SensorOutput output) {
    EObject _eContainer = output.eContainer();
    return ((Sensor) _eContainer);
  }
  
  public static Device device(final Setting setting) {
    EObject _eContainer = setting.eContainer();
    return ((Device) _eContainer);
  }
  
  public static Worker worker(final Device device) {
    EObject _eContainer = device.eContainer();
    return ((Worker) _eContainer);
  }
  
  public static Gateway gateway(final Worker worker) {
    EObject _eContainer = worker.eContainer();
    return ((Gateway) _eContainer);
  }
  
  public static dk.sdu.gms.dds.deviceDefinition.System system(final EObject obj) {
    EObject current = obj;
    while ((current.eContainer() != null)) {
      {
        current = current.eContainer();
        if ((current instanceof dk.sdu.gms.dds.deviceDefinition.System)) {
          return ((dk.sdu.gms.dds.deviceDefinition.System)current);
        }
      }
    }
    return null;
  }
  
  public static int indexOf(final Gateway gateway, final Worker worker) {
    return gateway.getWorkers().indexOf(worker);
  }
  
  public static String[] macAsBytes(final String mac) {
    String[] bytes = mac.split(":");
    for (int i = 0; (i < bytes.length); i++) {
      String _get = bytes[i];
      String _plus = ("0x" + _get);
      bytes[i] = _plus;
    }
    return bytes;
  }
  
  public static ArrayList<SensorOutput> getWorkerSensorOutputs(final Gateway gateway) {
    final ArrayList<SensorOutput> outputs = new ArrayList<SensorOutput>();
    EList<Worker> _workers = gateway.getWorkers();
    for (final Worker worker : _workers) {
      EList<Device> _devices = worker.getDevices();
      for (final Device device : _devices) {
        if ((device instanceof Sensor)) {
          EList<SensorOutput> _outputs = ((Sensor)device).getOutputs();
          for (final SensorOutput output : _outputs) {
            outputs.add(output);
          }
        }
      }
    }
    return outputs;
  }
  
  public static String _getSampleMessageName(final SensorOutput output) {
    String _name = Utils.worker(Utils.sensor(output)).getName();
    String _plus = (_name + "_");
    String _name_1 = Utils.sensor(output).getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + "_");
    String _outputName = Utils.getOutputName(Utils.sensor(output), output);
    return (_plus_2 + _outputName);
  }
  
  public static String _getSampleMqttSubject(final SensorOutput output) {
    String _name = Utils.sensor(output).getName();
    String _plus = (_name + ",");
    String _outputName = Utils.getOutputName(Utils.sensor(output), output);
    return (_plus + _outputName);
  }
  
  public static String getOutputName(final Sensor sensor, final SensorOutput output) {
    String _output = output.getOutput();
    boolean _tripleEquals = (_output == null);
    if (_tripleEquals) {
      final SensorDefinition definition = SensorDefinition.getSensorDefinition(sensor);
      int _length = definition.outputs.length;
      boolean _notEquals = (_length != 1);
      if (_notEquals) {
        throw new IllegalArgumentException("Attempted to fetch single output name for sensor with 0 or multiple outputs.");
      }
      return definition.outputs[0];
    } else {
      return output.getOutput();
    }
  }
  
  public static String generatePrimitive(final Primitive primitive) {
    String _switchResult = null;
    boolean _matched = false;
    if (primitive instanceof DecimalPrimitive) {
      _matched=true;
      _switchResult = ((DecimalPrimitive)primitive).getValue().toString();
    }
    if (!_matched) {
      if (primitive instanceof IntPrimitive) {
        _matched=true;
        _switchResult = Integer.valueOf(((IntPrimitive)primitive).getValue()).toString();
      }
    }
    if (!_matched) {
      if (primitive instanceof BooleanTrue) {
        _matched=true;
        _switchResult = "true";
      }
    }
    if (!_matched) {
      if (primitive instanceof BooleanFalse) {
        _matched=true;
        _switchResult = "false";
      }
    }
    return _switchResult;
  }
  
  public static String generateVariableUse(final VariableUse variableUse) {
    String _switchResult = null;
    boolean _matched = false;
    if (variableUse instanceof InternalVariableUse) {
      _matched=true;
      _switchResult = Utils.getBindingName(((InternalVariableUse)variableUse).getRef());
    }
    if (!_matched) {
      if (variableUse instanceof ExternalVariableUse) {
        _matched=true;
        _switchResult = Utils.getBindingName(((ExternalVariableUse)variableUse).getRef());
      }
    }
    return _switchResult;
  }
  
  public static String generateExternalCall(final ExternalCall call) {
    int index = 0;
    StringBuilder builder = new StringBuilder();
    String _func = call.getFunc();
    String _plus = (_func + "(");
    builder.append(_plus);
    EList<Expression> _args = call.getArgs();
    for (final Expression arg : _args) {
      {
        index++;
        builder.append(Utils.generateExpression(arg));
        int _size = call.getArgs().size();
        boolean _notEquals = (index != _size);
        if (_notEquals) {
          builder.append(", ");
        }
      }
    }
    builder.append(")");
    return builder.toString();
  }
  
  public static String generateExpression(final Expression exp) {
    String _switchResult = null;
    boolean _matched = false;
    if (exp instanceof Plus) {
      _matched=true;
      Object _generateExpression = Utils.generateExpression(((Plus)exp).getLeft());
      String _plus = (_generateExpression + " + ");
      Object _generateExpression_1 = Utils.generateExpression(((Plus)exp).getRight());
      _switchResult = (_plus + _generateExpression_1);
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((Minus)exp).getLeft());
        String _plus = (_generateExpression + " - ");
        Object _generateExpression_1 = Utils.generateExpression(((Minus)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((Mult)exp).getLeft());
        String _plus = (_generateExpression + " * ");
        Object _generateExpression_1 = Utils.generateExpression(((Mult)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Div) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((Div)exp).getLeft());
        String _plus = (_generateExpression + " / ");
        Object _generateExpression_1 = Utils.generateExpression(((Div)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Greater) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((Greater)exp).getLeft());
        String _plus = (_generateExpression + " > ");
        Object _generateExpression_1 = Utils.generateExpression(((Greater)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Lesser) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((Lesser)exp).getLeft());
        String _plus = (_generateExpression + " < ");
        Object _generateExpression_1 = Utils.generateExpression(((Lesser)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof GreaterOrEquals) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((GreaterOrEquals)exp).getLeft());
        String _plus = (_generateExpression + " >= ");
        Object _generateExpression_1 = Utils.generateExpression(((GreaterOrEquals)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof LesserOrEquals) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((LesserOrEquals)exp).getLeft());
        String _plus = (_generateExpression + " <= ");
        Object _generateExpression_1 = Utils.generateExpression(((LesserOrEquals)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Equals) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((Equals)exp).getLeft());
        String _plus = (_generateExpression + " == ");
        Object _generateExpression_1 = Utils.generateExpression(((Equals)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof NotEquals) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((NotEquals)exp).getLeft());
        String _plus = (_generateExpression + " != ");
        Object _generateExpression_1 = Utils.generateExpression(((NotEquals)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof And) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((And)exp).getLeft());
        String _plus = (_generateExpression + " && ");
        Object _generateExpression_1 = Utils.generateExpression(((And)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Or) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((Or)exp).getLeft());
        String _plus = (_generateExpression + " || ");
        Object _generateExpression_1 = Utils.generateExpression(((Or)exp).getRight());
        _switchResult = (_plus + _generateExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Parenthesis) {
        _matched=true;
        Object _generateExpression = Utils.generateExpression(((Parenthesis)exp).getExp());
        String _plus = ("(" + _generateExpression);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof VariableUse) {
        _matched=true;
        _switchResult = Utils.generateVariableUse(((VariableUse)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof Primitive) {
        _matched=true;
        _switchResult = Utils.generatePrimitive(((Primitive)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof ExternalCall) {
        _matched=true;
        _switchResult = Utils.generateExternalCall(((ExternalCall)exp));
      }
    }
    if (!_matched) {
      if (exp instanceof Value) {
        _matched=true;
        _switchResult = "value";
      }
    }
    return _switchResult;
  }
  
  public static String _getBindingName(final SensorOutput output) {
    String _variablePrefix = Utils.getVariablePrefix(Utils.sensor(output));
    String _outputName = Utils.getOutputName(Utils.sensor(output), output);
    return (_variablePrefix + _outputName);
  }
  
  public static String _getBindingName(final Setting setting) {
    String _variablePrefix = Utils.getVariablePrefix(setting);
    String _name = setting.getName();
    return (_variablePrefix + _name);
  }
  
  public static String _getVariablePrefix(final Sensor sensor) {
    String _name = sensor.getName();
    return (_name + "_");
  }
  
  public static String _getVariablePrefix(final Actuator actuator) {
    String _name = actuator.getName();
    return (_name + "_");
  }
  
  public static String _getVariablePrefix(final Setting setting) {
    String _xblockexpression = null;
    {
      final EObject container = setting.eContainer();
      String _switchResult = null;
      boolean _matched = false;
      if (container instanceof Sensor) {
        _matched=true;
        String _name = ((Sensor)container).getName();
        _switchResult = (_name + "_");
      }
      if (!_matched) {
        if (container instanceof Actuator) {
          _matched=true;
          String _name = ((Actuator)container).getName();
          _switchResult = (_name + "_");
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static String getTimerName(final Actuator actuator) {
    String _variablePrefix = Utils.getVariablePrefix(actuator);
    return (_variablePrefix + "last_enable_time");
  }
  
  public static List<Actuator> getTimedActuators(final Worker worker) {
    final Predicate<Device> _function = (Device x) -> {
      return (x instanceof Actuator);
    };
    final Function<Device, Actuator> _function_1 = (Device x) -> {
      return ((Actuator) x);
    };
    final Predicate<Actuator> _function_2 = (Actuator x) -> {
      return Utils.isTimed(x.getTrigger());
    };
    return worker.getDevices().stream().filter(_function).<Actuator>map(_function_1).filter(_function_2).collect(Collectors.<Actuator>toList());
  }
  
  public static int getTimeUnitMsMultiplier(final TimeUnit unit) {
    int _switchResult = (int) 0;
    boolean _matched = false;
    if (unit instanceof Second) {
      _matched=true;
      _switchResult = 1000;
    }
    if (!_matched) {
      if (unit instanceof Minute) {
        _matched=true;
        _switchResult = (1000 * 60);
      }
    }
    if (!_matched) {
      if (unit instanceof Hour) {
        _matched=true;
        _switchResult = ((1000 * 60) * 60);
      }
    }
    return _switchResult;
  }
  
  public static String timeUnitToString(final TimeUnit unit) {
    String _switchResult = null;
    boolean _matched = false;
    if (unit instanceof Second) {
      _matched=true;
      _switchResult = "second(s)";
    }
    if (!_matched) {
      if (unit instanceof Minute) {
        _matched=true;
        _switchResult = "minute(s)";
      }
    }
    if (!_matched) {
      if (unit instanceof Hour) {
        _matched=true;
        _switchResult = "hour(s)";
      }
    }
    return _switchResult;
  }
  
  public static CharSequence getDacPinVariableName(final int pin) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("dacPin");
    _builder.append(pin);
    return _builder;
  }
  
  public static CharSequence getDacChannelName(final int channel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("dacChannel");
    _builder.append(channel);
    return _builder;
  }
  
  public static int pinNumberToDacChannel(final int pin) {
    return ((List<Integer>)Conversions.doWrapArray(Utils.dacPins)).indexOf(Integer.valueOf(pin));
  }
  
  public static CharSequence generatePinsSetup(final List<Pin> pins) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Pin pin : pins) {
        {
          if (((pin.getType() instanceof ADC) || (pin.getType() instanceof GenericIn))) {
            _builder.append("pinMode(");
            int _number = pin.getNumber();
            _builder.append(_number);
            _builder.append(", INPUT);");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          PinType _type = pin.getType();
          if ((_type instanceof GenericOut)) {
            _builder.append("pinMode(");
            int _number_1 = pin.getNumber();
            _builder.append(_number_1);
            _builder.append(", OUTPUT);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public static Setting findSettingByName(final Device device, final String name) {
    EList<Setting> _switchResult = null;
    boolean _matched = false;
    if (device instanceof Sensor) {
      _matched=true;
      _switchResult = ((Sensor)device).getSettings();
    }
    if (!_matched) {
      if (device instanceof Actuator) {
        _matched=true;
        _switchResult = ((Actuator)device).getSettings();
      }
    }
    final EList<Setting> settings = _switchResult;
    for (final Setting setting : settings) {
      boolean _equals = setting.getName().equals(name);
      if (_equals) {
        return setting;
      }
    }
    return null;
  }
  
  public static String getSettingBindingBySettingName(final Device device, final String name) {
    return Utils.getBindingName(Utils.findSettingByName(device, name));
  }
  
  public static boolean hasSensors(final Worker worker) {
    EList<Device> _devices = worker.getDevices();
    for (final Device device : _devices) {
      if ((device instanceof Sensor)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean hasActuators(final Worker worker) {
    EList<Device> _devices = worker.getDevices();
    for (final Device device : _devices) {
      if ((device instanceof Actuator)) {
        return true;
      }
    }
    return false;
  }
  
  public static String getSampleMqttTopic(final SensorOutput output) {
    String _mac = Utils.system(output).getGateway().getMac();
    String _plus = ("samples/" + _mac);
    String _plus_1 = (_plus + "/");
    String _mac_1 = Utils.worker(Utils.sensor(output)).getMac();
    String _plus_2 = (_plus_1 + _mac_1);
    String _plus_3 = (_plus_2 + "/");
    String _sampleMqttSubject = Utils.getSampleMqttSubject(output);
    return (_plus_3 + _sampleMqttSubject);
  }
  
  public static boolean isTimed(final Trigger trigger) {
    if ((trigger instanceof OnOff)) {
      Expression _offExp = ((OnOff)trigger).getOffExp();
      return (_offExp == null);
    }
    return false;
  }
  
  public static CharSequence getEnabledVariableName(final Actuator actuator) {
    StringConcatenation _builder = new StringConcatenation();
    String _variablePrefix = Utils.getVariablePrefix(actuator);
    _builder.append(_variablePrefix);
    _builder.append("enabled");
    return _builder;
  }
  
  public static <T extends Object> T getParentOfType(final EObject obj, final Class<T> clazz) {
    EObject current = obj;
    while ((current.eContainer() != null)) {
      {
        current = current.eContainer();
        boolean _isInstance = clazz.isInstance(current);
        if (_isInstance) {
          return ((T) current);
        }
      }
    }
    return null;
  }
  
  protected static Integer _getRetriesOrDefault(final Worker worker) {
    int _size = worker.getRetries().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return Integer.valueOf(Utils.defaultRetries);
    }
    return worker.getRetries().get(0);
  }
  
  protected static Integer _getErrorLedOrDefault(final Worker worker) {
    int _size = worker.getErrorLed().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return Integer.valueOf(Utils.defaultErrorLed);
    }
    return worker.getErrorLed().get(0);
  }
  
  /**
   * def static dispatch getRetriesOrDefault(Gateway gateway) {
   * if (gateway.retries.size() == 0) return defaultRetries;
   * return gateway.retries.get(0);
   * }
   */
  protected static Integer _getErrorLedOrDefault(final Gateway gateway) {
    int _size = gateway.getErrorLed().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return Integer.valueOf(Utils.defaultErrorLed);
    }
    return gateway.getErrorLed().get(0);
  }
  
  public static String getSampleMessageName(final SensorOutput output) {
    return _getSampleMessageName(output);
  }
  
  public static String getSampleMqttSubject(final SensorOutput output) {
    return _getSampleMqttSubject(output);
  }
  
  public static String getBindingName(final Binding output) {
    if (output instanceof SensorOutput) {
      return _getBindingName((SensorOutput)output);
    } else if (output instanceof Setting) {
      return _getBindingName((Setting)output);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(output).toString());
    }
  }
  
  public static String getVariablePrefix(final EObject actuator) {
    if (actuator instanceof Actuator) {
      return _getVariablePrefix((Actuator)actuator);
    } else if (actuator instanceof Sensor) {
      return _getVariablePrefix((Sensor)actuator);
    } else if (actuator instanceof Setting) {
      return _getVariablePrefix((Setting)actuator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(actuator).toString());
    }
  }
  
  public static Integer getRetriesOrDefault(final Worker worker) {
    return _getRetriesOrDefault(worker);
  }
  
  public static Integer getErrorLedOrDefault(final EObject gateway) {
    if (gateway instanceof Gateway) {
      return _getErrorLedOrDefault((Gateway)gateway);
    } else if (gateway instanceof Worker) {
      return _getErrorLedOrDefault((Worker)gateway);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(gateway).toString());
    }
  }
}
