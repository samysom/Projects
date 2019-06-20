<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
<link rel="stylesheet" type="text/css" href="./css/DeleteAirport.css">
<style type="text/css">
body {
	background: url(./images/Home.jpg);
	background-size: cover;
	font-family: sans-serif;
}
</style>
</head>
<body>
	<div class="deleteairport">
		<h1>Change Password</h1>
		<form action="./forgotpassword" method="post">
			<div style="color: red">${message}</div>
			<p>User Name</p>
			<input type="text" name="userName" placeholder="Enter User Name">
			<br>
			<p>New Password</p>
			<input type="password" name="password"
				placeholder="Enter New Password"> <br> <input
				type="submit" value="Reset Password">
		</form>
	</div>
</body>
</html>