<?php
$con=mysqli_connect('localhost','root','prakash');
$db=mysqli_select_db($con,'prakashk');
$reg=$_POST['reg'];
$sql=mysqli_query($con,"select Attendance from studentsignup where Registration_no='$reg'");
while($row=mysqli_fetch_array($sql)){
  if($row[0]>=75){
    echo "you have".$row[0]."% of Attendance(Eligible for writing Exam)";
  }
  else{
    echo "Sorry You are Debared ,You Attendance is".$row[0];
  }
}

?>
