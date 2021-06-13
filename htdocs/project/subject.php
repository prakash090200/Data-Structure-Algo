<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  <style type="text/css">
  .cool{
  text-align: center;
  background-color:black;
  font-family: 'Oswald', Helvetica, sans-serif;
  font-size: 50px;
  transform: skewY(0deg);
  letter-spacing: 4px;
  word-spacing: -8px;
  color: tomato;
  text-shadow:
    -1px -1px 0 firebrick,
    -2px -2px 0 firebrick,
    -3px -3px 0 firebrick,
    -4px -4px 0 firebrick,
    -5px -5px 0 firebrick,
    -6px -6px 0 firebrick,
    -7px -7px 0 firebrick,
    -8px -8px 0 firebrick,
    -30px 20px 40px dimgrey

  }
  .all{

    border:4px solid black;
    background-color:lightgreen;

  }
#subm{
    background-color:white;
    font-size:25px;
    width=35%;
    padding:10px 15px;
    border-radius:150px;
    border:2px solid #00FFFF;
  }
    #subm:hover{
      background-color:#00FFFF;
    }
    #button{
      background-color:white;
      margin-left:200px;
      color:black;
      font-size:14px;
    padding:10px 15px;
      border-radius:150px;
      border:2px solid orange;

    }
    #button:hover{
      background-color:orange;
      color:#f5f5f6;
    }
    .box{
border:4px solid yellow;
outline-style:solid;
outline-color:yellow;
width:40%;
text-align:center;
background-color:lightyellow;
margin:0 auto;
}
#header{
  background-color:black;
  color:#f5f5f6;
}
#sub{
  background-color:white;
  font-size:24px;
  padding:10px 15px;
  border-radius:180px;
  border:2px solid #00FFFF;
}
  #sub:hover{
    background-color:#00FFFF;

  }
a{
  margin:0 auto;
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
  <body>

    <h1 class="cool">  Subject Choosen  </h1>
    <div class="all">
      <table style="margin:0 auto;">
      <form method="post" action="coursereg.php">
      <tr style="font-size:25px;"><th colspan="6" style="color:red;">Total Credit for this semester is:</th><th>(Each subject 3 credit) </th><th>=</th><th style="color:red;"><?php
session_start();
$con=mysqli_connect('localhost','root','prakash');
$db=mysqli_select_db($con,'prakashk');
$a=mysqli_query($con,"select * from subjects where credit=3");
$b=mysqli_num_rows($a);
$c=mysqli_query($con,"select * from subjects where credit=1");
$d=mysqli_num_rows($c);
$credit=$d+($b*3);
if($credit>=25)
  echo 25;
else
    echo $credit;



?></th></tr><tr><td></td></tr><tr><td></td></tr>
      <tr><th colspan="6">Subjects:</th><th><input type="checkbox" name="s" value="phy">Physics For Engineers </th><th ><input type="checkbox" name="s" value="iop" >Introduction To Programming</th></th><th><input type="checkbox" name="s" value="che" >Engineering Chemistry </th></th><th><input type="checkbox" name="s" value="oop">Object Oriented programming </th></tr>
      <tr><th colspan="6"></th><th><input type="checkbox" name="s" value="dsa">Data Structure And Algorithims </th><th ><input type="checkbox" name="s" value="comp network" >Computer Networking</th></th><th><input type="checkbox" name="s" value="stats">Statistics for Engineers </th></th><th><input type="checkbox" name="s" value="dbms">Database Management </th></tr>
      <tr><th colspan="6"></th><th><input type="checkbox" name="s" value="dlm">Digital Logics </th><th ><input type="checkbox" name="s" value="open source">Open Source Programming</th></th><th><input type="checkbox" name="s" value="Comp Artitecture">Computer Artitecture</th></th><th><input type="checkbox" name="s" value="ethics">Ethics And Values </th></tr>
        <tr><th colspan="6" >Soft Skill (only 1 credit):</th><th colspan="3" style="text-align:left;"><input type="radio" name="s1" value="FACE"  >FACE</th></tr>
          <tr><th colspan="6"></th><th colspan="3" style="text-align:left;"><input type="radio" name="s1" value="ETHNUS" >ETHNUS</th></tr>
           <tr><th></th><th></th><th colspan="6"><button onclick="coursereg.php" id="button" value="register" >Register</button></th></tr>

        </form>

</table>
<br><br>
<div class="box">
  <form method="post" action="attendance_check.php">
<h1 id="header"><strong>Attendance Checking</strong></h1><br><br><br>
<h4>Regestration_No:   <input  type="text" name="reg" placeholder="reg_no" required ></h4>
<h6><a href="forgot.php">forgot Password?</a> &nbsp; &nbsp;&nbsp;&nbsp;<input id="sub" type="submit" value="Check"></h6><br>
<form>
</div>
<div id="lo">
      <h3><a href="welcome.php">Back</a></h3>
    </div>
</body>
</html>
