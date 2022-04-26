var chart1;


$(document).ready(function () {
    const ctx = document.getElementById('myChart').getContext('2d');
    var chart1Data = {
        labels: [],
        datasets: [{
            label: 'Water Levels',
            data: [],
            borderColor: [
            ],
            borderWidth: 1
        }]
    }

    chart1 = new Chart(ctx, {
        type: 'line',
        data: chart1Data,
        options: {
            scales: {
                y: {
                    title: {
                        display: true,
                        text: 'Water Levels'
                    }
                },
                x: {
                    title: {
                        display: true,
                        text: 'Time'
                    }
                }
            }
        }
    });
    const ctx2 = document.getElementById('myChart2').getContext('2d');
    var chart2Data = {
        labels: [],
        datasets: [{
            label: 'Water Levels',
            data: [],
            borderColor: [
            ],
            borderWidth: 1
        }]
    }

    chart2 = new Chart(ctx2, {
        type: 'line',
        data: chart2Data,
        options: {
            scales: {
                y: {
                    title: {
                        display: true,
                        text: 'Water Levels'
                    }
                },
                x: {
                    title: {
                        display: true,
                        text: 'Time'
                    }
                }
            }
        }
    });
    const ctx3 = document.getElementById('myChart3').getContext('2d');
    var chart3Data = {
        labels: [],
        datasets: [{
            label: 'Water Levels',
            data: [],
            borderColor: [
            ],
            borderWidth: 1
        }]
    }

    chart3 = new Chart(ctx3, {
        type: 'line',
        data: chart3Data,
        options: {
            scales: {
                y: {
                    title: {
                        display: true,
                        text: 'Water Levels'
                    }
                },
                x: {
                    title: {
                        display: true,
                        text: 'Time'
                    }
                }
            }
        }
    });

    var currentX = 0;
    var currentY = 100;
    setInterval(function () {
        chart1Data.labels.push(currentX++);
        chart1Data.datasets[0].data.push(currentY -= 1);

        if (currentY > 50) {
            chart1Data.datasets[0].borderColor.push('rgba(99, 255, 132, 1)');
        } else if (currentY < 15) {
            chart1Data.datasets[0].borderColor.push('rgba(255, 99, 132, 1)');
        } else {
            chart1Data.datasets[0].borderColor.push('rgba(255, 255, 132, 1)');
        }

        chart1.update();
        //this code runs every second 
    }, 1000);
});