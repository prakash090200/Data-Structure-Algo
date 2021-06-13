
<?php
session_start();
$con=mysqli_connect('localhost','root','');
$db=mysqli_select_db($con,'prakashdb');
$fn=$_POST['fname'];
//$ln=$_POST['lname'];
$rg=$_POST['regno'];
$em=$_POST['email'];
$dob=$_POST['dob'];
$pas=$_POST['password'];
$cpas=$_POST['cpassword'];
$b="select * from studentsignup where Registration_no='$rg'";
$check=mysqli_query($con,$b);
$num=mysqli_num_rows($check);
if($num==1){
   header('location:registration_stud.php');
}
else
{
	
	$a="insert into studentsignup (name,Registration_no,Email_id,Date_of_birth,password,confirm_password)  values ('$fn','$rg','$em','$dob','$pas','$cpas')";
mysqli_query($con,$a);
	header('location:loginpage1.php');
}
?>
