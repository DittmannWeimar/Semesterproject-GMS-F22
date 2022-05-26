<!DOCTYPE html>
<html>

<head>
    <title>Green House Management System</title>
    <?php require "header.php" ?>
</head>

<body>
    <?php require "commonBody.php" ?>

    <ul class="flex-container">
<li class="chart-container">
    <div class="centered">
        <h3>pump_01</h3>
    </div>
    <table class="settings-table">
    </table>
</li>
    </ul>
</body>

<script>


$(document).ready(function () {	
    MQTTConnect(mqtt => {
    	
    	

        mqtt.onMessageArrived = function (message) {
            console.log("Message Arrived: " + message.payloadString);
            console.log("Topic:     " + message.destinationName);
            console.log("QoS:       " + message.qos);
            console.log("Retained:  " + message.retained);
            // Read Only, set if message might be a duplicate sent from broker
            console.log("Duplicate: " + message.duplicate);


        }
    });
});

</script>

</html>
