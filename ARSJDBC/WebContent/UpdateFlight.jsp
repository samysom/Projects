<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Flight</title>

<link rel="stylesheet" type="text/css" href="./css/AddFlight.css">

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

<div class="flight">
<form action="./updateflight" method="post">
<h1>Update Flight</h1>
<p>Old Flight Number</p>
<input type="text" name="flightNo" placeholder="Enter Flight Number" required><br>
<p>Airline Name</p>
<input type="text" name="airline" placeholder="Enter Airline Name" required><br>
<p>Departure City</p>
<input type="text" name="depCity" placeholder="Enter Departure City" required><br>
<p>Arrival City</p>
<input type="text" name="arrCity" placeholder="Enter Arrival  City" required><br>
<p>Departure Date</p>
<input type="date" name="depDate" placeholder="Enter Departure Date" required><br>
<p>Arrive Date</p>
<input type="date" name="arrDate" placeholder="Enter Arrival Date " required><br>
<p>First Seat Number</p>
<input type="number" name="firstSeats" placeholder="Enter Seat Number" required><br>
<p>First Seat Fare</p>
<input type="number" name="firstSeatFare" placeholder="Enter Seat fare" required><br>
<p>Business Seat Number</p>
<input type="number" name="bussSeats" placeholder="Enter Seat Number" required><br>
<p>Business Seat Fare</p>
<input type="number" name="bussSeatsFare" placeholder="Enter Seat fare" required><br><br>
<input type="submit" value="ADD FLIGHT">
</form>
</div>
</body>
</html>