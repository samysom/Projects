<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" type="image/png" href="logo.png" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Application Status</title>
<style>
.head
{
position:absolute;
left:1px;
top:1px;
height:115px;
width:100%;
background-color:#F66;
border-radius:25px;
}
.logo
{
	position:absolute;
	left:10px;
	top:15px;
	height:80px;
	width:120px;
	background:url(./resources/images/logo.png);
	background-size:cover;
}
.home
{
	height:34px;
	width:140px;
	background-color:#FC0;
	position:absolute;
	left:245px;
	top:55px;
	font-size:24px;
	border-radius:10px;
	color:#093;
	padding:5px;
	transition-duration:2s;
	
}
.home:hover
{
	width:170px;
	transition-duration:2s;
	box-shadow:15px 15px 15px #30C;
}
.about
{
	height:34px;
	width:140px;
	background-color:#FC0;
	position:absolute;
	left:545px;
	top:55px;
	font-size:24px;
	border-radius:10px;
	color:#093;
	padding:5px;
	transition-duration:2s;
}
.about:hover
{
	width:170px;
	transition-duration:2s;
	box-shadow:15px 15px 15px #30C;
}
.contact
{
	height:34px;
	width:140px;
	background-color:#FC0;
	position:absolute;
	left:845px;
	top:55px;
	font-size:16px;
	border-radius:10px;
	color:#093;
	padding:5px;
	transition-duration:2s;
}
.contact:hover
{
	width:170px;
	transition-duration:2s;
	box-shadow:15px 15px 15px #30C;
	
}
.caption
{
	position:absolute;
	top:5px;
	left:520px;
	font-size:30px;
	font-style:italic;
}
.footer
{
	height:100px;
	width:1340px;
	background-color:#0FC;
	position:absolute;
	top:565px;
	border-radius:35px;
}
.facebook
{
	height:50px;
	width:45px;
	position:absolute;
	left:600px;
	top:610px;
	background:url(facebook.png);
	background-size:45px 50px;
}
.insta
{
	height:50px;
	width:45px;
	position:absolute;
	left:660px;
	top:610px;
	background:url(insta.png);
	background-size:45px 50px;
}
.gplus
{
	height:50px;
	width:45px;
	position:absolute;
	left:720px;
	top:610px;
	background:url(ggg.png);
	background-size:45px 50px;
}
.viewstatus
{
	position:absolute;
	top:300px;
	left:500px;
	font-size:24px;
}
.body
{
	height:440px;
	width:1355px;
	position:absolute;
	top:116px;
	border:solid;
	left:1px;
	border-radius:40px;
	background-color:#39F;
}
</style>
</head>
<body>

<div class="head">
<div class="caption">AJPRSV UNIVERSITY</div>
</div>

<a href=Home.jsp><div class="logo"></div></a>
<div class="body"></div>
<a href=./mainHomePagemvc><div class="home"><center>HOME</center></div></a>
<div class="about"><center>ABOUT US</center></div>
<div class="contact"><center>CONTACT US</center></div>
<div class="footer"><center><font size="+3"><b><i>FOLLOW US ON</i></b></font></center></div>
<a href="https://www.facebook.com/"><div class="facebook"></div></a>
<a href="https://www.instagram.com/"><div class="insta"></div></a>
<a href="https://plus.google.com/discover"><div class="gplus"></div></a>
<form action="./applicationstatusmvclog" method="post">
<div class="viewstatus">Enter Application Id<input Type="Number" name="appId" style="height:35px; width:100px; border-radius:15px"><br>
<input type="submit" value="Get My Status" style="height:35px; width:100px; border-radius:15px">
</div>
</form>
</body>
</html>