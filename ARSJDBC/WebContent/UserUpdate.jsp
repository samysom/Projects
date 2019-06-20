<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Details</title>

<link rel="stylesheet" type="text/css" href="./css/UserUpdate.css">
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
<div class="update">
	<form action="./update" method="post">
		<h1>Update Details</h1>
		<p>User Name</p>
		<input type="text" name="username"> <br>
		<p>Password</p>
		<input type="password" name="password"> <br>
		<p>Mobile Number</p>
		<input type="text" name="mobileno"> <br>
		<p>Choose Your Current Role</p>
		<input type="radio" name="role" value="Administration">Administration
		<input type="radio" name="role" value="Executive">Executive
		<input type="radio" name="role" value="User">User <br>
		<input type="submit" value="Update">
	</form>
</div>
</body>
</html>