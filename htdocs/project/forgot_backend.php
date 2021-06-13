<?php
session_start();
$ok=$_POST['reg'];
$new=$_POST['pass'];
$cnew=$_POST['cpass'];
$status=$_POST['st'];

$con=mysqli_connect('localhost','root','');
$db=mysqli_select_db($con,'prakashdb');

$sql=mysqli_query($con," update studentsignup set password='$new',confirm_password='$cnew' where Registration_no ='$ok' ");
if($status=='at')
header('location:loginpage.php');
else
header('location:loginpage1.php');
?>