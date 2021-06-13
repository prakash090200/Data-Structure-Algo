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
    background-color:pink;

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

    <h1 class="cool"> Student permanent Address </h1>
    <div class="all">
      <table style="margin:0 auto;">
      <form method="post" action="educational_detail.php">
      <tr><th colspan="6">Street No:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Area Name:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Permanent/Current Address:</th><th colspan="3" ><input type="radio" name="addr" value="Same" >Same</th><th colspan="3" ><input type="radio" name="addr" value="Different" >Different</th></td>
      <tr><th colspan="6">City:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">State:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Country:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">PinCode:</th><th colspan="6"><input type="text" ></th></tr>
     <tr><th colspan="6">Phone No[Land Line]:</th><th colspan="6"><input type="text" ></th></tr></table>
      <h4 class="cool"> Student Hostel Details </h4>
      <table style="margin:0 auto;">
      <tr><th colspan="6">Application no:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Registration NO:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Bock no:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Room No:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Bed Type:</th><th  style="text-align:center;"><select> <option name="4-bed">4-bed</option><option name="2-bed">2-bed</option><option name="3-bed">3-bed</option><option name="1-bed-ac">1-bed-ac</option></select></th></td>
       <tr><th colspan="6">Mess Information:</th><th colspan="3" ><input type="radio" name="mess" value="Veg" >Veg</th><th colspan="3" ><input type="radio" name="mess" value="Non-Veg" >Non-Veg</th></td>
      <tr ><th colspan="12"><input id="subm" type="submit" value="Next" ></th></tr>
    </table>
</form>
</div>
</body>
</html>
