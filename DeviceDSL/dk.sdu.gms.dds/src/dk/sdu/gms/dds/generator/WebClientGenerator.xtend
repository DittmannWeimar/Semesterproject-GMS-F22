package dk.sdu.gms.dds.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.HashMap
import dk.sdu.gms.dds.deviceDefinition.Graph
import java.util.List
import java.util.ArrayList
import dk.sdu.gms.dds.deviceDefinition.Worker
import dk.sdu.gms.dds.deviceDefinition.Gateway
import dk.sdu.gms.dds.deviceDefinition.GraphLine
import dk.sdu.gms.dds.deviceDefinition.SensorOutput
import dk.sdu.gms.dds.Utils

class WebClientGenerator {
	public static def generateWebClient (dk.sdu.gms.dds.deviceDefinition.System system, IFileSystemAccess2 fsa) {
		val webClientRoot = "WebClient/"
		
		// Generate boiler plate files.		
		fsa.generateFile(webClientRoot + "styles/chart.css", WebClientBoilerPlate.generateCSS)
		fsa.generateFile(webClientRoot + "bridge.php", WebClientBoilerPlate.generateBridge)
		fsa.generateFile(webClientRoot + "header.php", WebClientBoilerPlate.generateHeader)
		fsa.generateFile(webClientRoot + "commonBody.php", WebClientBoilerPlate.generateCommonBody)
		fsa.generateFile(webClientRoot + "index.php", WebClientBoilerPlate.generateIndex)
		
		
		// Generate specific files.
		val gateway = system.gateway
		val workers = gateway.workers
		
		// Group all graphs by category
		val graphsGroupedByCategory = new HashMap<String, List<Graph>>()
		for(var i = 0; i < system.graphs.size; i++) {
			var currentGraph = system.graphs.get(i)
			
			if(!graphsGroupedByCategory.containsKey(currentGraph.category)) {
				graphsGroupedByCategory.put(currentGraph.category, new ArrayList<Graph>())
			}
			
			graphsGroupedByCategory.get(currentGraph.category).add(currentGraph)
		}
		
		graphsGroupedByCategory.entrySet.forEach[x | 
			var php = x.key.generateCategoryPagePHP(gateway, x.value)
			var js = x.key.generateCategoryPageJavascript(gateway, x.value)
			
			fsa.generateFile(webClientRoot + "category-pages/"+x.key+".php", php)
			fsa.generateFile(webClientRoot + "category-pages/"+x.key+".js", js)
		]
		
		fsa.generateFile(webClientRoot + "helper.js", generateHelper(system))
		
	}
	
	def static String generateCategoryPagePHP(String category, Gateway gateway, List<Graph> values) '''
	<!DOCTYPE html>
	<html>
	
	<head>
	    <title>Green House Management System</title>
	    <?php require $_SERVER['DOCUMENT_ROOT'] . "/header.php" ?>
	    <script src="WaterLevels.js"></script>
	</head>
	
	<body>
	    <?php require $_SERVER['DOCUMENT_ROOT'] . "/commonBody.php" ?>
	    <ul class="flex-container">
	    	�FOR graph: values�
			<li class="chart-container">
			    <div class="centered"><h3>�graph.title�</h3></div>
			    <canvas id="chart-�graph.title�"></canvas>
			    <div>
			        <button id="chart-�graph.title�-all" class="btn btn-link" onclick="updateChart('chart-�graph.title�', [�graph.graphTopics�], Date.now())">All</button>
			        <button id="chart-�graph.title�-year" class="btn btn-link" onclick="updateChart('chart-�graph.title�', [�graph.graphTopics�], 12*28*24*60*60*1000)">Last Year</button>
			        <button id="chart-�graph.title�-month" class="btn btn-link" onclick="updateChart('chart-�graph.title�', [�graph.graphTopics�], 28*24*60*60*1000)">Last Month</button>
			        <button id="chart-�graph.title�-week" class="btn btn-link" onclick="updateChart('chart-�graph.title�', [�graph.graphTopics�], 7*24*60*60*1000)">Last Week</button>
			        <button id="chart-�graph.title�-24-hour" class="btn btn-link" onclick="updateChart('chart-�graph.title�', [�graph.graphTopics�], 24*60*60*1000)">24 Hours</button>
			        <button id="chart-�graph.title�-last-hour" class="btn btn-link" onclick="updateChart('chart-�graph.title�', [�graph.graphTopics�], 60*60*1000)">Last Hour</button>
			    </div>
			</li>
	    	�ENDFOR�
	    </ul>
	</body>
	
	</html>
	'''
	
