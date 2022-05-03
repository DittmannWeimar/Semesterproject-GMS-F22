<?php

$type = $_GET['type'];
$gateway = $_GET['gateway'];
$workers = $_GET['workers'];
$topic = $_GET['topic'];

if (!isset($_ENV["API_HOST"])) {
    $apiRoot = "http://www.localhost:3000/$type/$gateway/$workers/$topic";
} else {
    $apiHost = $_ENV["API_HOST"];
    $apiRoot = $apiHost + "/$type/$gateway/$worker/$topic";
}

$options = array(
    'http' => array(
        'header'  => "Content-type: application/x-www-form-urlencoded\r\n",
        'method'  => 'GET'
    ),
);

$context  = stream_context_create($options);
$result = file_get_contents($apiRoot, false, $context);

echo $result;
