<!DOCTYPE html>
<html>
<head>
  <title>Layout Master</title>
  <link rel="stylesheet" type="text/css" href="navucssgrid.css">
  <style type="text/css">
  body{
    margin:auto 0;
}
.zone{
    font-size:2em;
    border:1px solid #bbb;
    border-radius:6px;
    transition:all 1s;
    cursor:pointer;
}
.cover{
    width:300px;
    height:300px;
}
.zone:hover{
    box-shadow:4px 4px 5px black; 
}
.green{
    background:linear-gradient(rgba(56,100,67,0.88),rgba(29,200,43,0.99));
}
.main-nav{
    margin:0;
    display:flex;
    list-style:none;
    
}
a{
    color:#f5f5f6;
    text-decoration:none;
}
li{
    padding:20px;
}
.push{
    margin-left:auto;
}
.red{
    background:white;
    display:flex;
    height:60vh;
    align-items:center;
    justify-content:center;
}
.wrapper{
    display:grid;
    grid-gap:20px;
    grid-template-columns:repeat(auto-fill,minmax(200px,1fr));
    background:rgba(24,110,34,0.89);
}
img{
    width:100px;
    height:100px;
}

.box >img{
    width:100%;
}
.box{
    background:grey;
    padding:20px;
    margin:20px;
    text-align:center;
    transition:all 1s;
}
img:hover{
    transform:rotate(7deg);
}
</style>
</head>
<body>
	<nav class="zone green">
<ul class="main-nav">
  <li><a href="firstpage.php" >About</a></li>
  <li><a href="">products</a></li>
  <li><a href=""> other items</a></li>
  <li class="push"><a href="">contacts</a></li>
</ul>
</nav>
<div class="zone red"><img class="cover" src="n1.jpg"></div>
<div class="wrapper">
	<div class="zone box"><img src="n2.jpg"></div>
	<div class="zone box"><img src="n3.jpg"></div>
	<div class="zone box"><img src="n4.jpg"></div>
	<div class="zone box"><img src="n5.jpg"></div>
	<div class="zone box"><img src="n6.jpg"></div>
	<div class="zone box"><img src="n7.jpg"></div>
</div>

</body>
</html>
<link  rel="stylesheet" type="text/css" href=""