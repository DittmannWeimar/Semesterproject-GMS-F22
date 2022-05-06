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

@SuppressWarnings("all")
public class WebClientGenerator {
  public static void generateWebClient(final dk.sdu.gms.dds.deviceDefinition.System system, final IFileSystemAccess2 fsa) {
    final String webClientRoot = "WebClient/";
    fsa.generateFile((webClientRoot + "styles/chart.css"), WebClientBoilerPlate.getCSS());
    fsa.generateFile((webClientRoot + "bridge.php"), WebClientBoilerPlate.getBridge());
    fsa.generateFile((webClientRoot + "header.php"), WebClientBoilerPlate.getHeader());
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
    _builder.append("<script src=\"WaterLevels.js\"></script>");
    _builder.newLine();
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
  
  public static String generateCategoryPageJavascript(final String category, final Gateway gateway, final List<Graph> values) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var chartIdToData = {};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("async function updateChart(chartId, topics, timeSinceNow) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var i = 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("chart1.update();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("topics.forEach(topic => {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("var response = await _getData(type, topic, Date.now() - timeSinceNow, Date.now());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("var chart1Data = chartIdToData[chartId];");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("chart1Data.labels = [];");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("chart1Data.datasets[i].data = [];");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("chart1Data.datasets[i].borderColor.push(\'rgba(99, 255, 132, 1)\');");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("response.forEach(res => {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("var date = new Date(res.timestamp);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("var xLabel;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (new Date(Date.now()).toISOString().split(\'T\')[0] == date.toISOString().split(\'T\')[0]) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("xLabel = date.toLocaleTimeString();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("xLabel = date.toLocaleDateString() + \"T\" + date.toLocaleTimeString();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("chart1Data.labels.push(xLabel);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("chart1Data.datasets[i].data.push(res.message);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("i++;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("});");
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
        _builder.append("\t    ");
        _builder.append("const ");
        String _generateVarName = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName, "\t    ");
        _builder.append("_context = document.getElementById(\'chart-");
        String _title = graph.getTitle();
        _builder.append(_title, "\t    ");
        _builder.append("\').getContext(\'2d\');");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    ");
        String _generateVarName_1 = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName_1, "\t    ");
        _builder.append("_data = {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("labels: [],");
        _builder.newLine();
        _builder.append("\t        ");
        _builder.append("datasets: [");
        String _graphSettings = WebClientGenerator.graphSettings(graph);
        _builder.append(_graphSettings, "\t        ");
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t    ");
        String _generateVarName_2 = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName_2, "\t    ");
        _builder.append(" = new Chart(ctx, {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("type: \'line\',");
        _builder.newLine();
        _builder.append("\t        ");
        _builder.append("data: ");
        String _generateVarName_3 = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName_3, "\t        ");
        _builder.append("_data,");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("options: {");
        _builder.newLine();
        _builder.append("\t            ");
        _builder.append("scales: {");
        _builder.newLine();
        _builder.append("\t                ");
        _builder.append("y: {");
        _builder.newLine();
        _builder.append("\t                    ");
        _builder.append("title: {");
        _builder.newLine();
        _builder.append("\t                        ");
        _builder.append("display: true,");
        _builder.newLine();
        _builder.append("\t                        ");
        _builder.append("text: ");
        String _xlabel = graph.getXlabel();
        _builder.append(_xlabel, "\t                        ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t                    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t                ");
        _builder.append("},");
        _builder.newLine();
        _builder.append("\t                ");
        _builder.append("x: {");
        _builder.newLine();
        _builder.append("\t                    ");
        _builder.append("title: {");
        _builder.newLine();
        _builder.append("\t                        ");
        _builder.append("display: true,");
        _builder.newLine();
        _builder.append("\t                        ");
        _builder.append("text: ");
        String _ylabel = graph.getYlabel();
        _builder.append(_ylabel, "\t                        ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t                    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t                ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t            ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t        ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("});");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("chartIdToData[\'chart-");
        String _title_1 = graph.getTitle();
        _builder.append(_title_1, "\t    ");
        _builder.append("\'] = ");
        String _generateVarName_4 = WebClientGenerator.generateVarName(graph);
        _builder.append(_generateVarName_4, "\t    ");
        _builder.append("_data;");
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
    _builder.append("        ");
    _builder.append("var mqtt_");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mqtt.subscribe(\"samples/gateway/worker1/Humidity\");");
    _builder.newLine();
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
    _builder.newLine();
    _builder.append("            ");
    _builder.append("chart1Data.labels.push(xLabel);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("chart1Data.datasets[0].data.push(message.payloadString);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("chart1.update();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("updateChart(\'chart-worker1\', \'samples\', \'*\', \'worker1\', \'Humidity\', Date.now());");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String graphSettings(final Graph graph) {
    String _xblockexpression = null;
    {
      String result = "";
      for (int i = 0; (i < graph.getLines().size()); i++) {
        {
          int _size = graph.getLines().size();
          int _minus = (_size - 1);
          boolean _notEquals = (i != _minus);
          if (_notEquals) {
            String _result = result;
            result = (_result + ",");
          }
          String _result_1 = result;
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
          result = (_result_1 + _builder);
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
