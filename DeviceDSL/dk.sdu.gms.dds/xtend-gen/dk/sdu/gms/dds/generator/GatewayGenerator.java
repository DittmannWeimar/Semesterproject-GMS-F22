package dk.sdu.gms.dds.generator;

import dk.sdu.gms.dds.deviceDefinition.Gateway;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GatewayGenerator {
  public static CharSequence generateNetworking(final Gateway gateway) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void setup () {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void loop () {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
