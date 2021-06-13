<!DOCTYPE html>
<html>
<head>
	<title>good</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<style type="text/css">
	.imga{
		background-image:url("pk1.jpg");
		position:absolute;
		left:0;
		width:100%;
		height:75%;
		background-size:cover;
	}
	#lo{
	 position:absolute;
  color:white;
  display:inline;
  margin-left:50%;
  top:90%;
}
</style>
</head>
<body>
	<div class="alert alert-success" role="alert">
  <?php
$con=mysqli_connect('localhost','root','prakash');
$db=mysqli_select_db($con,'prakashk');
$reg=$_POST['reg'];
$sql=mysqli_query($con,"select Attendance from studentsignup where Registration_no='$reg'");
while($row=mysqli_fetch_array($sql)){
  if($row[0]>=75){
    echo "<h3>"."You have"." ".$row[0]."% of Attendance(Eligible for writing Exam)</h3>";
  }
  else{
   header('location:lessthan_75.php');
  }
}

?>
</div>
<div class="imga">

</div>
<div id="lo">
      <h3><a href="welcome.php">Home</a></h3>
    </div>

</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>