<?php
error_reporting(0);

$uname =$_GET['uname'];
$pass = $_GET['pass'];
$servername = "localhost";
$username = "root";
$password = '';

// Create connection
$conn = mysqli_connect($servername, $username, $password,'infosec');
if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}

$sql="SELECT * FROM details where username='$uname' AND password='$pass' ";


$result = mysqli_query($conn,$sql);
$check = mysqli_fetch_array($result);

if(isset($check)){
    echo "<script> alert('You have Successfully LoggedIn!')</script>";
    
    
}

else{
    echo "<script> alert('Sorry! Unable to LogIn')</script>";
    
}

?>


<html>
    <head>
        <title>sqlinject_prakash_tanishq_rithika</title>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css" integrity="sha384-y3tfxAZXuh4HwSYylfB+J125MxIs6mR5FOHamPBG064zB+AFeWH94NdvaCBm8qnd"   crossorigin="anonymous" >  
        <style>
            
            .container{

              width:55%;
            padding-top:80px;
            padding-bottom:60px;

             
              

                
            }
            .margin{
                margin-top: 5px;
            }
            .centre{
                text-align: center;
            }
            body{
                 
                 display:flex;
                 align-items:center;
                 justify-content: center;
            }
            .imag{
                
                width:40%;
                height:480px;
                margin-left:20px;
                 background: url(r1.png) no-repeat ;
                 background-size:cover;
                
            }

            input{
            width:60% !important;
            text-align: left !important;
            }
            .btt{
                margin-left:25% !important;
            }
            
        
        </style>
    </head>
    <body>
        <div class="imag">

        </div>

        <div class="container">
            <h3>SQL INJECTION BY HACKER</h3>
        <form class="margin">
  <fieldset class="form-group">
    <label for="uname">Enter the UserName</label>
    <input type="text" class="form-control centre" id="city"  name="uname" placeholder="Username" >  
      <label  for="pass">Enter the Password</label>
    <input type="text" class="form-control centre" id="city"  name="pass" placeholder="Password" >
                                                                                        
      
  </fieldset>
  
  <div class="btt"> 
  <button type="submit" class="btn btn-primary">Submit</button>
</div>
</form>
        
        
    </div>
        
   
        
        
        
    </body>
</html>