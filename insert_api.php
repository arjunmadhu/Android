<?php
include './dbcon.php';
if (isset($_POST["name"])) {

    $r = array();
    $postname = $_POST["name"];
    $postaddress = $_POST["address"];
    $postemail = $_POST["email"];
    $postpassword = $_POST["password"];
    $postphone = $_POST["phone"];
    $postbloodg = $_POST["bloodg"];

 

    $sql = "INSERT INTO `users`( `Name`, `Email`, `password`, `mobile_no`, `blood_group`, `address`)  VALUES
     ('$postname','$postemail','$postpassword',$postphone,'$postbloodg','$postaddress')";
    $result = $connection->query($sql);
    if ($result === TRUE) {
        $r["status"] = "success";
    } else {
        $r["status"] = "error";
    }

    echo json_encode($r);
} else {
    $r = array();
    $r["status"] = "inavlid call";
    echo json_encode($r);
}
