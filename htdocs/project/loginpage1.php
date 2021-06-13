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
      <div class="title">Student Login Form</div>
      <form method="post" action="c2.php">
        <div class="field">
          <input type="text" name="reg" required>
          <label>Username</label>
        </div>
        <div class="field">
          <input type="password" name="pass" required>
          <label>Password</label>
        </div>
        <div class="content">
          <div class="checkbox">
            <input type="checkbox" id="remember-me">
            <label for="remember-me">Remember me</label>
          </div>
          <div class="pass-link"><a href="forgot.php">Forgot password?</a></div>
        </div>
        <div class="field">
          <input type="submit" value="Login">
        </div>
        <div class="signup-link">Not a member? <a href="registration_stud.php">Signup now</a></div>
      </form>
    </div>
  </body>
</html>
