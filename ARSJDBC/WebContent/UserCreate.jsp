<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Profile</title>

<link rel="stylesheet" type="text/css" href="./css/UserCreate.css">

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
<div class="create">
	<form action="./create" method="post">
	<h1>Sign Up</h1>
		<p>User Name</p>
		<input type="text" name="username" placeholder="Enter User Name" required> <br>
		<p>Password</p>
		<input type="password" name="password" placeholder="Enter Password" required> <br>
		<p>Mobile Number</p>
		<input type="text" name="mobileno" placeholder="Enter Mobile Number" required> <br>
		<p>Role</p>
		<input type="radio"name="role" value="Executive" placeholder="Role" required>Executive
		<input type="radio" name="role" value="User" placeholder="" required>User <br>
		<input type="submit" value="Sign Up">
	</form>
</div>
</body>
</html>