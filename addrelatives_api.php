<?php
include './dbcon.php';
if (isset($_POST["name"])) {

    $r = array();
    $postuname = $_POST["userId"];
    $postname = $_POST["name"];
    $postmobno = $_POST["mobno"];
    $postalmobno = $_POST["almobno"];



    $sql = "INSERT INTO `relativeinfrmn`(`userId`, `name`, `mobno`, `alterno`) VALUES 
    ('$postuname','$postname',$postmobno,$postalmobno)";
    $result = $connection->query($sql);
    if ($result === TRUE) {
        $r["status"] = "success";
    } else {
        $r["status"] = "error";
    }

    echo json_encode($r);
}
