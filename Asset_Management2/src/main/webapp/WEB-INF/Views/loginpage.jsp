<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
	<link rel="stylesheet" type="text/css" href="./resources/CSS/login1.css">
	
	
	
</head>
<body>
 
<body background="./resources/image/Nature1.jpg">
<h2>Asset Management System</h2>

<div class="loginbox">
<img src="./resources/image/avatar.png" class="pic">
<h1>Login form</h1>

<form action="./loginmvc" method="post">
	<p>Username</p>
	<input type="text" name="username" placeholder="Enter Username">
	<p>Password</p>
	<input type="password" name="password" placeholder="Enter Password">
	<p>User Type</p>
	<select name="usertype">
		<option>------Select User Here------</option>
		<option value="Admin">Admin</option>
		<option value="Manager">Manager</option>
	</select>
	<input type="submit" name="submit"  value="Login">
	<a href="#">Forget Password</a>	
</form>

</div>

</body>
</html>