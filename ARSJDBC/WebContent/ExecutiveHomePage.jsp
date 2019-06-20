<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Executive Home</title>

<link rel="stylesheet" type="text/css" href="./css/ExecutiveHomePage.css">

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
<h1>Executive Home</h1>
<div class="logout">
	<a href="./Login.jsp"> <button>Logout</button>
</div>
<div class="executive">
	<a href="./ListFlight.jsp"> <button>FLIGHT LIST</button></a><br>
	<a href="./FlightSearch.jsp"> <button>SEARCH FLIGHT</button></a><br>
	<a href="./AirportSearch.jsp"><button>SERACH AIRPORT</button></a><br>
	<a href="./UsersBooking.jsp"> <button>USERS BOOKING</button></a><br>
</div>
</body>
</html>