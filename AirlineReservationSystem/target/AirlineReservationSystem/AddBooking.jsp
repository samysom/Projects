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
Email:<input type="text" name="custemail"><br><br>
No. Passangers:<input type="number" name="noPassangers"><br><br>
ClassType:<input type="radio"name="classType" value="Economy">Economy
			  <input type="radio" name="classType" value="Business">Business<br><br>
PaymentMode:<input type="radio"name="paymentMode" value="Card">Card
			  <input type="radio" name="paymentMode" value="UPI">UPI
			  <input type="radio" name="paymentMode" value="Wallet">Wallet<br><br>
FlightNo:<input type="radio"    name="flightno" value="AB121">AB121
			  <input type="radio" name="flightno" value="B2324">B2324
			  <input type="radio" name="flightno" value="AB207">AB207<br><br>
Source City:<input type="radio"name="srcCity" value="BBS">BBS
			  <input type="radio" name="srcCity" value="DEL">DEL
			  <input type="radio" name="srcCity" value="MUM">MUM<br><br>
Destination City:<input type="radio"name="destCity" value="BBS">BBS
			  <input type="radio" name="destCity" value="DEL">DEL
			  <input type="radio" name="destCity" value="MUM">MUM<br><br>
<input type="submit" value="BOOK FLIGHT">

</body>
</html>