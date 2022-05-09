package dk.sdu.gms.dds.actuators;

import dk.sdu.gms.dds.Utils;
import dk.sdu.gms.dds.deviceDefinition.Actuator;
import dk.sdu.gms.dds.deviceDefinition.DAC;
import dk.sdu.gms.dds.deviceDefinition.PinType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GenericActuator extends ActuatorDefinition {
  public GenericActuator() {
    this.type = "Generic";
    this.pinCount = 1;
    this.requiredSettings = new String[] { "power" };
  }
  
  @Override
  public CharSequence generateEnableActuatorCode(final Actuator actuator, final CharSequence enabledBoolString) {
    CharSequence _xifexpression = null;
    PinType _type = actuator.getPins().get(0).getType();
    if ((_type instanceof DAC)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ledcWrite(");
      int _pinNumberToDacChannel = Utils.pinNumberToDacChannel(actuator.getPins().get(0).getNumber());
      _builder.append(_pinNumberToDacChannel);
      _builder.append(", (float)(");
      _builder.append(enabledBoolString);
      _builder.append(") * ");
      String _settingBindingBySettingName = Utils.getSettingBindingBySettingName(actuator, "power");
      _builder.append(_settingBindingBySettingName);
      _builder.append(");");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("digitalWrite(");
      int _number = actuator.getPins().get(0).getNumber();
      _builder_1.append(_number);
      _builder_1.append(", ");
      _builder_1.append(enabledBoolString);
      _builder_1.append(");");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
}
