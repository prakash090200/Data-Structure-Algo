<?php
session_start();
$con=mysqli_connect('localhost','root','prakash');
$db=mysqli_select_db($con,'prakashk');
$a=$_REQUEST['a'];
$b=$_REQUEST['b'];
$c=$_REQUEST['c'];
$d=$_REQUEST['d'];
$e=$_REQUEST['e'];
$f=$_REQUEST['f'];
$sq=mysqli_query($con,"select * from info where reg='$a' ");
$check=mysqli_num_rows($sq);
if($check==0)
$sql=mysqli_query($con,"insert into info(reg,mess,name,phone,branch,year) values('$a','$b','$c','$d','$e','$f')");
header('location:welcome.php');
?>