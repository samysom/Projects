<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Update</title>
<link rel="stylesheet" type="text/css" href="./css/UpdateAirport.css">
<style type="text/css">
body {
	background: url(./images/Home.jpg);
	background-size: cover;
	font-family: sans-serif;
}
</style>
</head>
<body>
<div class="update">
	<form action="./update" method="post">
	<div style="color:red"> ${message}</div>
	<h1>Modify Details</h1>
		<p>User Name</p><input type="text" name="userName" placeholder="Enter User Name" required> <br><br>
		<h1>Update</h1>
		<p>Password</p><input type="password" name="password" placeholder="Enter Password" required> <br>
		<p>Mobile Number:</p><input type="number" name="mobileNo" min="999999999" max="9999999999" placeholder="Enter Mobile Number" required> <br><br>
		
		<input type="submit" value="Update">
	</form>
	</div>
</body>
</html>