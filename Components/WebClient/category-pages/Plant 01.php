<!DOCTYPE html>
<html>

<head>
    <title>Green House Management System</title>
    <?php require $_SERVER['DOCUMENT_ROOT'] . "/header.php" ?>
    <script src="Plant 01.js"></script>
</head>

<body>
    <?php require $_SERVER['DOCUMENT_ROOT'] . "/commonBody.php" ?>
    <ul class="flex-container">
<li class="chart-container">
    <div class="centered"><h3>Soil Moisture</h3></div>
    <canvas id="chart-Soil Moisture"></canvas>
    <div>
        <button id="chart-Soil Moisture-all" class="btn btn-link" onclick="updateChart('chart-Soil Moisture', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/moisture,sample'], Date.now())">All</button>
        <button id="chart-Soil Moisture-year" class="btn btn-link" onclick="updateChart('chart-Soil Moisture', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/moisture,sample'], 12*28*24*60*60*1000)">Last Year</button>
        <button id="chart-Soil Moisture-month" class="btn btn-link" onclick="updateChart('chart-Soil Moisture', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/moisture,sample'], 28*24*60*60*1000)">Last Month</button>
        <button id="chart-Soil Moisture-week" class="btn btn-link" onclick="updateChart('chart-Soil Moisture', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/moisture,sample'], 7*24*60*60*1000)">Last Week</button>
        <button id="chart-Soil Moisture-24-hour" class="btn btn-link" onclick="updateChart('chart-Soil Moisture', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/moisture,sample'], 24*60*60*1000)">24 Hours</button>
        <button id="chart-Soil Moisture-last-hour" class="btn btn-link" onclick="updateChart('chart-Soil Moisture', ['samples/58:BF:25:E0:77:98/10:97:BD:D5:3E:64/moisture,sample'], 60*60*1000)">Last Hour</button>
    </div>
</li>
    </ul>
</body>

</html>
