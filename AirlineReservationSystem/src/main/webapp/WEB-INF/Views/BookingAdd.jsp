<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
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
	<form action="./booking" method="post">
		<h1>Add Flight</h1>
		<p>Email:</p>
		<input type="text" name="custemail" required><br>
		<br>
		<p>No. of Passengers:</p>
		<input type="number" min="1" max="10" name="noPassangers" required><br>
		<br>
		<p>ClassType:</p>
		<input type="radio" name="classType" value="Economy" required>Economy
		<input type="radio" name="classType" value="Business" required>Business<br>
		<br>
		<p>PaymentMode:</p>
		<input type="radio" name="paymentMode" value="Card" required>Card
		<input type="radio" name="paymentMode" value="UPI" required>UPI
		<input type="radio" name="paymentMode" value="Wallet" required>Wallet<br>
		<br>
		<p>Flight No.:</p>
		<select name="flightno">
			<option value="">Select a Flight Number</option>
			<option value="123qw" required>123QW</option>
			<option value="AB272" required>AB272</option>
		</select><br>
		<br>
		<p>Source City:</p>
		<input type="radio" name="srcCity" value="BBS" required>BBS <input
			type="radio" name="srcCity" value="DEL" required>DEL <input
			type="radio" name="srcCity" value="MUM" required>MUM<br>
		<br>
		<p>Destination City:</p>
		<input type="radio" name="destCity" value="BBS" required>BBS <input
			type="radio" name="destCity" value="DEL" required>DEL <input
			type="radio" name="destCity" value="MUM" required>MUM<br>
		<br> <input type="submit" value="BOOK FLIGHT">
	</form>
</div>
</body>
</html>