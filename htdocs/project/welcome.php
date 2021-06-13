<?php
session_start();

?>
<!DOCTYPE html>
<html>

<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<style type="text/css">

	.image{
		background-image:url("im2.jpg");
		position:absolute;
		top:30;
		left:0;
		width:100%;
		height:75%;
		background-size:cover;
	}
	.clock{
		position:absolute;
		top:80;
		left:0;
		height:20%;
		width:100%;
		background-color:ligthgreen;
	}
	#time {
float: left;
color: green;
font-size:24px;
text-decoration: bold;
margin-left: 20px;
margin-top: 25px;
}

		
</style>
	<title></title>
</head>
<body onload="display()" style="background-color:black;">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="Student_details.php">Personal Info</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="subject.php">Subjects<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="mark.php">Marks</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          student info
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
        	<a class="dropdown-item" href="personal_info.php">Student Info</a>
          <a class="dropdown-item" href="hostel_detail.php">Hostel Detail</a>
          <a class="dropdown-item" href="educational_detail.php">Education Details</a>
          <a class="dropdown-item" href="proctor_detail.php">Proctor Details</a>
          <a class="dropdown-item" href="">College Information</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="con.php">Contacts</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="logout.php" >Logout</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
	
<script type="text/javascript" >
function display()
{
var d=new Date();
var h=d.getHours();
var m=d.getMinutes();
var s=d.getSeconds();
m=format(m);
s=format(s);
document.getElementById("time").innerHTML=h+":"+m+":"+s;
setTimeout(display,1000);
}
function format(n)
{
if(n<10) n="0"+n;
return n;
}
</script>

	<div class="alert alert-success" role="alert">
  <h4 class="alert-heading">Welcome 
  <?php 
  $con=mysqli_connect('localhost','root','');
$db=mysqli_select_db($con,'prakashdb');
$ok=$_SESSION['regist'];
$sql=mysqli_query($con,"select * from studentsignup where Registration_no ='$ok' ");
while($row=mysqli_fetch_array($sql)){
	echo " ".$ok."(".$row[0]." ".$row[1].")";
}
?>
</h4>
<div class="clock">
		<div id="time">
	</div>
</div>
  <p>you Have Successfully Logged In</p>  
  <hr>
  <p class="mb-0">Have a Nice Day</p>
</div>
<div class="image">
</div>




</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>