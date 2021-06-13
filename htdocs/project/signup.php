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
background-color:tomato;
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
#a{
  color:green;
}
</style>

  </head>
  <body>
  <div class="box">
  <form method="POST" action="" >
<h1 id="header"><strong>Sign Up</strong></h1><br><br><br>
<center><table><tr>
<td><h4>Full Name: </h4></td>  <td><input  type="text" name="fname" ></td><td><p id="a"><?php ?></p></td></tr>
<tr><td><h4>DOB:  </h4></td><td> <input  type="text" name="lname" ></td><td><p id="a"><?php  ?></p></td></tr>
<tr><td><h4>   Reg No:    </h4></td><td><input  type="text" name="regno" ></td><td><p id="a"><?php  ?></p></td></tr>
<tr><td><h4>Email Id:   </h4></td><td><input  type="email" name="email"  ></td><td><p id="a"><?php    ?></p></td></tr>
<tr><td><h4>Date OF Birth:   </h4></td><td><input  type="date" name="dob" ></td><td><p id="a"><?php ?></p></td></tr>
<tr><td><h4>password:   </h4></td><td><input  type="password" name="password" min="5" ></td><td><p id="a"><?php  ?></p></td></tr>
<tr><td><h4>confirm Password:   </h4></td><td><input type="password" name="cpassword" ></td><td><p id="a"><?php ?></p></td></tr>
<tr><td colspan="2"><h4><center><input id="sub" type="submit" name="submit" value="Sign In"></center></h4></td></tr><br></table></center>
</form>
</div>

  </body>
  </html>
