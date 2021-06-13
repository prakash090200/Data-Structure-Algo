<?php
session_start();
$con=mysqli_connect('localhost','root','');
$db=mysqli_select_db($con,'prakashdb');
$name=$_POST['name'];

$un=$_POST['re'];
$ps=$_POST['pass'];
$b="select * from faculties where reg='$un' && pass='$ps' &&name='$name' ";
$check=mysqli_query($con,$b);
$num=mysqli_num_rows($check);
if($num==1){
	$_SESSION['reg']=$un;
	$_SESSION['name']=$name;
   header('location:faculty_welcome_page.php');
   }
else
{
	header('location:Register.php');
}
?>