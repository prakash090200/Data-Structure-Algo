<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <style type="text/css">
    .box{
border:4px solid green;
outline-style:solid;
outline-color:green;
width:40%;
text-align:center;
background-color:lightgreen;
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
</style>

  </head>
  <body>
  <div class="box">
  <form method="post" action="c2.php">
<h1 id="header"><strong>Studend LogIn</strong></h1><br><br><br>
<h4>USERNAME:   <input  type="text" name="reg" placeholder="reg_no" required ></h4>
<h4>PASSWORD:    <input type="password" name="pass" placeholder="password" required ></h4>
<h6><a href="forgot.php">forgot Password?</a> &nbsp; &nbsp;&nbsp;&nbsp;<input id="sub" type="submit" value="Log In"></h6><br>
<form>
</div>
<br><br><br><br>
<h4 style="color:tomato;text-align:center;"><a href="firstpage.php"><h4 style="color:tomato;">Back to Home</a><h4>
  </body>
  </html>
