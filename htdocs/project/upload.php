<?php
session_start();
$con=mysqli_connect('localhost','root','');
$db=mysqli_select_db($con,'prakashdb');
$att=$_POST['at'];
$stat=$_POST['stat'];
$marks=$_POST['mk'];
$reg=$_REQUEST['rad'];

$sq=mysqli_query($con,"update  studentsignup set Attendance='$att',status='$stat' where Registration_no='$reg' " );
$sql=mysqli_query($con,"update  studentsignup set marks='$marks' where Registration_no='$reg' " );

header('location:faculty_welcome_page.php');
?>





