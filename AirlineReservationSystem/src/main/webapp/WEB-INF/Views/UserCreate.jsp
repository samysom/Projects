<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create User</title>
<link rel="stylesheet" type="text/css" href="./css/UserCreate.css">

<style type="text/css">
body {
	background: url(./images/Home.jpg);
	background-size: cover;
	font-family: sans-serif;
}
</style>
</head>
<body>
	<div class="create">
		<form action="./user" method="post">
			<div style="color: red">${message}</div>
			<h1>Sign Up</h1>
			<p>User Name:</p>
			<input type="text" name="userName" placeholder="Enter User Name" required> <br>
			<p>Password:</p>
			<input type="password" name="password" placeholder="Enter Password" required> <br>
			<p>Mobile Number:</p>
			<input name="mobileNo" type="number" placeholder="Enter Mobile Number" min="999999999" max="9999999999"
				required> <br>
			<p>Role:</p>
			<input type="radio" name="role" value="Executive" required>Executive
			<input type="radio" name="role" value="User" required>User <br>
			<br> <input type="submit" value="Sign Up">
		</form>
		</div>
</body>
</html>