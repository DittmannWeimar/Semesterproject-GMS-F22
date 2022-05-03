<!DOCTYPE html>
<html>

<head>
    <title>Green House Management System</title>
    <?php require $_SERVER['DOCUMENT_ROOT'] . "/header.php" ?>
    <script src="Moisture.js"></script>
</head>

<body>
    <?php require $_SERVER['DOCUMENT_ROOT'] . "/commonBody.php" ?>
    <ul class="flex-container">
        <li class="chart-container">
            <canvas id="myChart" class="fixed-dimensions-chart"></canvas>
            <div>
                <button id="myChart-all" class="btn btn-link">All</button>
                <button id="myChart-24-hour" class="btn btn-link">24 Hours</button>
                <button id="myChart-last-hour" class="btn btn-link">Last Hour</button>
            </div>
        </li>
    </ul>
</body>

</html>