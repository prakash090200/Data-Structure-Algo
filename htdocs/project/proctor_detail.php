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
    background-color:purple;

  }
#subm{
    background-color:white;
    font-size:24px;
    padding:10px 15px;
    border-radius:180px;
    border:2px solid #00FFFF;
  }
    #subm:hover{
      background-color:#00FFFF;


}
  </style>
  </head>
  <body>

    <h1 class="cool"> Student Family Detail </h1>
    <div class="all">
      <table style="margin:0 auto;">
      <form method="post" action="welcome.php">
      <tr><th colspan="6">Father Nmae:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Mother Name:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">If Brther/Sister in same University:</th><th colspan="3" ><input type="radio" name="bs" value="Same" >Same</th><th colspan="3" ><input type="radio" name="bs" value="Different" >Different</th></tr>
      <tr><th colspan="6">No of Brothers:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">No of Sisters:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Father Occupation:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Mother Occupation:</th><th colspan="6"><input type="text" ></th></tr>
     <tr><th colspan="6">Phone No[Land Line]:</th><th colspan="6"><input type="text" ></th></tr>
     <tr><th colspan="6">Parent Email-Id:</th><th colspan="6"><input type="text" ></th></tr>
     <tr><th colspan="6">Annual Income:</th><th colspan="6"><input type="text" ></th></tr></table>
      <h4 class="cool"> Student Proctor Details </h4>
      <table style="margin:0 auto;">
      <tr><th colspan="6">Faculty Name:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Faculty gender:</th><th colspan="3" ><input type="radio" name="fg" value="Male" >Male</th><th colspan="3" ><input type="radio" name="fg" value="Female" >Female</th></tr>
      <tr><th colspan="6">Faculty Id:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Proctor Email Id:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Faculty Designation:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Phone No:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Cabin:</th><th colspan="6"><input type="text" ></th></tr>
       <tr><th colspan="6">Faculty Language:</th><th  style="text-align:center;"><select> <option name="Telgu">Telgu</option><option name="Tamil">Tamil</option><option name="Bengali">Bengali</option><option name="Malayalam">Malayalam</option></select></th></td>
      <tr ><th colspan="12"><input id="subm" type="submit" value="Next" ></th></tr>
    </table>
</form>
</div>
</body>
</html>
