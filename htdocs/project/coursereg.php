<?php 
session_start();
$con=mysqli_connect('localhost','root','prakash');
$db=mysqli_select_db($con,'prakashk');
$k=$_POST['s'];
$s1=$_POST['s1'];
$r=$_POST['ra'];
if($k=$_POST['s'])
$sql=mysqli_query($con,"insert into subjects values('$k',3)");
else
$sq=mysqli_query($con,"insert into subjects values('$s1',1)");
$a=mysqli_query($con,"select * from subjects where credit=3");
$b=mysqli_num_rows($a);
$c=mysqli_query($con,"select * from subjects where credit=1");
$d=mysqli_num_rows($c);
$credit=$d+($b*3);
if($credit>=25)
	echo 25;
//mysqli_query($con,"update table studentsignup set credit=25 where Registration_no='$r'");
else
	echo $credit;
//mysqli_query($con,"update table studentsignup set credit='$credit' where Registration_no='$r'");
header('location:subject.php');
?>

