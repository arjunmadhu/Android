
<?php

$r=array();
    $servername="localhost";
    $dbusername="root";
    $dbpass="";
    $dbname="project";
    $connection=new mysqli( $servername,$dbusername,$dbpass,$dbname);
$sql="SELECT  `username`, `name`, `mobno`, `alterno` FROM `relativeinfrmn`";
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