
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Airport</title>

<link rel="stylesheet" type="text/css" href="./css/AddAirport.css">

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
<div class="addairport">
	<form action="./addairport" method="post" >
	<h1>Add Airport</h1>
	<p>Airport Name</p>
	<input type="text" name="airportName" placeholder="Enter Airport Name" requried><br><br>
	<p>Abbreviation</p>
	<input type="text" name="Abbreviation" placeholder="Enter Abbreviation" requried><br><br>
	<p>Location</p>
	<input type="text" name="location" placeholder="Enter Location" requried><br><br>
	<p>City</p>
	<input type="text" name="city" placeholder="Enter City" requried><br><br>
	<p>State</p>
	<input type="text" name="state" placeholder="Enter State" requried><br><br>
	<p>Zipcode</p>
	<input type="number" name="zipCode" placeholder="Enter Zipcode" requried><br><br>
	<input type="submit" value="Add Airport">
</form>
</div>
</body>
</html>