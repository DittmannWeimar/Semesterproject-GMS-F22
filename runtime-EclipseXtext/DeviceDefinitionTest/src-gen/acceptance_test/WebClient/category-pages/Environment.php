<!DOCTYPE html>
<html>

<head>
    <title>Green House Management System</title>
    <?php require $_SERVER['DOCUMENT_ROOT'] . "/header.php" ?>
    <script src="Environment.js"></script>
</head>

<body>
    <?php require $_SERVER['DOCUMENT_ROOT'] . "/commonBody.php" ?>
    <ul class="flex-container">
<li class="chart-container">
    <div class="centered"><h3>Temperature</h3></div>
    <canvas id="chart-Temperature"></canvas>
    <div>
        <button id="chart-Temperature-all" class="btn btn-link" onclick="updateChart('chart-Temperature', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,temperature'], Date.now())">All</button>
        <button id="chart-Temperature-year" class="btn btn-link" onclick="updateChart('chart-Temperature', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,temperature'], 12*28*24*60*60*1000)">Last Year</button>
        <button id="chart-Temperature-month" class="btn btn-link" onclick="updateChart('chart-Temperature', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,temperature'], 28*24*60*60*1000)">Last Month</button>
        <button id="chart-Temperature-week" class="btn btn-link" onclick="updateChart('chart-Temperature', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,temperature'], 7*24*60*60*1000)">Last Week</button>
        <button id="chart-Temperature-24-hour" class="btn btn-link" onclick="updateChart('chart-Temperature', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,temperature'], 24*60*60*1000)">24 Hours</button>
        <button id="chart-Temperature-last-hour" class="btn btn-link" onclick="updateChart('chart-Temperature', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,temperature'], 60*60*1000)">Last Hour</button>
    </div>
</li>
<li class="chart-container">
    <div class="centered"><h3>Humidity</h3></div>
    <canvas id="chart-Humidity"></canvas>
    <div>
        <button id="chart-Humidity-all" class="btn btn-link" onclick="updateChart('chart-Humidity', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,humidity'], Date.now())">All</button>
        <button id="chart-Humidity-year" class="btn btn-link" onclick="updateChart('chart-Humidity', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,humidity'], 12*28*24*60*60*1000)">Last Year</button>
        <button id="chart-Humidity-month" class="btn btn-link" onclick="updateChart('chart-Humidity', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,humidity'], 28*24*60*60*1000)">Last Month</button>
        <button id="chart-Humidity-week" class="btn btn-link" onclick="updateChart('chart-Humidity', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,humidity'], 7*24*60*60*1000)">Last Week</button>
        <button id="chart-Humidity-24-hour" class="btn btn-link" onclick="updateChart('chart-Humidity', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,humidity'], 24*60*60*1000)">24 Hours</button>
        <button id="chart-Humidity-last-hour" class="btn btn-link" onclick="updateChart('chart-Humidity', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/th,humidity'], 60*60*1000)">Last Hour</button>
    </div>
</li>
    </ul>
</body>

</html>
