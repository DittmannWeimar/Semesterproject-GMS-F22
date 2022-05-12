package dk.sdu.gms.dds.generator;

import dk.sdu.gms.dds.Utils;
import dk.sdu.gms.dds.deviceDefinition.Gateway;
import dk.sdu.gms.dds.deviceDefinition.SensorOutput;
import dk.sdu.gms.dds.deviceDefinition.Setting;
import dk.sdu.gms.dds.deviceDefinition.Worker;
import java.util.ArrayList;
import java.util.UUID;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class GatewayGenerator {
  public static void generateGateway(final Gateway gateway, final IFileSystemAccess2 fsa) {
    final CharSequence code = GatewayGenerator.generateCode(gateway);
    fsa.generateFile("gateway/gateway.ino", code);
  }
  
  public static CharSequence generateCode(final Gateway gateway) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <esp_now.h>");
    _builder.newLine();
    _builder.append("#include <esp_wifi.h>");
    _builder.newLine();
    _builder.append("#include <WiFi.h>");
    _builder.newLine();
    _builder.append("#include \"EspMQTTClient.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct worker_info {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("uint8_t address[6];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("esp_now_peer_info_t info;");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("const int numWorkers = ");
    int _size = gateway.getWorkers().size();
    _builder.append(_size);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("struct worker_info workers[numWorkers];");
    _builder.newLine();
    _builder.append("worker_info null_worker;");
    _builder.newLine();
    _builder.append("bool messageSuccess = false;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("enum MESSAGE_TYPE { Ping, Setting, Sample };");
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
      ArrayList<SensorOutput> _workerSensorOutputs = Utils.getWorkerSensorOutputs(gateway);
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
    _builder.append("const char* WIFI_SSID = \"");
    String _wifiSsid = Utils.system(gateway).getWifiSsid();
    _builder.append(_wifiSsid);
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("const char* WIFI_PW = \"");
    String _wifiPassword = Utils.system(gateway).getWifiPassword();
    _builder.append(_wifiPassword);
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("const char* STATION_NAME = \"Gateway\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("EspMQTTClient client(");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("WIFI_SSID,");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("WIFI_PW,");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"");
    String _get = Utils.system(gateway).getMqttHost().split(":")[0];
    _builder.append(_get, "  ");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    {
      String _mqttUsername = Utils.system(gateway).getMqttUsername();
      boolean _tripleNotEquals = (_mqttUsername != null);
      if (_tripleNotEquals) {
        _builder.append("  ");
        _builder.append("\"");
        String _mqttUsername_1 = Utils.system(gateway).getMqttUsername();
        _builder.append(_mqttUsername_1, "  ");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _mqttPassword = Utils.system(gateway).getMqttPassword();
      boolean _tripleNotEquals_1 = (_mqttPassword != null);
      if (_tripleNotEquals_1) {
        _builder.append("  ");
        _builder.append("\"");
        String _mqttPassword_1 = Utils.system(gateway).getMqttPassword();
        _builder.append(_mqttPassword_1, "  ");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("\"gms-gateway-");
    UUID _randomUUID = UUID.randomUUID();
    _builder.append(_randomUUID, "  ");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _get_1 = Utils.system(gateway).getMqttHost().split(":")[1];
    _builder.append(_get_1, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append(");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void setup() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Init Serial Monitor");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("WiFi.disconnect();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.begin(115200);");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("WiFi.mode(WIFI_AP_STA);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.print(\"Gateway starting with MAC address \");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.println(WiFi.macAddress());");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("WiFi.begin(WIFI_SSID, WIFI_PW);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (WiFi.softAP(STATION_NAME, \"123456789\", 1, 0)) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Serial.println(\"Soft AP set up\");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}else{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Serial.println(\"Failed to set up soft AP.\");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("while (WiFi.status() != WL_CONNECTED) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("delay(1000);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Serial.println(\"Establishing connection to WiFi..\");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
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
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("pinMode(");
    Integer _errorLedOrDefault = Utils.getErrorLedOrDefault(gateway);
    _builder.append(_errorLedOrDefault, "  ");
    _builder.append(", OUTPUT);");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Register peer");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("populate_worker_infos();");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("for (int i = 0; i < numWorkers; i++) {");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("// Add peer        ");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("if (esp_now_add_peer(&workers[i].info) != ESP_OK){");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("Serial.println(\"Failed to add peer\");");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("}else{");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("Serial.println(\"Succesfully added peer\");");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// Register for a callback function that will be called when data is received");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("esp_now_register_recv_cb(OnDataRecv);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("esp_now_register_send_cb(OnDataSent);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void populate_worker_infos () {");
    _builder.newLine();
    {
      EList<Worker> _workers = gateway.getWorkers();
      for(final Worker worker : _workers) {
        _builder.append("\t");
        String[] bytes = Utils.macAsBytes(worker.getMac());
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("set_mac_bytes(workers[");
        int _indexOf = Utils.indexOf(gateway, worker);
        _builder.append(_indexOf, "\t\t");
        _builder.append("].address, ");
        String _get_2 = bytes[0];
        _builder.append(_get_2, "\t\t");
        _builder.append(", ");
        String _get_3 = bytes[1];
        _builder.append(_get_3, "\t\t");
        _builder.append(", ");
        String _get_4 = bytes[2];
        _builder.append(_get_4, "\t\t");
        _builder.append(", ");
        String _get_5 = bytes[3];
        _builder.append(_get_5, "\t\t");
        _builder.append(", ");
        String _get_6 = bytes[4];
        _builder.append(_get_6, "\t\t");
        _builder.append(", ");
        String _get_7 = bytes[5];
        _builder.append(_get_7, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("memcpy(workers[");
        int _indexOf_1 = Utils.indexOf(gateway, worker);
        _builder.append(_indexOf_1, "\t\t");
        _builder.append("].info.peer_addr, workers[");
        int _indexOf_2 = Utils.indexOf(gateway, worker);
        _builder.append(_indexOf_2, "\t\t");
        _builder.append("].address, 6);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("workers[");
        int _indexOf_3 = Utils.indexOf(gateway, worker);
        _builder.append(_indexOf_3, "\t\t");
        _builder.append("].info.channel = 0;  ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("workers[");
        int _indexOf_4 = Utils.indexOf(gateway, worker);
        _builder.append(_indexOf_4, "\t\t");
        _builder.append("].info.encrypt = false;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void set_mac_bytes(uint8_t arr[6], uint8_t b0, uint8_t b1, uint8_t b2, uint8_t b3, uint8_t b4, uint8_t b5) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("arr[0] = b0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("arr[1] = b1;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("arr[2] = b2;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("arr[3] = b3;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("arr[4] = b4;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("arr[5] = b5;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("int32_t getWiFiChannel(const char *ssid) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (int32_t n = WiFi.scanNetworks()) {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("for (uint8_t i=0; i<n; i++) {");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("if (!strcmp(ssid, WiFi.SSID(i).c_str())) {");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("return WiFi.channel(i);");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void onConnectionEstablished()");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    {
      EList<Worker> _workers_1 = gateway.getWorkers();
      for(final Worker worker_1 : _workers_1) {
        {
          ArrayList<Setting> _settings = Utils.settings(worker_1);
          for(final Setting setting : _settings) {
            _builder.append("\t");
            _builder.append("client.subscribe(\"settings/\" + WiFi.macAddress() + \"/");
            String _mac = worker_1.getMac();
            _builder.append(_mac, "\t");
            _builder.append("/");
            String _bindingName = Utils.getBindingName(setting);
            _builder.append(_bindingName, "\t");
            _builder.append("\", [](const String &payload) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("set_worker_setting(");
            int _indexOfSetting = Utils.indexOfSetting(setting);
            _builder.append(_indexOfSetting, "\t");
            _builder.append(", ");
            int _indexOf_5 = Utils.indexOf(gateway, worker_1);
            _builder.append(_indexOf_5, "\t");
            _builder.append(", String(payload).toFloat());");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("});");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("worker_info get_worker_info(const uint8_t* mac) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (int i = 0; i < numWorkers; i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bool anyFalse = false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (int j = 0; j < 6; j++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (mac[j] != workers[i].address[j]) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("anyFalse = true;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (anyFalse == false) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return workers[i];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return null_worker;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void set_worker_setting(int setting, int workerIndex, float value) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("settingMessage.type = Setting;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("settingMessage.setting = setting;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("settingMessage.newValue = value;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("send_message(workers[workerIndex].address, (uint8_t *)&settingMessage, sizeof(settingMessage));");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("String get_topic(const String collection, const String gatewayMac, const String workerMac, const String subject) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return collection + \"/\" + gatewayMac + \"/\" + workerMac + \"/\" + subject;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("String get_topic(const String collection, const uint8_t* mac, const String subject) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return get_topic(collection, String(WiFi.macAddress()), mac_to_string(mac), subject);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("String get_topic(const String collection, const String subject) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return collection + \"/\" + String(WiFi.macAddress()) + \"/\" + subject;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void loop() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("client.loop();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void OnDataSent(const uint8_t *mac_addr, esp_now_send_status_t status) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("messageSuccess = status == ESP_NOW_SEND_SUCCESS;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.println(\"Send message status: \" + String(status == ESP_NOW_SEND_SUCCESS ? \"success\" : \"failure\"));");
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
    _builder.append("case Sample:");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("handle_sample(mac, incomingData, len);");
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
    _builder.append("result += hex8_to_string(mac[i]);");
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
    _builder.newLine();
    _builder.append("String hex8_to_string(uint8_t data) // prints 8-bit data in hex with leading zeroes");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("String result = \"\";");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if (data < 0x10) { result = result + \"0\"; }");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("result += String(data ,HEX);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("result.toUpperCase();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void handle_ping(const uint8_t* mac, const uint8_t *incomingData, int len) {");
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
    _builder.newLine();
    _builder.append("  ");
    _builder.append("client.publish(get_topic(\"logs\", mac, \"ping\"), String(millis()));");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void handle_sample(const uint8_t* mac, const uint8_t *incomingData, int len) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("memcpy(&sampleMessage, incomingData, sizeof(sampleMessage));");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.print(\"Sample recieved from \");");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("print_mac(mac);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.println(\"\");");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    {
      ArrayList<SensorOutput> _workerSensorOutputs_1 = Utils.getWorkerSensorOutputs(gateway);
      for(final SensorOutput output_1 : _workerSensorOutputs_1) {
        _builder.append("  ");
        _builder.append("if (!isnan(sampleMessage.");
        String _sampleMessageName_1 = Utils.getSampleMessageName(output_1);
        _builder.append(_sampleMessageName_1, "  ");
        _builder.append(")) {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("\t");
        _builder.append("client.publish(get_topic(\"samples\", mac, \"");
        String _sampleMqttSubject = Utils.getSampleMqttSubject(output_1);
        _builder.append(_sampleMqttSubject, "  \t");
        _builder.append("\"), String(sampleMessage.");
        String _sampleMessageName_2 = Utils.getSampleMessageName(output_1);
        _builder.append(_sampleMessageName_2, "  \t");
        _builder.append("));");
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
    _builder.append("bool success = false;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("for (int i = 0; i < ");
    Integer _retriesOrDefault = Utils.getRetriesOrDefault(gateway);
    _builder.append(_retriesOrDefault, "  ");
    _builder.append("; i++) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("esp_err_t result = esp_now_send(mac, incomingData, len);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("delay(250);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (messageSuccess) {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("success = true;");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Serial.println(\"Send message success: \" + String(success));");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("digitalWrite(");
    Integer _errorLedOrDefault_1 = Utils.getErrorLedOrDefault(gateway);
    _builder.append(_errorLedOrDefault_1, "  ");
    _builder.append(", success ? LOW : HIGH);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
