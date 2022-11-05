<?php
include './dbcon.php';
if (isset($_POST["userid"])) {

    $r = array();

    $userid = $_POST['userid'];
    $speed = $_POST['speed'];


    $sql = "INSERT INTO `speed`( `Speed`, `Datetime`, `UserId`)  VALUES
     ($speed,now(),$userid)";
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
