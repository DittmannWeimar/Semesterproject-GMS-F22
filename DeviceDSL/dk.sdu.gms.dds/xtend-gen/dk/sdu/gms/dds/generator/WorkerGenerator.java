package dk.sdu.gms.dds.generator;

import dk.sdu.gms.dds.DeviceDefinition;
import dk.sdu.gms.dds.Utils;
import dk.sdu.gms.dds.actuators.ActuatorDefinition;
import dk.sdu.gms.dds.deviceDefinition.Actuator;
import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.OnOff;
import dk.sdu.gms.dds.deviceDefinition.SensorOutput;
import dk.sdu.gms.dds.deviceDefinition.Setting;
import dk.sdu.gms.dds.deviceDefinition.Trigger;
import dk.sdu.gms.dds.deviceDefinition.Worker;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class WorkerGenerator {
  public static void generateWorker(final Worker worker, final IFileSystemAccess2 fsa) {
    String _replace = worker.getMac().replace(":", "");
    String _plus = (_replace + "/");
    String _replace_1 = worker.getMac().replace(":", "");
    String _plus_1 = (_plus + _replace_1);
    String _plus_2 = (_plus_1 + ".ino");
    fsa.generateFile(_plus_2, WorkerGenerator.generateCode(worker));
  }
  
  public static CharSequence generateCode(final Worker worker) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <esp_now.h>");
    _builder.newLine();
    _builder.append("#include <esp_wifi.h>");
    _builder.newLine();
    _builder.append("#include <WiFi.h>");
    _builder.newLine();
    _builder.append("#include <Wire.h>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("// GENERATED DIRECTIVES");
    _builder.newLine();
    {
      EList<Device> _devices = worker.getDevices();
      for(final Device device : _devices) {
        final ArrayList<Class<?>> generatedDirectives = new ArrayList<Class<?>>();
        _builder.newLineIfNotEmpty();
        {
          boolean _contains = generatedDirectives.contains(device.getClass());
          boolean _not = (!_contains);
          if (_not) {
            CharSequence _generateDirectives = DeviceDefinition.getDefinition(device).generateDirectives();
            _builder.append(_generateDirectives);
            _builder.append("\t");
            _builder.newLineIfNotEmpty();
            String _xblockexpression = null;
            {
              generatedDirectives.add(device.getClass());
              _xblockexpression = "";
            }
            _builder.append(_xblockexpression);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    final String[] bytes = Utils.macAsBytes(Utils.gateway(worker).getMac());
    _builder.newLineIfNotEmpty();
    _builder.append("uint8_t gatewayAddress[] = {");
    String _get = bytes[0];
    _builder.append(_get);
    _builder.append(", ");
    String _get_1 = bytes[1];
    _builder.append(_get_1);
    _builder.append(", ");
    String _get_2 = bytes[2];
    _builder.append(_get_2);
    _builder.append(", ");
    String _get_3 = bytes[3];
    _builder.append(_get_3);
    _builder.append(", ");
    String _get_4 = bytes[4];
    _builder.append(_get_4);
    _builder.append(", ");
    String _get_5 = bytes[5];
    _builder.append(_get_5);
    _builder.append("};");
    _builder.newLineIfNotEmpty();
    _builder.append("esp_now_peer_info_t gatewayInfo;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("enum MESSAGE_TYPE { Ping, Setting, Sample };");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// GENERATED SETTINGS");
    _builder.newLine();
    {
      ArrayList<Setting> _settings = Utils.settings(worker);
      for(final Setting setting : _settings) {
        _builder.append("float ");
        String _bindingName = Utils.getBindingName(setting);
        _builder.append(_bindingName);
        _builder.append(" = ");
        String _generateExpression = Utils.generateExpression(setting.getValue());
        _builder.append(_generateExpression);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("// GENERATED INITIALIZATIONS");
    _builder.newLine();
    {
      EList<Device> _devices_1 = worker.getDevices();
      for(final Device device_1 : _devices_1) {
        CharSequence _generateInitializers = DeviceDefinition.getDefinition(device_1).generateInitializers(device_1);
        _builder.append(_generateInitializers);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("// GENERATED TIMERS");
    _builder.newLine();
    _builder.append("uint64_t last_loop_time;");
    _builder.newLine();
    {
      List<Actuator> _timedActuators = Utils.getTimedActuators(worker);
      for(final Actuator actuator : _timedActuators) {
        {
          boolean _isTimed = Utils.isTimed(actuator.getTrigger());
          if (_isTimed) {
            _builder.append("uint64_t ");
            String _timerName = Utils.getTimerName(actuator);
            _builder.append(_timerName);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("const int freq = 5000;");
    _builder.newLine();
    _builder.append("const int ledChannel = 0;");
    _builder.newLine();
    _builder.append("const int resolution = 8;");
    _builder.newLine();
    _builder.append("const bool scan = true;");
    _builder.newLine();
    _builder.append("const String STATION_NAME = \"Gateway\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("int espnow_channel = 0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void setup() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("WiFi.mode(WIFI_STA);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("WiFi.disconnect();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if(scan) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("uint8_t networks = WiFi.scanNetworks();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for(int n=0;n<networks;n++) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Serial.printf(\"%d %s   %d   %d %s \\n\", n,WiFi.SSID(n).c_str(),WiFi.RSSI(n), WiFi.channel(n), WiFi.BSSIDstr(n).c_str());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for(int i=0;i<8;i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Serial.print(WiFi.BSSID(n)[i]);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Serial.print(\" \");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Serial.println();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if(WiFi.SSID(n).indexOf(STATION_NAME) == 0)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Serial.println(\"Found\");");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("memcpy(gatewayAddress, WiFi.BSSID(n), 6);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("espnow_channel = WiFi.channel(n);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("WiFi.scanDelete();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("esp_wifi_set_promiscuous(true);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("esp_wifi_set_channel(espnow_channel, WIFI_SECOND_CHAN_NONE);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("esp_wifi_set_promiscuous(false);");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.begin(115200);");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    {
      int _length = Utils.dacPins.length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for(final Integer i : _doubleDotLessThan) {
        _builder.append("  ");
        _builder.append("ledcSetup(");
        _builder.append(i, "  ");
        _builder.append(", freq, resolution);");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("ledcAttachPin(");
        int _get_6 = Utils.dacPins[(i).intValue()];
        _builder.append(_get_6, "  ");
        _builder.append(", ");
        _builder.append(i, "  ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("pinMode(");
        int _get_7 = Utils.dacPins[(i).intValue()];
        _builder.append(_get_7, "  ");
        _builder.append(", OUTPUT);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Set device as a Wi-Fi Station");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("WiFi.mode(WIFI_STA);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.print(\"Worker starting with MAC address \");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.println(WiFi.macAddress());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Init ESP-NOW");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (esp_now_init() != ESP_OK) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Serial.println(\"Error initializing ESP-NOW\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Once ESPNow is successfully Init, we will register for Send CB to");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// get the status of Trasnmitted packet");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("esp_now_register_send_cb(OnDataSent);");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Register peer");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("memcpy(gatewayInfo.peer_addr, gatewayAddress, 6);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("gatewayInfo.channel = 0;  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("gatewayInfo.encrypt = false;");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Add peer        ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (esp_now_add_peer(&gatewayInfo) != ESP_OK){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Serial.println(\"Failed to add peer\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}else{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Serial.println(\"Succesfully added peer\");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Register for a callback function that will be called when data is received");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("esp_now_register_recv_cb(OnDataRecv);");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// GENERATED SETUP");
    _builder.newLine();
    {
      EList<Device> _devices_2 = worker.getDevices();
      for(final Device device_2 : _devices_2) {
        CharSequence _generateSetup = DeviceDefinition.getDefinition(device_2).generateSetup(device_2);
        _builder.append(_generateSetup);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct message_base {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("MESSAGE_TYPE type;");
    _builder.newLine();
    _builder.append("} message_base;");
    _builder.newLine();
    _builder.append("message_base baseMessage;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct message_setting : message_base {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("int setting;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("float newValue;");
    _builder.newLine();
    _builder.append("} message_setting;");
    _builder.newLine();
    _builder.append("message_setting settingMessage;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct message_sample : message_base {");
    _builder.newLine();
    {
      ArrayList<SensorOutput> _workerSensorOutputs = Utils.getWorkerSensorOutputs(Utils.gateway(worker));
      for(final SensorOutput output : _workerSensorOutputs) {
        _builder.append("\t");
        _builder.append("float ");
        String _sampleMessageName = Utils.getSampleMessageName(output);
        _builder.append(_sampleMessageName, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("} message_sample;");
    _builder.newLine();
    _builder.append("message_sample sampleMessage;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void loop() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("uint64_t current_time = esp_timer_get_time() / 1000ULL;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (current_time > last_loop_time + ");
    int _sleepTime = worker.getSleepTime();
    int _timeUnitMsMultiplier = Utils.getTimeUnitMsMultiplier(worker.getTimeUnit());
    int _multiply = (_sleepTime * _timeUnitMsMultiplier);
    _builder.append(_multiply, "  ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      ArrayList<SensorOutput> _workerSensorOutputs_1 = Utils.getWorkerSensorOutputs(Utils.gateway(worker));
      for(final SensorOutput output_1 : _workerSensorOutputs_1) {
        _builder.append("    ");
        _builder.append("sampleMessage.");
        String _sampleMessageName_1 = Utils.getSampleMessageName(output_1);
        _builder.append(_sampleMessageName_1, "    ");
        _builder.append(" = 1.0 / 0.0;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("float value = 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      EList<Device> _devices_3 = worker.getDevices();
      for(final Device device_3 : _devices_3) {
        _builder.append("    ");
        CharSequence _generateLoop = DeviceDefinition.getDefinition(device_3).generateLoop(device_3);
        _builder.append(_generateLoop, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    {
      boolean _hasSensors = Utils.hasSensors(worker);
      if (_hasSensors) {
        _builder.append("    ");
        _builder.append("sampleMessage.type = Sample;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("send_message(gatewayAddress, (uint8_t *) &sampleMessage, sizeof(sampleMessage));");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("last_loop_time = current_time;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    {
      List<Actuator> _timedActuators_1 = Utils.getTimedActuators(worker);
      for(final Actuator actuator_1 : _timedActuators_1) {
        _builder.append("  ");
        _builder.append("if (current_time > ");
        String _timerName_1 = Utils.getTimerName(actuator_1);
        _builder.append(_timerName_1, "  ");
        _builder.append(" + ");
        Trigger _trigger = actuator_1.getTrigger();
        int _time = ((OnOff) _trigger).getTime();
        Trigger _trigger_1 = actuator_1.getTrigger();
        int _timeUnitMsMultiplier_1 = Utils.getTimeUnitMsMultiplier(((OnOff) _trigger_1).getUnit());
        int _multiply_1 = (_time * _timeUnitMsMultiplier_1);
        _builder.append(_multiply_1, "  ");
        _builder.append(" && ");
        CharSequence _enabledVariableName = Utils.getEnabledVariableName(actuator_1);
        _builder.append(_enabledVariableName, "  ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("  ");
        CharSequence _enabledVariableName_1 = Utils.getEnabledVariableName(actuator_1);
        _builder.append(_enabledVariableName_1, "    ");
        _builder.append(" = false;");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("  ");
        CharSequence _generateEnableActuatorCode = ActuatorDefinition.getActuatorDefinition(actuator_1).generateEnableActuatorCode(actuator_1, Utils.getEnabledVariableName(actuator_1));
        _builder.append(_generateEnableActuatorCode, "    ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("delay(100);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void OnDataSent(const uint8_t *mac_addr, esp_now_send_status_t status) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.print(\"Last Packet Send Status:\\t\");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.println(status == ESP_NOW_SEND_SUCCESS ? \"Delivery Success\" : \"Delivery Fail\");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void OnDataRecv(const uint8_t * mac, const uint8_t *incomingData, int len) {  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("memcpy(&baseMessage, incomingData, sizeof(baseMessage));");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.print(\"Type \" + String(baseMessage.type) + \" \");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.print(\"message received: \");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.println(len);");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("switch (baseMessage.type) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("case Ping:");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("handle_ping(mac, incomingData, len);");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("case Setting:");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("handle_setting(mac, incomingData, len);");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void print_mac(const uint8_t * mac) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("String result = \"\";");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("for (int i = 0; i < 6; i++) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("uint8_t b = mac[i];");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Serial.print(b, HEX);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (i != 6 - 1) {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Serial.print(\":\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void handle_ping(const uint8_t * mac, const uint8_t *incomingData, int len) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.print(\"Ping recieved from \");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("print_mac(mac);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.println(\"\");");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("send_message(mac, incomingData, len);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void handle_setting(const uint8_t * mac, const uint8_t *incomingData, int len) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("memcpy(&settingMessage, incomingData, sizeof(settingMessage));");
    _builder.newLine();
    {
      ArrayList<Setting> _settings_1 = Utils.settings(worker);
      for(final Setting setting_1 : _settings_1) {
        _builder.append("  ");
        _builder.append("if (settingMessage.setting == ");
        int _indexOfSetting = Utils.indexOfSetting(setting_1);
        _builder.append(_indexOfSetting, "  ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("\t");
        String _bindingName_1 = Utils.getBindingName(setting_1);
        _builder.append(_bindingName_1, "  \t");
        _builder.append(" = settingMessage.newValue;");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void send_message(const uint8_t * mac, const uint8_t *incomingData, int len) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("esp_err_t result = esp_now_send(mac, incomingData, len);");
    _builder.newLine();
    _builder.append("}");
    return _builder;
  }
}
