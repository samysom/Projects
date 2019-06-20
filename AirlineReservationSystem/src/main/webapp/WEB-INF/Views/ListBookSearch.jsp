<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Search</title>
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
		<h1>Search Booking</h1>
		<p>Flight No.:
		<p>
			<br>
			<select name="flightno">
				<option value="">Select a Flight Number</option>
				<option value="123qw" required>123QW</option>
				<option value="AB272" required>AB272</option>
			</select><br>
		<form action="./listbookshow" method="get">
			<input type="submit" value="Search Flight List">
		</form>
		</div>
</body>
</html>