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
            <canvas id="myChart"></canvas>
            <div>
                <button id="myChart-all" class="btn btn-link">All</button>
                <button id="myChart-year" class="btn btn-link">Last Year</button>
                <button id="myChart-month" class="btn btn-link">Last Month</button>
                <button id="myChart-week" class="btn btn-link">Last Week</button>
                <button id="myChart-24-hour" class="btn btn-link">24 Hours</button>
                <button id="myChart-last-hour" class="btn btn-link">Last Hour</button>
            </div>
        </li>
        <li class="chart-container">
            <canvas id="myChart2"></canvas>
        </li>
        <li class="chart-container">
            <canvas id="myChart3"></canvas>
        </li>
    </ul>
</body>

</html>