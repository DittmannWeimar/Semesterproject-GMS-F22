package dk.sdu.gms.dds.generator;

import dk.sdu.gms.dds.Utils;
import dk.sdu.gms.dds.deviceDefinition.Binding;
import dk.sdu.gms.dds.deviceDefinition.Gateway;
import dk.sdu.gms.dds.deviceDefinition.Graph;
import dk.sdu.gms.dds.deviceDefinition.GraphLine;
import dk.sdu.gms.dds.deviceDefinition.SensorOutput;
import dk.sdu.gms.dds.deviceDefinition.Worker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class WebClientGenerator {
  public static void generateWebClient(final dk.sdu.gms.dds.deviceDefinition.System system, final IFileSystemAccess2 fsa) {
    final String webClientRoot = "WebClient/";
    fsa.generateFile((webClientRoot + "styles/chart.css"), WebClientBoilerPlate.generateCSS());
    fsa.generateFile((webClientRoot + "bridge.php"), WebClientBoilerPlate.generateBridge());
    fsa.generateFile((webClientRoot + "header.php"), WebClientBoilerPlate.generateHeader());
    fsa.generateFile((webClientRoot + "commonBody.php"), WebClientBoilerPlate.generateCommonBody());
    fsa.generateFile((webClientRoot + "index.php"), WebClientBoilerPlate.generateIndex());
    final Gateway gateway = system.getGateway();
    final EList<Worker> workers = gateway.getWorkers();
    final HashMap<String, List<Graph>> graphsGroupedByCategory = new HashMap<String, List<Graph>>();
    for (int i = 0; (i < system.getGraphs().size()); i++) {
      {
        Graph currentGraph = system.getGraphs().get(i);
        boolean _containsKey = graphsGroupedByCategory.containsKey(currentGraph.getCategory());
        boolean _not = (!_containsKey);
        if (_not) {
          String _category = currentGraph.getCategory();
          ArrayList<Graph> _arrayList = new ArrayList<Graph>();
          graphsGroupedByCategory.put(_category, _arrayList);
        }
        graphsGroupedByCategory.get(currentGraph.getCategory()).add(currentGraph);
      }
    }
    final Consumer<Map.Entry<String, List<Graph>>> _function = (Map.Entry<String, List<Graph>> x) -> {
      String php = WebClientGenerator.generateCategoryPagePHP(x.getKey(), gateway, x.getValue());
      String js = WebClientGenerator.generateCategoryPageJavascript(x.getKey(), gateway, x.getValue());
      String _key = x.getKey();
      String _plus = ((webClientRoot + "category-pages/") + _key);
      String _plus_1 = (_plus + ".php");
      fsa.generateFile(_plus_1, php);
      String _key_1 = x.getKey();
      String _plus_2 = ((webClientRoot + "category-pages/") + _key_1);
      String _plus_3 = (_plus_2 + ".js");
      fsa.generateFile(_plus_3, js);
    };
    graphsGroupedByCategory.entrySet().forEach(_function);
    fsa.generateFile((webClientRoot + "helper.js"), WebClientGenerator.generateHelper(system));
  }
  
  public static String generateCategoryPagePHP(final String category, final Gateway gateway, final List<Graph> values) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>Green House Management System</title>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<?php require $_SERVER[\'DOCUMENT_ROOT\'] . \"/header.php\" ?>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"");
    _builder.append(category, "    ");
    _builder.append(".js\"></script>");
    _builder.newLineIfNotEmpty();
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<?php require $_SERVER[\'DOCUMENT_ROOT\'] . \"/commonBody.php\" ?>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<ul class=\"flex-container\">");
    _builder.newLine();
    {
      for(final Graph graph : values) {
        _builder.append("<li class=\"chart-container\">");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("<div class=\"centered\"><h3>");
        String _title = graph.getTitle();
        _builder.append(_title, "    ");
        _builder.append("</h3></div>");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("<canvas id=\"chart-");
        String _title_1 = graph.getTitle();
        _builder.append(_title_1, "    ");
        _builder.append("\"></canvas>");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("<div>");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("<button id=\"chart-");
        String _title_2 = graph.getTitle();
        _builder.append(_title_2, "        ");
        _builder.append("-all\" class=\"btn btn-link\" onclick=\"updateChart(\'chart-");
        String _title_3 = graph.getTitle();
        _builder.append(_title_3, "        ");
        _builder.append("\', [");
        String _graphTopics = WebClientGenerator.getGraphTopics(graph);
        _builder.append(_graphTopics, "        ");
        _builder.append("], Date.now())\">All</button>");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("<button id=\"chart-");
        String _title_4 = graph.getTitle();
        _builder.append(_title_4, "        ");
        _builder.append("-year\" class=\"btn btn-link\" onclick=\"updateChart(\'chart-");
        String _title_5 = graph.getTitle();
        _builder.append(_title_5, "        ");
        _builder.append("\', [");
        String _graphTopics_1 = WebClientGenerator.getGraphTopics(graph);
        _builder.append(_graphTopics_1, "        ");
        _builder.append("], 12*28*24*60*60*1000)\">Last Year</button>");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("<button id=\"chart-");
        String _title_6 = graph.getTitle();
        _builder.append(_title_6, "        ");
        _builder.append("-month\" class=\"btn btn-link\" onclick=\"updateChart(\'chart-");
        String _title_7 = graph.getTitle();
        _builder.append(_title_7, "        ");
        _builder.append("\', [");
        String _graphTopics_2 = WebClientGenerator.getGraphTopics(graph);
        _builder.append(_graphTopics_2, "        ");
        _builder.append("], 28*24*60*60*1000)\">Last Month</button>");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("<button id=\"chart-");
        String _title_8 = graph.getTitle();
        _builder.append(_title_8, "        ");
        _builder.append("-week\" class=\"btn btn-link\" onclick=\"updateChart(\'chart-");
        String _title_9 = graph.getTitle();
        _builder.append(_title_9, "        ");
        _builder.append("\', [");
        String _graphTopics_3 = WebClientGenerator.getGraphTopics(graph);
        _builder.append(_graphTopics_3, "        ");
        _builder.append("], 7*24*60*60*1000)\">Last Week</button>");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("<button id=\"chart-");
        String _title_10 = graph.getTitle();
        _builder.append(_title_10, "        ");
        _builder.append("-24-hour\" class=\"btn btn-link\" onclick=\"updateChart(\'chart-");
        String _title_11 = graph.getTitle();
        _builder.append(_title_11, "        ");
        _builder.append("\', [");
        String _graphTopics_4 = WebClientGenerator.getGraphTopics(graph);
        _builder.append(_graphTopics_4, "        ");
        _builder.append("], 24*60*60*1000)\">24 Hours</button>");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("<button id=\"chart-");
        String _title_12 = graph.getTitle();
        _builder.append(_title_12, "        ");
        _builder.append("-last-hour\" class=\"btn btn-link\" onclick=\"updateChart(\'chart-");
        String _title_13 = graph.getTitle();
        _builder.append(_title_13, "        ");
        _builder.append("\', [");
        String _graphTopics_5 = WebClientGenerator.getGraphTopics(graph);
        _builder.append(_graphTopics_5, "        ");
        _builder.append("], 60*60*1000)\">Last Hour</button>");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("</li>");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String generateCategoryPageJavascript(final String category, final Gateway gateway, final List<Graph> values) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var chartIdToData = {};");
    _builder.newLine();
    _builder.append("var chartIdToChart = {};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("async function updateChart(chartId, topics, timeSinceNow) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var i = 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("chart1 = chartIdToChart[chartId]");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("chart1.update();");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (let i = 0; i < topics.length; i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("var topic = topics[i]");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("splitTopic = topic.split(\"/\");");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("var response = await _getData(splitTopic[0], splitTopic[1], splitTopic[2], splitTopic[3], Date.now() - timeSinceNow, Date.now());");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("var chart1Data = chartIdToData[chartId];");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("chart1Data.labels = [];");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("chart1Data.datasets[i].data = [];");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("chart1Data.datasets[i].borderColor.push(\'rgba(99, 255, 132, 1)\');");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("response.forEach(res => {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("var date = new Date(res.timestamp);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("var xLabel;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (new Date(Date.now()).toISOString().split(\'T\')[0] == date.toISOString().split(\'T\')[0]) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("xLabel = date.toLocaleTimeString();");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("xLabel = date.toLocaleDateString() + \"T\" + date.toLocaleTimeString();");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("chart1Data.labels.push(xLabel);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("chart1Data.datasets[i].data.push(res.message);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("});");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("chart1.update();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("$(document).ready(function () {");
    _builder.newLine();
    {
      for(final Graph graph : values) {
        _builder.append("const ");
        String _generateVarName = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName);
        _builder.append("_context = document.getElementById(\'chart-");
        String _title = graph.getTitle();
        _builder.append(_title);
        _builder.append("\').getContext(\'2d\');");
        _builder.newLineIfNotEmpty();
        String _generateVarName_1 = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName_1);
        _builder.append("_data = {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("labels: [],");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("datasets: [");
        String _graphSettings = WebClientGenerator.graphSettings(graph);
        _builder.append(_graphSettings, "    ");
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        String _generateVarName_2 = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName_2);
        _builder.append(" = new Chart(");
        String _generateVarName_3 = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName_3);
        _builder.append("_context, {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("type: \'line\',");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("data: ");
        String _generateVarName_4 = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName_4, "    ");
        _builder.append("_data,");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("options: {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("scales: {");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("y: {");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("title: {");
        _builder.newLine();
        _builder.append("                    ");
        _builder.append("display: true,");
        _builder.newLine();
        _builder.append("                    ");
        _builder.append("text: \"");
        String _ylabel = graph.getYlabel();
        _builder.append(_ylabel, "                    ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("                ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("},");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("x: {");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("title: {");
        _builder.newLine();
        _builder.append("                    ");
        _builder.append("display: true,");
        _builder.newLine();
        _builder.append("                    ");
        _builder.append("text: \"");
        String _xlabel = graph.getXlabel();
        _builder.append(_xlabel, "                    ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("                ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("});");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("chartIdToData[\'chart-");
        String _title_1 = graph.getTitle();
        _builder.append(_title_1);
        _builder.append("\'] = ");
        String _generateVarName_5 = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName_5);
        _builder.append("_data;");
        _builder.newLineIfNotEmpty();
        _builder.append("chartIdToChart[\'chart-");
        String _title_2 = graph.getTitle();
        _builder.append(_title_2);
        _builder.append("\'] = ");
        String _generateVarName_6 = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName_6);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("MQTTConnect(mqtt => {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Make vars");
    _builder.newLine();
    {
      for(final Graph graph_1 : values) {
        {
          EList<GraphLine> _lines = graph_1.getLines();
          for(final GraphLine line : _lines) {
            _builder.append("var mqtt_topic_");
            int _abs = Math.abs(line.hashCode());
            _builder.append(_abs);
            _builder.append(" = \'");
            String _topic = WebClientGenerator.getTopic(line);
            _builder.append(_topic);
            _builder.append("\';");
            _builder.newLineIfNotEmpty();
            _builder.append("mqtt.subscribe(mqtt_topic_");
            int _abs_1 = Math.abs(line.hashCode());
            _builder.append(_abs_1);
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mqtt.onMessageArrived = function (message) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("console.log(\"Message Arrived: \" + message.payloadString);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("console.log(\"Topic:     \" + message.destinationName);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("console.log(\"QoS:       \" + message.qos);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("console.log(\"Retained:  \" + message.retained);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// Read Only, set if message might be a duplicate sent from broker");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("console.log(\"Duplicate: \" + message.duplicate);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("            ");
    _builder.append("var now = Date.now();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("var date = new Date(now);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("xLabel = date.toLocaleTimeString();");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    {
      for(final Graph graph_2 : values) {
        _builder.append("    \t        ");
        String _generate = WebClientGenerator.generate(graph_2.getLines(), graph_2);
        _builder.append(_generate, "    \t        ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Graph graph_3 : values) {
        _builder.append("\t");
        _builder.append("updateChart(\'chart-");
        String _title_3 = graph_3.getTitle();
        _builder.append(_title_3, "\t");
        _builder.append("\', [");
        String _graphTopics = WebClientGenerator.getGraphTopics(graph_3);
        _builder.append(_graphTopics, "\t");
        _builder.append("], Date.now());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("});");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String generateHelper(final dk.sdu.gms.dds.deviceDefinition.System system) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var categorySubfolder = \"category-pages/\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function addCategory(name) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var categoryBinding = _createCategoryJSBinding(name)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("$(\'#navbar-categories\').append(`<li id = ${categoryBinding.name}><a href=\"${\"/\" + categorySubfolder + categoryBinding.id + \".php\"}\"> ${categoryBinding.name} </a></li>`)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function _createCategoryJSBinding(name) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("name: name,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Replace space with nothing");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("id: name.replace(/\\s+/g, \'\')");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("$(document).ready(function () {");
    _builder.newLine();
    {
      List<String> _categories = WebClientGenerator.getCategories(system.getGraphs());
      for(final String cat : _categories) {
        _builder.append("\t");
        _builder.append("addCategory(\"");
        String _firstUpper = StringExtensions.toFirstUpper(cat);
        _builder.append(_firstUpper, "\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("//API Call");
    _builder.newLine();
    _builder.append("var apiUrlRoot = \"http://\"+location.host+\"/Bridge.php\";");
    _builder.newLine();
    _builder.append("console.log(\"API URL: \"+apiUrlRoot)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function _getData(type, gateway, worker, topic, from = 0, to = Number.MAX_SAFE_INTEGER) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var actualUrl = apiUrlRoot + \"?type=\"+type+\"&gateway=\"+gateway+\"&worker=\"+worker+\"&topic=\"+topic+\"&from=\"+from+\"&to=\"+to;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return new Promise((resolve, reject) => {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("$.ajax({");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("url: actualUrl,");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("type: \'GET\',");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("data: {},");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("success: function (data) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("resolve(JSON.parse(data))");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("error: function (error) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("reject(error)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//MQTT!");
    _builder.newLine();
    _builder.append("var isTestingLocally = false;");
    _builder.newLine();
    _builder.append("var mqtt;");
    _builder.newLine();
    _builder.append("var reconnectTimeout = 2000;");
    _builder.newLine();
    _builder.append("var host = location.host");
    _builder.newLine();
    _builder.append("var port = 3002");
    _builder.newLine();
    _builder.append("var username = \"kristian\"");
    _builder.newLine();
    _builder.append("var pw = \"1234\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if (!isTestingLocally) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("mqtt;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("reconnectTimeout = 2000;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("host = MQTT_HOST.split(\":\")[1]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("port = parseInt(MQTT_HOST.split(\":\")[2])");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("username = MQTT_USERNAME");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("pw = MQTT_PASSWORD");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("console.log(\"MQTT\");");
    _builder.newLine();
    _builder.append("console.log(\"Host: \"+host);");
    _builder.newLine();
    _builder.append("console.log(\"Port: \"+port);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function _onConnect(callback = null) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("console.log(\"Connected to MQTT!\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Subscribe to topics");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("callback(mqtt);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function MQTTConnect(callback) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("mqtt = new Paho.MQTT.Client(host, port, \"/ws\", \"kristian\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var options = {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("timeout: 5,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("onSuccess: () => _onConnect(callback),");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("onFailure: () => {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("console.log(\"MQTT Failed to connect..\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("},");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("userName: username,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("password: pw");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("mqtt.connect(options)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function MQTTSend(topic, message) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("console.log(\"Sending message\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("console.log(\"Topic: \" + topic);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("console.log(\"Message: \" + message);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Connect and send");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("MQTTConnect((x) => {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("message = new Paho.MQTT.Message(message);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("message.destinationName = topic;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mqtt.send(message)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String getGraphTopics(final Graph graph) {
    String _xblockexpression = null;
    {
      String result = "";
      for (int i = 0; (i < graph.getLines().size()); i++) {
        {
          String _result = result;
          String _topic = WebClientGenerator.getTopic(graph.getLines().get(i));
          String _plus = ("\'" + _topic);
          String _plus_1 = (_plus + "\'");
          result = (_result + _plus_1);
          int _size = graph.getLines().size();
          int _minus = (_size - 1);
          boolean _notEquals = (i != _minus);
          if (_notEquals) {
            String _result_1 = result;
            result = (_result_1 + ", ");
          }
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static List<Worker> getWorkersByGraph(final Graph graph) {
    ArrayList<Worker> _xblockexpression = null;
    {
      final ArrayList<Worker> workers = new ArrayList<Worker>();
      final Consumer<GraphLine> _function = (GraphLine line) -> {
        workers.add(line.getOutput().getWorker());
      };
      graph.getLines().forEach(_function);
      _xblockexpression = workers;
    }
    return _xblockexpression;
  }
  
  public static String getTopic(final GraphLine line) {
    String _switchResult = null;
    Binding _ref = line.getOutput().getRef();
    boolean _matched = false;
    if (_ref instanceof SensorOutput) {
      _matched=true;
      Binding _ref_1 = line.getOutput().getRef();
      _switchResult = Utils.getSampleMqttTopic(((SensorOutput) _ref_1));
    }
    if (!_matched) {
      throw new RuntimeException("Line binding must be SensorOutput!");
    }
    return _switchResult;
  }
  
  public static String generateVarName(final SensorOutput sensorOutput) {
    int _abs = Math.abs(sensorOutput.hashCode());
    return ("mqtt_" + Integer.valueOf(_abs));
  }
  
  public static String generateVarName(final Graph sensorOutput) {
    int _abs = Math.abs(sensorOutput.hashCode());
    return ("graph_ref" + Integer.valueOf(_abs));
  }
  
  public static String generate(final List<GraphLine> graphLines, final Graph graph) {
    String _xblockexpression = null;
    {
      String result = "";
      for (int i = 0; (i < graphLines.size()); i++) {
        {
          GraphLine graphLine = graphLines.get(i);
          String _result = result;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("if(message.destinationName == mqtt_topic_");
          int _abs = Math.abs(graphLine.hashCode());
          _builder.append(_abs);
          _builder.append(") {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t            ");
          String _generateVarName = WebClientGenerator.generateVarName(graph);
          _builder.append(_generateVarName, "\t\t            ");
          _builder.append("_data.labels.push(xLabel);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t            ");
          String _generateVarName_1 = WebClientGenerator.generateVarName(graph);
          _builder.append(_generateVarName_1, "\t\t            ");
          _builder.append("_data.datasets[");
          _builder.append(i, "\t\t            ");
          _builder.append("].data.push(message.payloadString);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t            ");
          String _generateVarName_2 = WebClientGenerator.generateVarName(graph);
          _builder.append(_generateVarName_2, "\t\t            ");
          _builder.append(".update();");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          result = (_result + _builder);
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static String graphSettings(final Graph graph) {
    String _xblockexpression = null;
    {
      String result = "";
      for (int i = 0; (i < graph.getLines().size()); i++) {
        {
          String _result = result;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t            ");
          _builder.append("label: \'");
          String _legend = graph.getLines().get(i).getLegend();
          _builder.append(_legend, "\t            ");
          _builder.append("\',");
          _builder.newLineIfNotEmpty();
          _builder.append("\t            ");
          _builder.append("data: [],");
          _builder.newLine();
          _builder.append("\t            ");
          _builder.append("borderColor: [");
          _builder.newLine();
          _builder.append("\t            ");
          _builder.append("],");
          _builder.newLine();
          _builder.append("\t            ");
          _builder.append("borderWidth: 1");
          _builder.newLine();
          _builder.append("\t        ");
          _builder.append("}");
          _builder.newLine();
          result = (_result + _builder);
          int _size = graph.getLines().size();
          int _minus = (_size - 1);
          boolean _notEquals = (i != _minus);
          if (_notEquals) {
            String _result_1 = result;
            result = (_result_1 + ",");
          }
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static List<String> getCategories(final List<Graph> graphs) {
    ArrayList<String> _xblockexpression = null;
    {
      ArrayList<String> categories = new ArrayList<String>();
      for (int i = 0; (i < graphs.size()); i++) {
        {
          String name = graphs.get(i).getCategory();
          boolean _contains = categories.contains(name);
          boolean _not = (!_contains);
          if (_not) {
            categories.add(name);
          }
        }
      }
      _xblockexpression = categories;
    }
    return _xblockexpression;
  }
}
