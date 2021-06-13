
<?php
session_start();
$con=mysqli_connect('localhost','root','');
$db=mysqli_select_db($con,'prakashdb');
$un=$_POST['reg'];
$ps=$_POST['pass'];
$b="select * from studentsignup where Registration_no='$un' && password='$ps'";
$check=mysqli_query($con,$b);
$num=mysqli_num_rows($check);
if($num==1){
	$_SESSION['regist']=$un;
   header('location:welcome.php');
   }
else
{
	header('location:loginpage1.php');
}
?>

