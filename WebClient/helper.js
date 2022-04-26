function addCategory(name) {
    var categoryBinding = _createCategoryJSBinding(name)
    $('#navbar-categories').append(`<li id = ${categoryBinding.name}><a href="${categoryBinding.id}"> ${categoryBinding.name} </a></li>`)
}

function _createCategoryJSBinding(name) {
    return {
        name: name,
        // Replace space with nothing
        id: name.replace(/\s+/g, '')
    }
}

$( document ).ready(function() {
    addCategory("Moisture");
    addCategory("Water Levels");
});

var mqtt;
var reconnectTimeout = 2000;
var host = "localhost";
var port = 8081;

function onConnect(callback=null) {
    console.log("Connected to MQTT!");
    // Subscribe to topics
    mqtt.subscribe("MQTT");

    mqtt.onMessageArrived = function (message) {
        console.log("Message Arrived: " + message.payloadString);
        console.log("Topic:     " + message.destinationName);
        console.log("QoS:       " + message.qos);
        console.log("Retained:  " + message.retained);
        // Read Only, set if message might be a duplicate sent from broker
        console.log("Duplicate: " + message.duplicate);
      }

    callback();
}

function MQTTConnect(callback) {
    console.log("Connecting to "+host+":"+port);
    mqtt = new Paho.MQTT.Client(host, port, "/ws", "kristian");
    var options = {
        timeout: 5,
        onSuccess: () => onConnect(callback),
        onFailure: () => {
            console.log("MQTT Failed to connect..");
        },
        userName:"kristian",
        password:"1234"
    }

    mqtt.connect(options)
}