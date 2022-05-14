package dk.sdu.gms.dds.generator

class WebClientBoilerPlate {
	public static def String generateCSS() '''
.chart-container {
  width: 600px;
  height: auto;
  list-style-type: none;
  border: 1px solid gray;
  padding: 5px;
}

.flex-container {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(600px, max-content));
  grid-gap: 16px;
  justify-content: center;
  padding: 32px;
}

.centered {
  font-family: arial;
  font-size: 24px;
  width: 100%;
}

.centered h3 {
  text-align: center;
}

.settings-table {
  width: 100%;
  border-spacing: 16px;
  border-collapse: collapse;
}

.settings-table tr th input {
  width: 100px;
}

.settings-table tr th h5 {
  width: 350px;
}

table tr {
  border-top: 2px solid #EEE;
}
	'''
	
	public static def String generateHeader() '''
	<?php
	
	$mqttHostServerSide = getenv("MQTT_HOST");
	$mqttHost = getenv("MQTT_CLIENT_SIDE");
	$username = getenv("MQTT_USERNAME");
	$password = getenv("MQTT_PASSWORD");
	
	echo "<script>";
	
	echo "var MQTT_HOST = \"$mqttHost\"\n";
	echo "var MQTT_USERNAME = \"$username\"\n";
	echo "var MQTT_PASSWORD = \"$password\"\n";
	
	echo "</script>";
	?>
	
	<!-- JQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/chart.js@3.6.0/dist/chart.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/paho-mqtt/1.0.1/mqttws31.min.js" type="text/javascript"></script>
	<script src=/helper.js></script>
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
	<link rel="stylesheet" href="/styles/chart.css">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
	
	'''
	
	public static def String generateBridge() '''
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
	    $apiRoot = $apiHost . "$queryArguments";
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
	'''
	
	def static String generateCommonBody() '''
	<div class="navbar-default" role="navigation">
	    <div class="navbar-header">
	        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="sr-only">links toggle button</span>
	            <span class="mdl-color--white white icon-bar"></span>
	            <span class="mdl-color--white white icon-bar"></span>
	            <span class="mdl-color--white icon-bar"></span>
	        </button>
	        <a href="/"><span class="navbar-brand">Green House Management System</span></a>
	    </div>
	    <div class="navbar-collapse collapse">
	        <ul class="nav navbar-nav" style="float: right;" id="navbar-categories">
	        </ul>
	    </div>
	</div>
	'''
}