<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./booking" method="post">
<h1>Add Flight</h1>
Booking ID:<input type="number" name="bookingId"><br><br>
Email:<input type="text" name="custemail"><br><br>
No. Passangers:<input type="text" name="noPassangers"><br><br>
ClassType:<input type="radio"name="classType" value="Economy">Economy
			  <input type="radio" name="classType" value="Business">Business
Fare:<input type="date" name="totalFare"><br><br>
SeatNo:<input type="date" name="SeatNo"><br><br>
PaymentMode:<input type="radio"name="paymentMode" value="Card">Card
			  <input type="radio" name="paymentMode" value="UPI">UPI
			  <input type="radio" name="paymentMode" value="Wallet">Wallet
FlightNo:<input type="time" name="flightno"><br><br>
Source City:<input type="radio"name="srcCity" value="BBS">BBS
			  <input type="radio" name="srcCity" value="DEL">DEL
			  <input type="radio" name="srcCity" value="MUM">MUM
Source City:<input type="number" name="srcCity"><br><br>
Destination City:<input type="radio"name="destCity" value="BBS">BBS
			  <input type="radio" name="destCity" value="DEL">DEL
			  <input type="radio" name="destCity" value="MUM">MUM
<input type="submit" value="BOOK FLIGHT">

</body>
</html>