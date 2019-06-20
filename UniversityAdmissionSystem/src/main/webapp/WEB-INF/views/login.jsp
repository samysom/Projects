<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" type="image/png" href="logo.png" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
<style>
.log
{
	position:absolute;
	left:195px;
	top:150px;
}
.body
{
	position:absolute;
	top:0.5px;
	left:0.5px;
	background:url(./resources/images/book.jpg);
	height:640px;
	width:1360px;
	background-size:cover;
}
.back
{
	position:absolute;
	top:90px;
	left:130px;
	height:400px;
	width:430px;
	background:url(log.jpg);
	background-size:cover;
	border-radius:50px;
}
.caption
{
	position:absolute;
	top:5px;
	left:500px;
	font-size:40px;
	font-style:italic;
	color:#F30;
}
</style>					
</head>
<body>
<div class="body"></div>
<div class="back"></div>
<div class="caption">University Stuff Login Portal</div>
<form action="./loginmvclog" method="post">
<div class="log">
<fieldset style="width:10%">
<legend align="center"><b><font color="#000000" size="+3"><i>Account Login</i></font></b></legend>
<table border="0" cellspacing="5" cellpadding="5" bgcolor="#FF9966">
<tr><td><input type="text" name="role" placeholder="Enter Role" required  pattern="[A-Za-z ]{2,5}" ></td></tr>
<tr><td><input type="text" name="username" placeholder="Enter User Name" required pattern="[A-Za-z ]{2,5}"  /></td></tr>
<tr><td><input type="password" name="password" placeholder="Enter Password" required/></td></tr>
<tr><td><input type="submit" value="Log In" name="log" style="height:35px; width:80px; background-color:#6F6; border-radius:10px" /></td><td><input type="reset" value="Reset" style="height:35px; width:80px; background-color:#0F9; border-radius:10px"></td></tr>
</table>
</fieldset>
</div>
</form>

</body>
</html>