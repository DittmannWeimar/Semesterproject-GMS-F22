var chartIdToData = {};

async function updateChart(chartId, type, gateway, worker, measurement, timeSinceNow) {
    var response = await _getData(type, gateway, worker, measurement, Date.now() - timeSinceNow, Date.now());

    var chart1Data = chartIdToData[chartId];

    chart1Data.labels = [];
    chart1Data.datasets[0].data = [];

    chart1.update();

    chart1Data.datasets[0].borderColor.push('rgba(99, 255, 132, 1)');
    chart1Data.datasets[1].borderColor.push('rgba(255, 99, 132, 1)');
    response.forEach(res => {
        var date = new Date(res.timestamp);
        var xLabel;
        if (new Date(Date.now()).toISOString().split('T')[0] == date.toISOString().split('T')[0]) {
            xLabel = date.toLocaleTimeString();
        } else {
            xLabel = date.toLocaleDateString() + "T" + date.toLocaleTimeString();
        }

        chart1Data.labels.push(xLabel);
        chart1Data.datasets[0].data.push(res.message);

        chart1Data.datasets[1].data.push(res.message-5);
    });

    chart1.update();
}

$(document).ready(function () {
    const ctx = document.getElementById('chart-worker1').getContext('2d');
    chart1Data = {
        labels: [],
        datasets: [{
            label: 'Water Levels',
            data: [],
            borderColor: [
            ],
            borderWidth: 1
        },{
            label: 'Humidity',
            data: [],
            borderColor: [
            ],
            borderWidth: 1
        }]
    }


    chart1 = new Chart(ctx, {
        type: 'line',
        data: chart1Data,
        options: {
            scales: {
                y: {
                    title: {
                        display: true,
                        text: 'Water Levels'
                    }
                },
                x: {
                    title: {
                        display: true,
                        text: 'Time'
                    }
                }
            }
        }
    });

    chartIdToData['chart-worker1'] = chart1Data;
    MQTTConnect(mqtt => {
        mqtt.subscribe("samples/gateway/worker1/Humidity");

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

            chart1Data.labels.push(xLabel);
            chart1Data.datasets[0].data.push(message.payloadString);
            chart1.update();
        }
    });

    updateChart('chart-worker1', 'samples', '*', 'worker1', 'Humidity', Date.now());
});