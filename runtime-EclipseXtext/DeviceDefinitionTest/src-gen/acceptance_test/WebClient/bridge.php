<?php

$apiHost = getenv("API_HOST");

$type = $_GET['type'];
$gateway = $_GET['gateway'];
$worker = $_GET['worker'];
$topic = $_GET['topic'];
$from = $_GET['from'];
$to = $_GET['to'];

$queryArguments = "$type/$gateway/$worker/$topic?from=$from&to=$to";

if (!isset($apiHost)) {
    $apiRoot = "http://localhost:3000/$queryArguments";
} else {
    $apiRoot = $apiHost . "/$queryArguments";
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
