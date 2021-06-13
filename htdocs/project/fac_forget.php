<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
   <!----<title>Login Form Design | CodeLab</title>---->
    <link rel="stylesheet" href="loginpage.css">
  </head>
  <body>
    <div class="wrapper">

      <div class="title">Forgot password</div>
      <form method="post" action="fac_f_bac.php">
        <div class="field">
          <input type="text" name ="reg" required>
          <label>Registration No</label>
        </div>
        <div class="field">
          <input type="password" name ="pass" required>
          <label>New Password</label>
        </div>
        <div class="field">
          <input type="password" name ="cpass" required>
          <label>Confirm Password</label>
        </div>
        
        <div class="field">
          <input type="submit" name="st" value="RESET">
        </div>
        <div class="signup-link">Not a member? <a href="Register.php">Signup now</a></div>
      </form>
    </div>
  </body>
</html>
