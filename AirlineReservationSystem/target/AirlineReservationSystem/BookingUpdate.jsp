<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./updatebooking" method="post">
<h1>Update Booking</h1>
Booking ID:<input type="number" name="bookingId"><br><br>
<h1>Update Components</h1>
ClassType:<input type="radio"name="classType" value="Economy">Economy
			  <input type="radio" name="classType" value="Business">Business<br><br>
Source City:<input type="radio"name="srcCity" value="BBS">BBS
			  <input type="radio" name="srcCity" value="DEL">DEL
			  <input type="radio" name="srcCity" value="MUM">MUM<br><br>
Destination City:<input type="radio"name="destCity" value="BBS">BBS
			  <input type="radio" name="destCity" value="DEL">DEL
			  <input type="radio" name="destCity" value="MUM">MUM<br><br>
<input type="submit" value="UPDATE BOOKING">
</form>
</body>
</html>