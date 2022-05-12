var chartIdToData = {};
var chartIdToChart = {};
var chartIdToChartExtras = {};

async function updateChart(chartId, topics, timeSinceNow) {
    var i = 0;
    chart1 = chartIdToChart[chartId]
    
    chart1.update();
    var chartExtras = chartIdToChartExtras[chartId]
    
        for (let i = 0; i < topics.length; i++) {
            var topic = topics[i]
            splitTopic = topic.split("/");
            var response = await _getData(splitTopic[0], splitTopic[1], splitTopic[2], splitTopic[3], Date.now() - timeSinceNow, Date.now());
    
            var chart1Data = chartIdToData[chartId];
    
            chart1Data.labels = [];
            chart1Data.datasets[i].data = [];
    
            chart1Data.datasets[i].borderColor.push(chartExtras.colors[i]);
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
        }

    chart1.update();
}

$(document).ready(function () {
const graph_ref389688062_context = document.getElementById('chart-Temperature').getContext('2d');
graph_ref389688062_data = {
    labels: [],
    datasets: [{
    	            label: '',
    	            data: [],
    	            borderColor: [
    	            ],
    	            borderWidth: 1
    	        }
    ]
}
	
graph_ref389688062 = new Chart(graph_ref389688062_context, {
    type: 'line',
    data: graph_ref389688062_data,
    options: {
        scales: {
            y: {
                title: {
                    display: true,
                    text: "Temperature (C)"
                }
            },
            x: {
                title: {
                    display: true,
                    text: "Time"
                }
            }
        }
    }
});
		
chartIdToData['chart-Temperature'] = graph_ref389688062_data;
chartIdToChart['chart-Temperature'] = graph_ref389688062;
chartIdToChartExtras['chart-Temperature'] = {}
chartIdToChartExtras['chart-Temperature'].colors = [];
    	
chartIdToChartExtras['chart-Temperature'].colors.push('rgba');
        
const graph_ref656199147_context = document.getElementById('chart-Humidity').getContext('2d');
graph_ref656199147_data = {
    labels: [],
    datasets: [{
    	            label: '',
    	            data: [],
    	            borderColor: [
    	            ],
    	            borderWidth: 1
    	        }
    ]
}
	
graph_ref656199147 = new Chart(graph_ref656199147_context, {
    type: 'line',
    data: graph_ref656199147_data,
    options: {
        scales: {
            y: {
                title: {
                    display: true,
                    text: "Humidity (%)"
                }
            },
            x: {
                title: {
                    display: true,
                    text: "Time"
                }
            }
        }
    }
});
		
chartIdToData['chart-Humidity'] = graph_ref656199147_data;
chartIdToChart['chart-Humidity'] = graph_ref656199147;
chartIdToChartExtras['chart-Humidity'] = {}
chartIdToChartExtras['chart-Humidity'].colors = [];
    	
chartIdToChartExtras['chart-Humidity'].colors.push('rgba');
        
	
    MQTTConnect(mqtt => {
        // Make vars
var mqtt_topic_123195959 = 'samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,temperature';
mqtt.subscribe(mqtt_topic_123195959);
var mqtt_topic_1639415340 = 'samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,humidity';
mqtt.subscribe(mqtt_topic_1639415340);

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
            
            
    	        if(message.destinationName == mqtt_topic_123195959) {
    	        		            graph_ref389688062_data.labels.push(xLabel);
    	        		            graph_ref389688062_data.datasets[0].data.push(message.payloadString);
    	        		            graph_ref389688062.update();
    	        }
    	        if(message.destinationName == mqtt_topic_1639415340) {
    	        		            graph_ref656199147_data.labels.push(xLabel);
    	        		            graph_ref656199147_data.datasets[0].data.push(message.payloadString);
    	        		            graph_ref656199147.update();
    	        }
        }
    });

	updateChart('chart-Temperature', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,temperature'], Date.now());
	updateChart('chart-Humidity', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,humidity'], Date.now());
});