	def static String generateCategoryPageJavascript(String category, Gateway gateway, List<Graph> values) '''
	var chartIdToData = {};
	var chartIdToChart = {};
	
	async function updateChart(chartId, topics, timeSinceNow) {
	    var i = 0;
	    chart1 = chartIdToChart[chartId]
	    
	    chart1.update();
	
	    topics.forEach(topic => {
	    	splitTopic = topic.split("/");
	        var response = await _getData(splitTopic[0], splitTopic[1], splitTopic[2], splitTopic[3], Date.now() - timeSinceNow, Date.now());
	
	        var chart1Data = chartIdToData[chartId];
	    
	        chart1Data.labels = [];
	        chart1Data.datasets[i].data = [];
	    
	        chart1Data.datasets[i].borderColor.push('rgba(99, 255, 132, 1)');
	        response.forEach(res => {
	            var date = new Date(res.timestamp);
	            var xLabel;
	            if (new Date(Date.now()).toISOString().split('T')[0] == date.toISOString().split('T')[0]) {
	                xLabel = date.toLocaleTimeString();
	            } else {
	                xLabel = date.toLocaleDateString() + "T" + date.toLocaleTimeString();
	            }
	    
	            chart1Data.labels.push(xLabel);
	            chart1Data.datasets[i].data.push(res.message);
	        });
	
	        i++;
	    });
	
	    chart1.update();
	}
	
	$(document).ready(function () {
		�FOR graph: values�
	    const �graph.generateVarName�_context = document.getElementById('chart-�graph.title�').getContext('2d');
	    �graph.generateVarName�_data = {
	        labels: [],
	        datasets: [�graph.graphSettings�]
	    }
	
	    �graph.generateVarName� = new Chart(�graph.generateVarName�_context�, {
	        type: 'line',
	        data: �graph.generateVarName�_data,
	        options: {
	            scales: {
	                y: {
	                    title: {
	                        display: true,
	                        text: "�graph.xlabel�"
	                    }
	                },
	                x: {
	                    title: {
	                        display: true,
	                        text: "�graph.ylabel�"
	                    }
	                }
	            }
	        }
	    });
		
	    chartIdToData['chart-�graph.title�'] = �graph.generateVarName�_data;
	    chartIdToChart['chart-�graph.title�'] = �graph.generateVarName�;
		�ENDFOR�
		
	    MQTTConnect(mqtt => {
	        // Make vars
	        �FOR graph: values�
	        	�FOR line: graph.lines�
    	        	var mqtt_topic_�Math.abs(line.hashCode)� = '�line.topic�';
    	        	mqtt.subscribe(mqtt_topic_�Math.abs(line.hashCode)�);
    	        �ENDFOR�
	        �ENDFOR�
	
	        mqtt.onMessageArrived = function (message) {
	            console.log("Message Arrived: " + message.payloadString);
	            console.log("Topic:     " + message.destinationName);
	            console.log("QoS:       " + message.qos);
	            console.log("Retained:  " + message.retained);
	            // Read Only, set if message might be a duplicate sent from broker
	            console.log("Duplicate: " + message.duplicate);
	
	            var now = Date.now();
	            var date = new Date(now);
	            xLabel = date.toLocaleTimeString();
	            
	            
    	        �FOR graph: values�
    	        	�FOR line: graph.lines�
    	        		if(message.destinationName == mqtt_topic_�Math.abs(line.hashCode)�) {
    			            �graph.generateVarName�_data.labels.push(xLabel);
    			            �graph.generateVarName�_data.datasets[0].data.push(message.payloadString);
    			            �graph.generateVarName�.update();
	        			}
	        			
        	        �ENDFOR�
    	        �ENDFOR�
	        }
	    });
	
		�FOR graph: values�
		    updateChart('chart-�graph.title�', [�graph.graphTopics�], Date.now());
		�ENDFOR�
	});
	'''
	
