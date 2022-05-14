<!DOCTYPE html>
<html>

<head>
    <title>Green House Management System</title>
    <?php require "header.php" ?>

    <script>
        MQTTConnect();
    </script>
</head>

<body>
    <?php require "commonBody.php" ?>

    <ul class="flex-container">
        <li class="chart-container">
            <h1>IoT Device 1</h1>
            <div>
                <input type="text" id="lightness"></input>
                
                <p>LED: </p><button onclick="MQTTSend('gateway/worker/setting', $('#lightness').val())">Toggle</button>
            </div>
        </li>
    </ul>
</body>

</html>
