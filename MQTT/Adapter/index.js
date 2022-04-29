const dotenv = require('dotenv')
dotenv.config({ path: './process.env' })

// -- MQTT --
const mqtt = require('mqtt')
const mqttClient  = mqtt.connect(process.env.MQTT_HOST, {
    username: process.env.MQTT_USERNAME,
    password: process.env.MQTT_PASSWORD,
})

mqttClient.on('connect', function () {
  // Ensure we only subscribe to certain topics.
  mqttClient.subscribe('samples/#', function (err) {
  })
  mqttClient.subscribe('triggers/#', function (err) {
  })
  mqttClient.subscribe('alerts/#', function (err) {
  })
  mqttClient.subscribe('errors/#', function (err) {
  })
  mqttClient.subscribe('log/#', function (err) {
  })
  
  console.log("Connected to MQTT broker")
})

mqttClient.on('message', function (topic, message) {
  pushToDatabase(topic, message)  
})

// -- DATABASE --
const { MongoClient } = require("mongodb");

const mongoClient = new MongoClient(process.env.MONGO_CONNECTION_STRING);
var mongo;

async function run() {
  try {
    await mongoClient.connect();
    mongo = mongoClient.db(process.env.MONGO_DATABASE);
    console.log("Connected to MongoDB");
  } catch (err) {
    // Ensures that the client will close when you finish/error
    console.error(err)
    await mongoClient.close();
  }
}
run();

// -- WHEN WORLDS COLLIDE
function pushToDatabase(topic, message) {
  let split = topic.split('/')
  if (split.length == 3 || split.length == 4) {

    let collectionName = split[0]
    let gatewayMac = split[1]
    let workerMac = split[2]
    let subjectName = split[split.length == 3 ? 2 : 3]
    let messageValue = message.toString();

    let messageAsNumber = Number(messageValue)
    if (!isNaN(messageAsNumber)) messageValue = messageAsNumber;

    let collection = mongo.collection(collectionName)
    let document = {
      timestamp: Date.now(),
      gateway: gatewayMac,
      worker: workerMac,
      subject: subjectName,
      message: messageValue
    }

    console.log("{" + document.timestamp + "} " + topic + ": " + messageValue)
    collection.insertOne(document)
  }
}