
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Airport Add</title>
<link rel="stylesheet" type="text/css"
	href="./resources/css/AddAirport.css">

<link rel="stylesheet" type="text/css" href="./css/AddAirport.css">

<style type="text/css">
body {
	background: url(./images/Home.jpg);
	background-size: cover;
	font-family: sans-serif;
}
</style>
</head>
<body>

	<div class="addairport">
		<form action="./addairport" method="post">
			<div style="color: red">${message}</div>

			<h1>Add Airport</h1>
			<p>AirportName:</p>
			<input type="text" name="airportName"
				placeholder="Enter Airport Name" required><br>
			<p>Abbreviation:</p>
			<input type="text" name="Abbreviation" pattern="[A-Za-z]{3}"
				placeholder="Enter Abbreviation" required><br>
			<p>Location:</p>
			<input type="text" name="location" placeholder="Enter Location"
				required><br>
			<p>City:</p>
			<input type="text" name="city" placeholder="Enter City" required><br>
			<p>State:</p>
			<input type="text" name="state" placeholder="Enter State" required><br>
			<p>Zipcode:</p>
			<input type="number" name="zipCode" placeholder="Enter Zipcode" required><br><br>
				<input type="submit" value="Add Airport">
		</form>
	</div>

</body>
</html>