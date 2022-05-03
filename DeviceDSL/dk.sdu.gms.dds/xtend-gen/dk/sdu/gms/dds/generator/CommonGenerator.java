package dk.sdu.gms.dds.generator;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CommonGenerator {
  public static CharSequence getCommon() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void print_mac(const uint8_t* mac) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.println(mac_to_string(mac));");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("String mac_to_string(const uint8_t* mac) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("String result = \"\";");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("for (int i = 0; i < 6; i++) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("result += String(mac[i], HEX);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (i != 6 - 1) {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("result += \":\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
