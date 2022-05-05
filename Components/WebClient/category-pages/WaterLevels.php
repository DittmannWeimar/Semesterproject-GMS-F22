<!DOCTYPE html>
<html>

<head>
    <title>Green House Management System</title>
    <?php require $_SERVER['DOCUMENT_ROOT'] . "/header.php" ?>
    <script src="WaterLevels.js"></script>
</head>

<body>
    <?php require $_SERVER['DOCUMENT_ROOT'] . "/commonBody.php" ?>
    <ul class="flex-container">
        <li class="chart-container">
            <div class="centered"><h3>Worker 1</h3></div>
            <canvas id="chart-worker1"></canvas>
            <div>
                <button id="chart-worker1-all" class="btn btn-link" onclick="updateChart('chart-worker1', 'samples', '*', 'worker1', 'Humidity', Date.now())">All</button>
                <button id="chart-worker1-year" class="btn btn-link" onclick="updateChart('chart-worker1', 'samples', '*', 'worker1', 'Humidity', 12*28*24*60*60*1000)">Last Year</button>
                <button id="chart-worker1-month" class="btn btn-link" onclick="updateChart('chart-worker1', 'samples', '*', 'worker1', 'Humidity', 28*24*60*60*1000)">Last Month</button>
                <button id="chart-worker1-week" class="btn btn-link" onclick="updateChart('chart-worker1', 'samples', '*', 'worker1', 'Humidity', 7*24*60*60*1000)">Last Week</button>
                <button id="chart-worker1-24-hour" class="btn btn-link" onclick="updateChart('chart-worker1', 'samples', '*', 'worker1', 'Humidity', 24*60*60*1000)">24 Hours</button>
                <button id="chart-worker1-last-hour" class="btn btn-link" onclick="updateChart('chart-worker1', 'samples', '*', 'worker1', 'Humidity', 60*60*1000)">Last Hour</button>
            </div>
        </li>
    </ul>
</body>

</html>