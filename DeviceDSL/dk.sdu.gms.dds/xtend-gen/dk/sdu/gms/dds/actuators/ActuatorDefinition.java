package dk.sdu.gms.dds.actuators;

import com.google.common.base.Objects;
import dk.sdu.gms.dds.DeviceDefinition;
import dk.sdu.gms.dds.Utils;
import dk.sdu.gms.dds.deviceDefinition.Actuator;
import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.Expression;
import dk.sdu.gms.dds.deviceDefinition.OnOff;
import dk.sdu.gms.dds.deviceDefinition.Trigger;
import dk.sdu.gms.dds.deviceDefinition.When;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class ActuatorDefinition extends DeviceDefinition {
  public static ActuatorDefinition[] Actuators = new ActuatorDefinition[] { new GenericActuator() };
  
  public static ActuatorDefinition getActuatorDefinition(final Actuator actuator) {
    for (final ActuatorDefinition s : ActuatorDefinition.Actuators) {
      String _type = actuator.getType();
      boolean _equals = Objects.equal(s.type, _type);
      if (_equals) {
        return s;
      }
    }
    return null;
  }
  
  public String type;
  
  public int pinCount;
  
  public String[] requiredSettings;
  
  @Override
  public CharSequence generateDirectives() {
    return null;
  }
  
  @Override
  public CharSequence generateInitializers(final Device device) {
    return this.generateInitializers(((Actuator) device));
  }
  
  protected CharSequence generateInitializers(final Actuator actuator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("bool ");
    CharSequence _enabledVariableName = this.getEnabledVariableName(actuator);
    _builder.append(_enabledVariableName);
    _builder.append(" = false;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generateSetup(final Device device) {
    return this.generateSetup(((Actuator) device));
  }
  
  protected CharSequence generateSetup(final Actuator actuator) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generatePinsSetup = Utils.generatePinsSetup(actuator.getPins());
    _builder.append(_generatePinsSetup);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generateLoop(final Device device) {
    return this.generateLoop(((Actuator) device));
  }
  
  protected CharSequence generateLoop(final Actuator actuator) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateCheckLoop = this.generateCheckLoop(actuator);
    _builder.append(_generateCheckLoop);
    _builder.newLineIfNotEmpty();
    CharSequence _generateEnableActuatorCode = this.generateEnableActuatorCode(actuator, this.getEnabledVariableName(actuator));
    _builder.append(_generateEnableActuatorCode);
    _builder.newLineIfNotEmpty();
    {
      boolean _isTimed = this.isTimed(actuator.getTrigger());
      if (_isTimed) {
        _builder.append("delay(");
        Trigger _trigger = actuator.getTrigger();
        int _time = ((OnOff) _trigger).getTime();
        Trigger _trigger_1 = actuator.getTrigger();
        int _timeUnitMsMultiplier = Utils.getTimeUnitMsMultiplier(((OnOff) _trigger_1).getUnit());
        int _multiply = (_time * _timeUnitMsMultiplier);
        _builder.append(_multiply);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        CharSequence _enabledVariableName = this.getEnabledVariableName(actuator);
        _builder.append(_enabledVariableName);
        _builder.append(" = false;");
        _builder.newLineIfNotEmpty();
        CharSequence _generateEnableActuatorCode_1 = this.generateEnableActuatorCode(actuator, this.getEnabledVariableName(actuator));
        _builder.append(_generateEnableActuatorCode_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence generateCheckLoop(final Actuator actuator) {
    CharSequence _xblockexpression = null;
    {
      final Trigger trigger = actuator.getTrigger();
      CharSequence _switchResult = null;
      boolean _matched = false;
      if (trigger instanceof When) {
        _matched=true;
        _switchResult = this.generateWhenLoop(((When)trigger).getExp(), actuator);
      }
      if (!_matched) {
        if (trigger instanceof OnOff) {
          _matched=true;
          CharSequence _xblockexpression_1 = null;
          {
            final boolean isTimed = this.isTimed(trigger);
            CharSequence _xifexpression = null;
            if (isTimed) {
              _xifexpression = this.generateWhenLoop(((OnOff)trigger).getOnExp(), actuator);
            } else {
              _xifexpression = this.generateOnOffLoop(((OnOff)trigger), actuator);
            }
            _xblockexpression_1 = _xifexpression;
          }
          _switchResult = _xblockexpression_1;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  protected CharSequence generateWhenLoop(final Expression whenExp, final Actuator actuator) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _enabledVariableName = this.getEnabledVariableName(actuator);
    _builder.append(_enabledVariableName);
    _builder.append(" = (bool)(");
    String _generateExpression = Utils.generateExpression(whenExp);
    _builder.append(_generateExpression);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence generateOnOffLoop(final OnOff onOff, final Actuator actuator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (");
    CharSequence _enabledVariableName = this.getEnabledVariableName(actuator);
    _builder.append(_enabledVariableName);
    _builder.append(" == false && (bool)(");
    String _generateExpression = Utils.generateExpression(onOff.getOnExp());
    _builder.append(_generateExpression);
    _builder.append(")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _enabledVariableName_1 = this.getEnabledVariableName(actuator);
    _builder.append(_enabledVariableName_1, "\t");
    _builder.append(" = true;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("if (");
    CharSequence _enabledVariableName_2 = this.getEnabledVariableName(actuator);
    _builder.append(_enabledVariableName_2);
    _builder.append(" == true && (bool)(");
    String _generateExpression_1 = Utils.generateExpression(onOff.getOffExp());
    _builder.append(_generateExpression_1);
    _builder.append(")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _enabledVariableName_3 = this.getEnabledVariableName(actuator);
    _builder.append(_enabledVariableName_3, "\t");
    _builder.append(" = false;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected abstract CharSequence generateEnableActuatorCode(final Actuator actuator, final CharSequence enabledBoolString);
  
  protected CharSequence getEnabledVariableName(final Actuator actuator) {
    StringConcatenation _builder = new StringConcatenation();
    String _variablePrefix = Utils.getVariablePrefix(actuator);
    _builder.append(_variablePrefix);
    _builder.append("enabled");
    return _builder;
  }
  
  protected boolean isTimed(final Trigger trigger) {
    if ((trigger instanceof OnOff)) {
      Expression _offExp = ((OnOff)trigger).getOffExp();
      return (_offExp == null);
    }
    return false;
  }
}
