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
      <div class="title">Faculty Login Form</div>
      <form method="post" action="faculty_backend.php" >
        <div class="field">
          <input type="text" required name="name">
          <label>Faculty Name</label>
        </div>
        <div class="field">
          <input type="text" required name="re">
          <label>Faculty No</label>
        </div>
        <div class="field">
          <input type="password" required name="pass">
          <label>Password</label>
        </div>
        <div class="content">
          <div class="checkbox">
            <input type="checkbox" id="remember-me">
            <label for="remember-me">Remember me</label>
          </div>
          <div class="pass-link"><a href="fac_forget.php">Forgot password?</a></div>
        </div>
        <div class="field">
          <input type="submit" value="Login">
        </div>
        <div class="signup-link">Not a member? <a href="Register.php">Signup now</a></div>
      </form>
    </div>
  </body>
</html>
