<?php

$apiHost = $_ENV["API_HOST"];

$apiRoot = $apiHost + "/$type/$gateway/$worker/$topic";

$ch = curl_init();

// set url
curl_setopt($ch, CURLOPT_URL, $apiRoot);

//return the transfer as a string
curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);

// $output contains the output string
$output = curl_exec($ch);

// close curl resource to free up system resources
curl_close($ch);

echo $output;



?>