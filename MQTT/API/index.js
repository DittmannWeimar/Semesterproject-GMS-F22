const dotenv = require('dotenv')
dotenv.config({ path: './process.env' })

const express = require("express");
const app = express();
const http = require('http').Server(app)

const mqtt = require('mqtt')
const mqttClient  = mqtt.connect(process.env.MQTT_HOST, {
    username: process.env.MQTT_USERNAME,
    password: process.env.MQTT_PASSWORD,
})

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

mqttClient.on('connect', function () {
    console.log("Connected to MQTT broker")
});

const allowed = ["samples", "triggers", "alerts", "errors", "logs"]
const wildcard = '*'

app.get("/:collection/:gateway/:worker/:subject", async (req, res) => {

    if (allowed.includes(req.params.collection)) {

        var gatewayWildcard = req.params.gateway == wildcard
        var workerWildcard = req.params.worker == wildcard

        var collection = mongo.collection(req.params.collection)

        var baseQuery = {
            gateway: req.params.gateway,
            worker: req.params.worker,
            subject: req.params.subject,
        }

        if (gatewayWildcard) delete baseQuery.gateway
        if (workerWildcard) delete baseQuery.worker

        var optionals = []

        var from = req.query.from;
        var to = req.query.to;

        if (from != undefined) optionals.push({timestamp: { $gt: Number(from) }})
        if (to != undefined) optionals.push({timestamp: { $lt: Number(to) }})

        var query
        if (optionals.length == 0) {
            query = baseQuery
        }else{
            var array = [baseQuery]
            optionals.forEach(x => array.push(x))
            query = {
                $and: array
            }
        }

        collection.find(query).toArray((err, result) => {
            if (err) {
                res.status(500).send();
            }
            res.status(200).send(result);
        })
    }else{
        res.status(404).send()
    }
})

app.post("/:gateway/:worker/:setting", async (req, res) => {
    var value = req.query.value
    mqttClient.publish("settings/" + req.params.gateway + "/" + req.params.worker + "/" + req.params.setting, value)
    res.status(200).send()
})

http.listen("3010", () => {
    console.log("Webserver is running!")
})