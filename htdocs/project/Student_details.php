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
	top:30%;
	margin-left:23%;

}
.c{
	position:absolute;
	top:26%;
	margin-left:43%;
	text-decoration:underline;
}
.d{
	position:absolute;
	top:73%;
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
<body style=background-image:url("i3.jpg");background-size:cover;width:100%;height:100%;>
  <div class="a">
<center>
<form method="post" action="Student_details.php">
  <table><tr>
  <th>Registration No:</th><th><input type="text" name="reg"></th><th>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</th>
  <th> <input class="btn btn-primary" type="submit" value=" Display Marks"></th></tr>
 </table>
</form>
</center>
</div>
<div class="b">
	<?php 
	 $con=mysqli_connect('localhost','root','prakash');
$db=mysqli_select_db($con,'prakashk');

$k=$_REQUEST['reg'];
$sql=mysqli_query($con,"select * from info where reg='$k'");
$sq=mysqli_query($con,"select * from studentsignup where Registration_no='$k'");
while($row=mysqli_fetch_array($sql)){
	echo "<h3>Registration No :   ".$row[0]."</h3><br>";
	echo "<h3>Student Name: ".$row[2]."</h3><br>";
	echo "<h3>Phone No: ".$row[3]."</h3><br>";
	echo "<h3>Mess : ".$row[1]."</h3><br>";
	echo "<h3>Branch: ".$row[4]."</h3><br>";
	echo "<h3>Year: ".$row[5]."</h3><br>";}
while($row=mysqli_fetch_array($sq)){
echo "<h3>Marks :   ".$row[7]."</h3><br>";
	echo "<h3>Email Id: ".$row[3]."</h3><br>";
	echo "<h3>Attendance: ".$row[8]."</h3><br>";
	echo "<h3>Date_Of_Birth : ".$row[4]."</h3><br>";
}
	?>
</div>
<div class="c">
	<h3><b>Student Detail</b></h3>
	</div>
<div id="lo">
      <h3><a href="hostel_detail.php">Next</a></h3>
    </div>
	
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>
