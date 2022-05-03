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
    addCategory("Moisture");
    addCategory("Water Levels");
});

//API Call
var apiUrlRoot = "http://localhost/Bridge/";
function _getData(type, gateway, worker, topic) {
    var actualUrl = apiUrlRoot + type + "/" + gateway + "/" + worker + "/" + topic;
    console.log("Requesting data from: " + actualUrl);
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

async function test() {
    console.log("requesting..." + apiUrlRoot)
    var testResponse = await _getData("triggers", "*", "*", "pumpActivated");
    var firstEntry = testResponse[0]
    console.log("Response:" + testResponse)
    console.log("ID:" + firstEntry._id)
    console.log("Message:" + firstEntry.message)
}


//MQTT!
var isTestingLocally = true;
var mqtt;
var reconnectTimeout = 2000;
var host = "localhost"
var port = "8081"
var username = "kristian"
var pw = "1234"

if (!isTestingLocally) {
    mqtt;
    reconnectTimeout = 2000;
    host = process.env.MQTT_HOST.split(":")[0]
    port = process.env.MQTT_HOST.split(":")[1]
    username = process.env.MQTT_USERNAME
    pw = process.env.MQTT_PASSWORD
}

function _onConnect(callback = null) {
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

$(document).ready(function () {
    test();
});