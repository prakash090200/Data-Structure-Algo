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

    <h1 class="cool"> Personal Information </h1>
    <div class="all">
      <table style="margin:0 auto;">
      <form method="post" action="personalinfo_backendfetch.php">
      <tr><th colspan="6">Application No:</th><th colspan="6"><input type="text" name="a" ></th></tr>
      <tr><th colspan="6">Student Name:</th><th colspan="6"><input type="text" name="c"></th></tr>
      <tr><th colspan="6">Date Of Birth:</th><th colspan="6" style="text-align:center;"><input type="date"  ></th></tr>
      <tr><th colspan="6">Gender:</th><th colspan="6" style="text-align:left;" ><input type="radio" name="gender" value="Male" >Male</th></tr>
      <tr><th colspan="6"></th><th colspan="6" style="text-align:left;"><input type="radio" name="gender" value="Female" >Female</th></tr>
      <tr><th colspan="6"></th><th colspan="6" style="text-align:left;"><input type="radio" name="gender" value="Others" >Others</th></tr>
      <tr><th colspan="6">Native State:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Native Language:</th><th colspan="6" style="text-align:center;"><select> <option name="Hindi">Hindi</option><option name="punjabi">Punjabi</option><option name="Telgu">Telgu</option><option name="Tamil">Tamil</option></select></th></td>
      <tr><th colspan="6">Branch:</th><th colspan="6"><input type="text" name="e"></th></tr>
      <tr><th colspan="6">Physically Challenged:</th><th style="text-align:left;"><input type="radio" name="ph" value="yes">YES</th></tr>
      <tr><th colspan="6"></th><th style="text-align:left;"><input type="radio" name="ph" value="no">NO</th></tr>
      <tr><th colspan="6">year:</th><th colspan="6"><input type="text" name="f" ></th></tr>
      <tr><th colspan="6">Religion:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Caste:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Nationality:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Hosteller:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Community:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">phone No:</th><th colspan="6"><input type="text" name="d"></th></tr>
      <tr><th colspan="6">Mess requirements:</th><th colspan="3"><input type="checkbox" name="b" value="Veg">Veg</th><th colspan="3"><input type="checkbox" name="b" value="Non-Veg">Non-Veg</th></tr>
      <tr><th colspan="6"></th><th colspan="3"><input type="checkbox" name="b" value="Darling Mess">Darling Mess</th><th colspan="3"><input type="checkbox" name="b" value="Foodmall">Foodmall</th></tr>
      <tr ><th colspan="12"><input id="subm" type="submit" value="Next" ></th></tr>
      <form>
      </div>
    </table>
  </body>
</html>
