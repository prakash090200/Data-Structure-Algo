<?php
session_start();
$ok=$_POST['reg'];
$new=$_POST['pass'];
$cnew=$_POST['cpass'];
$status=$_POST['st'];

$con=mysqli_connect('localhost','root','');
$db=mysqli_select_db($con,'prakashdb');

$sql=mysqli_query($con," update faculties set pass='$new' where reg ='$ok' ");
if($status=='at')
header('location:loginpage1.php');
else
header('location:loginpage.php');
?>