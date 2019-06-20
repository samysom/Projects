<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="./css/AdminHomePage.css">

<title>Admin Home</title>

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
	<h1>Administration Home</h1>
	<div class="airport">
		<h3>AIRPORT</h3><br> 
		<a href="./AddAirport.jsp"><button>ADD AIRPORT</button></a> 
		<a href="./DeleteAirport.jsp"><button>DELETE AIRPORT</button></a> 
		<a href="./UpdateAirport.jsp"><button>UPDATE AIRPORT</button></a> 
		<a href="./AirportSearch.jsp"><button>SERACH AIRPORT</button></a><br>
	</div>
	<div class="flight">
		<h3>FLIGHT</h3><br>
		<a href="./AddFlight.jsp"> <button>ADD FLIGHT</button></a>
		<a href="./DeleteFlight.jsp"> <button>DELETE FLIGHT</button></a>
		<a href="./UpdateFlight.jsp"> <button>UPDATE FLIGHT</button></a>
		<a href="./FlightSearch.jsp"> <button>SEARCH FLIGHT</button></a><br>
	</div>
	<div class="user">
		<h3>USER</h3><br>
		<a href="./UserDelete.jsp"> <button>DELETE USER</button></a>
		<a href="./UserSearch.jsp"> <button>SEARCH USER</button></a>
		<a href="./UsersBooking.jsp"> <button>USERS BOOKING</button></a><br>
	</div>
	<div class="list">
		<h3>LIST</h3><br>
		<a href="./listFlights"> <button>FLIGHT LIST</button></a>
		<a href="./listuser"> <button>USERS LIST</button></a><br>
	</div>
	<div class="logout">
	<a href="./Login.jsp"> <button>Logout</button>
	</div>
	
</body>
</html>