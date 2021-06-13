<!DOCTYPE html>
<html>
<head>
  <title>marks</title>
  <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="footer.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style type="text/css">
  
*{
  margin:0;
  left:0;
  right:0;
}
#lo{
  color:black;
  display:inline;
  margin-left:50%;
}
.hi{
  position: absolute;
  margin: auto;

}
.pk{
  position:absolute;
  top:100px;
  bottom:100px;
  left:280px;
  height:600px;
  

}
.zone{
    font-size:1.4em;
    border:1px solid #bbb;
    border-radius:6px;
    transition:all 1s;
    cursor:pointer;
}
a{
    color:#f5f5f6;
    text-decoration:none;
}
li{
    padding:20px;
}
.push{
    margin-left:auto;
}
.zone:hover{
    box-shadow:4px 4px 5px black; 
}
.green{
    background:linear-gradient(rgba(56,100,67,0.88),rgba(29,200,43,0.99));
}
.main-nav{
    margin:0;
    display:flex;
    list-style:none;
    
}
footer{
  position:fixed;
  top:60%;
  bottom:0px;
}
</style>
</head>
<body>
<nav class="zone green">
<ul class="main-nav">
  <li><a href="firstpage1.php" >About</a></li>
  <li><a href="">Features</a></li>
  <li><a href=""> Courses</a></li>
  <li class="push"><a href="loginpage.php">Logout</a></li>
</ul>
</nav>

  <!--     part 1  
  <div class="alert alert-success" role="alert">
    <h3>Welcome ,<?php session_start();
    echo $_SESSION['reg']."(".$_SESSION['name'].")";
    ?></h3>
    <h3>Have a Nice Day</h3>
</div>
-->

<!--     part 2  -->
 
<!--     part 3  -->
<div class="pk">

<div class="hi"> 
<?php 
$con=mysqli_connect('localhost','root','');
$db=mysqli_select_db($con,'prakashdb');
$b="select * from studentsignup";
$check=mysqli_query($con,$b);
echo"<table border='2' cellpadding='6'>
<tr>
   <th>Registration No</th>
   <th>Name</th>
   <th><center>Status</center></th>
    <th><center>Attendance</center></th>
   <th><center>Marks</center></th>
   <th><center>Action</center></th>
   </tr>";
while($row=mysqli_fetch_array($check)){
  echo "<tr>
           <form method='POST' action='upload.php'>
           <td><input type='radio' name='rad' value='$row[2]'>$row[2]</td>
           <td>".$row[0]." ".$row[1]."</td>
           
          <td><SELECT name='stat'>
          <option selected disabled>
          <option value='present'>PRESENT</option>
          <option value='absent'>ABSENT</option>
          </SELECT>

          </td>
          <td><input type='text' name='at'></td>
           <td><input type='text' name='mk'></td>
           <td><input type='submit' name='sub' value='UPDATE'></td>
           </form>
        </tr>";
}
echo"</table>";
?>

</div>
<br><br>
</div>
</body>

<!--     part 4  -->

<footer>
      <div class="main-content">
        <div class="left box">
          <h2>About us</h2>
          <div class="content">
            <p> This is a Faculty portal of College under each faculty complete details of its class is present .Faculties can take attendance, Upload exam marks , update attendance.</p>
            <div class="social">
              <a href="https://facebook.com/coding.np"><span class="fab fa-facebook-f"></span></a>
              <a href="#"><span class="fab fa-twitter"></span></a>
              <a href="https://instagram.com/coding.np"><span class="fab fa-instagram"></span></a>
              <a href="https://youtube.com/c/codingnepal"><span class="fab fa-youtube"></span></a>
            </div>
          </div>
        </div>
 
        <div class="center box">
          <h2>Address</h2>
          <div class="content">
            <div class="place">
              <span class="fas fa-map-marker-alt"></span>
              <span class="text">Vellore, Tamil Nadu</span>
            </div>
            <div class="phone">
              <span class="fas fa-phone-alt"></span>
              <span class="text">+91 6379215481/span>
            </div>
            <div class="email">
              <span class="fas fa-envelope"></span>
              <span class="text">prakashwhyprakash@gmail.com</span>
            </div>
          </div>
        </div>
 
        <div class="right box">
          <h2>Contact us</h2>
          <div class="content">
            <form action="#">
              <div class="email">
                <div class="text">Email *</div>
                <input type="email" required>
              </div>
              <div class="msg">
                <div class="text">Message *</div>
                <textarea rows="2" cols="25" required></textarea>
              </div>
              <div class="btn">
                <button type="submit">Send</button>
              </div>
            </form>
          </div>
        </div>
      </div>
      <div class="bottom">
        <center>
          <span class="credit">Created By <a href="https://www.codingnepalweb.com">@vitstudent.ac.in</a> </span>
         </span><span></span>
        </center>
      </div>
    </footer>




<!--       -->


</html>