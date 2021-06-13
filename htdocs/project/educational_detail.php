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
    background-color:yellow;

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

    <h1 class="cool"> Educational Information </h1>
    <div class="all">
      <table style="margin:0 auto;">
      <form method="post" action="proctor_detail.php">
      <tr><th colspan="6">Applied Degree:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Educational Qualification:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Medium of Study:</th><th colspan="3" ><input type="radio" name="medium" value="Hindi" >Hindi</th><th colspan="3" ><input type="radio" name="medium" value="English" >English</th>
      <tr><th colspan="6">School:</th><th colspan="6" style="text-align:left;" ><input type="radio" name="school" value="Government" >Government</th></tr>
      <tr><th colspan="6"></th><th colspan="6" style="text-align:left;" ><input type="radio" name="school" value="Private" >Private</th></tr>
      <tr><th colspan="6">School name:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Learned Languages:</th><th colspan="6" style="text-align:center;"><select> <option name="Hindi">Hindi</option><option name="punjabi">Punjabi</option><option name="Telgu">Telgu</option><option name="Tamil">Tamil</option></select></th></td>
      <tr><th colspan="6">Board/University:</th><th colspan="6"><input type="text" ></th></tr>
<tr><th colspan="6">Break In Study:</th><th colspan="6" style="text-align:center;"><select multiple="yes"> <option name="yes">YES</option><option name="No">No</option></select>
      <tr><th colspan="6">Year of Passing:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Month of Passing:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Pursuing:</th><th colspan="3"><input type="checkbox" value="branch" >Btech</th><th colspan="3"><input type="checkbox" value="branch" >Mtech</th></tr>
      <tr><th colspan="6">University Branch:</th><th colspan="6"><input type="text" ></th></tr></table>
      <h4 class="cool"> College Address </h4>
      <table style="margin:0 auto;">
      <tr><th colspan="6">Area Name:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">District Name:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">State Name:</th><th colspan="6"><input type="text" ></th></tr>
      <tr><th colspan="6">Pincode:</th><th colspan="6"><input type="text" ></th></tr>
      <tr ><th colspan="12"><input id="subm" type="submit" value="Next" ></th></tr>
    </table>
</form>
</div>
</body>
</html>
