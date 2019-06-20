<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home</title>

<link rel="stylesheet" type="text/css" href="./css/UserHomePage.css">

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
<h1>User Home</h1>
<div class="logout">
	<a href="./Login.jsp"> <button>Logout</button>
</div>
<div class="userhome">
	<a href="./UserUpdate.jsp"> <button>Update Profile</button></a>
	<a href="./UserUpdate.jsp"> <button>Book Flight</button></a>
	<a href="./UserUpdate.jsp"> <button>Update Ticket</button></a>
	<a href="./UserUpdate.jsp"> <button>Cancel Ticket</button></a>

</div>

</body>
</html>