	def static String generateHelper(dk.sdu.gms.dds.deviceDefinition.System system) '''
	var categorySubfolder = "category-pages/";
	
	function addCategory(name) {
	    var categoryBinding = _createCategoryJSBinding(name)
	    $('#navbar-categories').append(`<li id = ${categoryBinding.name}><a href="${"/" + categorySubfolder + categoryBinding.id + ".php"}"> ${categoryBinding.name} </a></li>`)
	}
	
	function _createCategoryJSBinding(name) {
	    return {
	        name: name,
	        // Replace space with nothing
	        id: name.replace(/\s+/g, '')
	    }
	}
	
	$(document).ready(function () {
		�FOR cat: system.graphs.categories�
			addCategory("�cat.toFirstUpper�");
		�ENDFOR�
	});
	
	
	//API Call
	var apiUrlRoot = "http://"+location.host+"/Bridge.php";
	console.log("API URL: "+apiUrlRoot)
	
	function _getData(type, gateway, worker, topic, from = 0, to = Number.MAX_SAFE_INTEGER) {
	    var actualUrl = apiUrlRoot + "?type="+type+"&gateway="+gateway+"&worker="+worker+"&topic="+topic+"&from="+from+"&to="+to;
	    return new Promise((resolve, reject) => {
	        $.ajax({
	            url: actualUrl,
	            type: 'GET',
	            data: {},
	            success: function (data) {
	                resolve(JSON.parse(data))
	            },
	            error: function (error) {
	                reject(error)
	            },
	        })
	    })
	}
	
	//MQTT!
	var isTestingLocally = false;
	var mqtt;
	var reconnectTimeout = 2000;
	var host = location.host
	var port = 3002
	var username = "kristian"
	var pw = "1234"
	
	if (!isTestingLocally) {
	    mqtt;
	    reconnectTimeout = 2000;
	    host = MQTT_HOST.split(":")[1]
	    port = parseInt(MQTT_HOST.split(":")[2])
	    username = MQTT_USERNAME
	    pw = MQTT_PASSWORD
	}
	
	console.log("MQTT");
	console.log("Host: "+host);
	console.log("Port: "+port);
	
	function _onConnect(callback = null) {
	    console.log("Connected to MQTT!");
	    // Subscribe to topics
	
	    callback(mqtt);
	}
	
	function MQTTConnect(callback) {
	    mqtt = new Paho.MQTT.Client(host, port, "/ws", "kristian");
	    var options = {
	        timeout: 5,
	        onSuccess: () => _onConnect(callback),
	        onFailure: () => {
	            console.log("MQTT Failed to connect..");
	        },
	        userName: username,
	        password: pw
	    }
	
	    mqtt.connect(options)
	}
	
	function MQTTSend(topic, message) {
	    console.log("Sending message");
	    console.log("Topic: " + topic);
	    console.log("Message: " + message);
	
	    // Connect and send
	    MQTTConnect((x) => {
	        message = new Paho.MQTT.Message(message);
	        message.destinationName = topic;
	
	        mqtt.send(message)
	    })
	}
	'''
	
	def static String getGraphTopics(Graph graph) {
		var result = ""
		
		for(var i = 0; i < graph.lines.size; i++) {
			result += "'" + graph.lines.get(i).topic + "'"
			if(i != graph.lines.size - 1) {
				result += ", "
			}
		}
		
		result
	}
	
	def static List<Worker> getWorkersByGraph(Graph graph) {
		val workers = new ArrayList<Worker>();
		
		graph.lines.forEach[line |
			workers.add(line.output.worker)
		]
		
		workers
	}
	
	def static String getTopic(GraphLine line) {
		
		switch(line.output.ref) {
			SensorOutput: Utils.getSampleMqttTopic(line.output.ref as SensorOutput)
			default: throw new RuntimeException("Line binding must be SensorOutput!")
		}
		
	}
	
	def static String generateVarName(SensorOutput sensorOutput) {
		return "mqtt_"+Math.abs(sensorOutput.hashCode)
	}
	
	def static String generateVarName(Graph sensorOutput) {
		return "graph_ref"+Math.abs(sensorOutput.hashCode)
	}
	
	def static String graphSettings(Graph graph) {
		var result = ""
		for(var i = 0; i < graph.lines.size; i++) {			
			result += '''
			{
	            label: '�graph.lines.get(i).legend�',
	            data: [],
	            borderColor: [
	            ],
	            borderWidth: 1
	        }
			'''
			
			if(i != graph.lines.size - 1) {
				result += ","
			}
		}
		
		result
	}
	
	def static List<String> getCategories(List<Graph> graphs) {
		var categories = new ArrayList<String>()
		
		for(var i = 0; i < graphs.size; i++) {
			var name = graphs.get(i).category
			if(!categories.contains(name)) {
				categories.add(name)
			}
		} 
		
		categories
	}
}