<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Airport</title>
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
		<form action="./updateairport" method="post">
			<div style="color: red">${message}</div>
			<h1>Update Airport</h1>
			<p>Enter Abbreviation</p>
			<br> <input type="text" name="abbreviation" required><br>
			<br>
			<h1>Update Data</h1>
			<br>
			<p>Location</p>
			<input type="text" name="location" required><br>
			<br>
			<p>City</p>
			<input type="text" name="city" required><br>
			<br>
			<p>Zipcode</p>
			<input type="number" name="zipCode" required><br>
			<br> <input type="submit" value="Update Airport">
		</form>
	</div>

</body>
</html>