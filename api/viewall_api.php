
<?php

$r=array();
    $servername="localhost";
    $dbusername="root";
    $dbpass="";
    $dbname="project";
    $connection=new mysqli( $servername,$dbusername,$dbpass,$dbname);
$sql="SELECT  `Name`, `Email`, `Username`, `password`, `confirm_pass`, `mobile_no`, `blood_group` FROM `users` ";
$result=$connection->query($sql);
if($result->num_rows>0)
{
while($row=$result->fetch_assoc()){

   
$r["datas"][]=$row;

}

echo json_encode($r);

}

else{
    echo "Invalid entry";
}



?>