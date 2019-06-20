<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cancel Booking</title>
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
		<h1>Booking Cancel</h1>
		<form action="./cancelbooking" method="post">
			<div style="color: red">${message}</div>
			<p>Booking ID:</p>
			<input type="number" name="bookingId" min="1" max="200" required><br>
			<br> <input type="submit" value="CANCEL">
		</form>
	</div>
</body>
</html>