<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" type="text/css" href="./css/Login.css">

<style type="text/css">
body
{
    background: url(./images/Home.jpg);
    background-size: cover;
    font-family: sans-serif;
}
</style>

</head>
<body>
<div class="login-box">
	<img src="./images/avatar.png" class="avatar">
	<h1>Login Here</h1>
	<form action="./login" method="post">
		<p>User Name</p>
		<input type="text" name="username" placeholder="Enter Username" required> <br>
		<p>Password</p>
		<input type="password" name="password" placeholder="Enter Password" required> <br>
		<p>Role</p>
		<input type="radio"name="role" value="Executive">Executive
			  <input type="radio" name="role" value="User">User
			  <input type="radio" name="role" value="Admin">Administration <br>
		<input type="submit" name="submit" value="Login">
	</form>
</div>
</body>
</html>