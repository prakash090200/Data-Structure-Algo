<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <style type="text/css">
    .box{
border:4px solid black;
outline-style:solid;
outline-color:purple;
width:40%;
text-align:center;
background-color:purple;
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
  <form method="post" action="faculty_backend.php">
<h1 id="header"><strong>Faculty LogIn</strong></h1><br><br><br>
<h4>    NAME:   <input  type="text" name="name" placeholder="name" required ></h4>
<h4>    REG:   <input  type="text" name="re" placeholder="reg" required ></h4>
<h4>PASSWORD:    <input type="password" name="pass" placeholder="password" required ></h4>
<h6><a href="forgot.php">forgot Password?</a> &nbsp; &nbsp;&nbsp;&nbsp;<input id="sub" type="submit" value="Log In"></h6><br>
<form>
</div>
<br><br><br><br>
  </body>
  </html>
