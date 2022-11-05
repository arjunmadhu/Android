
<?php
if(isset($_POST["id"]))
{

    $r=array();
    $id=$_POST["id"];


    $servername="localhost";
    $dbusername="root";
    $dbpass="";
    $dbname="book";
    $connection=new mysqli( $servername,$dbusername,$dbpass,$dbname);
$sql="SELECT  `Name`, `Email`, `password`, `confirm_pass`, `mobile_no`, `blood_group` FROM `users` WHERE `id`=id";
$result=$connection->query($sql);
if($result->num_rows>0)
{
while($row=$result->fetch_assoc()){

  $r["data"][]=$row;  


}

echo json_encode($r);
}

else{
    echo "Invalid entry";
}


}
?>