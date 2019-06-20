<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Update</title>
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
		<form action="./updatebooking" method="post">
			<h1>Update Booking</h1>
			<p>Booking ID:</p>
			<input type="number" name="bookingId"><br> <br>
			<h1>Update Components</h1>
			<p>ClassType:</p>
			<input type="radio" name="classType" value="Economy" required>Economy
			<input type="radio" name="classType" value="Business" required>Business<br>
			<br>
			<p>Source City:</p>
			<input type="radio" name="srcCity" value="BBS" required>BBS <input
				type="radio" name="srcCity" value="DEL" required>DEL <input
				type="radio" name="srcCity" value="MUM" required>MUM<br>
			<br>
			<p>Destination City:</p>
			<input type="radio" name="destCity" value="BBS" required>BBS
			<input type="radio" name="destCity" value="DEL" required>DEL
			<input type="radio" name="destCity" value="MUM" required>MUM<br>
			<br> <input type="submit" value="UPDATE BOOKING">
		</form>
		</div>
</body>
</html>