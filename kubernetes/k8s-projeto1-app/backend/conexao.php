<?php
$servername = "mysql-projeto1-app-svc";
$username = "root";
$password = "projeto123";
$database = "k8s-projeto1";

// Criar conexão


$link = new mysqli($servername, $username, $password, $database);

/* check connection */
if (mysqli_connect_errno()) {
    printf("Connect failed: %s\n", mysqli_connect_error());
    exit();
}

?>