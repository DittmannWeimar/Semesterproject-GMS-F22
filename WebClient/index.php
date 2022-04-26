<!DOCTYPE html>
<html>

<head>
    <title>Green House Management System</title>
    <?php require "header.php" ?>
    <script>
        MQTTConnect(() => {
            console.log("Hi from lambda");
        });
    </script>
</head>
<body>
    <?php require "commonBody.php" ?>
</body>

</html>