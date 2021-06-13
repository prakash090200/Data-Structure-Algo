<!DOCTYPE html>
<html>
<head>
  <title>marks</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <style type="text/css">
  .a{
position:absolute;
top:8%;
margin-left:300px;
padding:20px 20px;

}
.b{
	position:absolute;
	top:50%;
	margin-left:23%;

}
.c{
	position:absolute;
	top:45%;
	margin-left:43%;
}
.d{
	position:absolute;
	top:87%;
	margin-left:49%;
}
#lo{
  position:absolute;
  color:white;
  display:inline;
  margin-left:50%;
  top:110%;
}
</style>
</head>
<body style=background-image:url("11.jpg");background-size:cover;width:100%;height:100%;>
  <div class="a">
<center>
<form method="post" action="mark.php">
  <table><tr>
  <th>Registration No:</th><th><input type="text" name="reg"></th><th>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</th>
  <th> <input class="btn btn-primary" type="submit" value=" Display Marks"></th></tr>
 </table>
</form>
</center>
</div>
<div class="b">
	<?php 
	error_reporting(0);
	 $con=mysqli_connect('localhost','root','prakash');
$db=mysqli_select_db($con,'prakashk');

$k=$_REQUEST['reg'];
$sql=mysqli_query($con,"select * from studentsignup where Registration_no='$k'");
function calgrade($x,$y){
	if($y>75){
	if($x>=90 && $x<=100) return 'S';
	else if($x<90 && $x>=80) return 'A';
	else if($x<80 && $x>=70) return 'B';
	else if($x<70 && $x>=60) return 'C';
	else if($x<60 && $x>=50) return 'D';
	else return 'failed';
	}
	else return 0;
}
function checkat($x){
	if($x<75) return 'Debared';
	else return $x;
}
function mark($x,$y){
	if ($y<75) return 0;
	else return $x;
}
while($row=mysqli_fetch_array($sql)){
	echo "<table border='2' cellpadding='30'>
	<tr style='background-color:lightblue;'><th>Registration No</th><th><center>Name</center></th><th>Date Of Birth</th><th>Attendance</th><th>Marks</th><th>Grades</th><tr><th>".$row[2]."</th><th>".$row[0]." ".$row[1]."</th><th>".$row[4]."</th><th style='color:red;'>".checkat($row[8])."</th><th>".mark($row['marks'],$row[8])."</th><th>".calgrade($row['marks'],$row[8])."</th></tr></table>";


}

	?>
</div>
<div class="c">
	<h4>Student Marks Detail</h4>
	</div>
	<div class="d">
<h5><a href="welcome.php">Home Page</a></h5></div>
</body>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>
