<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" type="text/css" href="./css/Login.css">

<style>
.button {
  background-color: #1c8adb;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 10px;
}
</style>

<style type="text/css">
body {
	background: url(./images/Home.jpg);
	background-size: cover;
	font-family: sans-serif;
}
</style>
</head>
<body>
<a href="./userm" class="button">Sign Up</a>
<a href="./forgotpasswordm" class="button">Forgot Password</a>
	<div class="login-box">
		<img src="./images/avatar.png" class="avatar">
		<h1>Login Here</h1>
		<form action="./login" method="post">
			<div style="color: red">${message}</div>
			<div style="color: blue">${creationmessage}</div>

			<p>User Name:</p>
			<input type="text" name="userName" placeholder="Enter Username"
				required> <br>
			<p>Password:</p>
			<input type="password" name="password" placeholder="Enter Password"
				required> <br>
			<p>Role:</p>
			<input type="radio" name="role" value="Executive" required>Executive
			<input type="radio" name="role" value="User" required>User <input
				type="radio" name="role" value="Admin" required>Administration
			<br> <input type="submit" value="Login">
		</form>
	</div>
</body>
</html>