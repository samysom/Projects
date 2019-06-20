<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Flight</title>
</head>
<body>

<form action="./addflight" method="post">
<h1>Add Flight</h1>
Flight No:<input type="text" name="flightNo"><br><br>
Airline:<input type="text" name="airline"><br><br>
DepCity:<input type="text" name="deptCity"><br><br>
ArrCity:<input type="text" name="arrCity"><br><br>
DepDate:<input type="date" name="depDate"><br><br>
ArrDate:<input type="date" name="arrDate"><br><br>
DepTime:<input type="time" name="depTime"><br><br>
ArrTime:<input type="time" name="arrTime"><br><br>
FirstSeats:<input type="number" name="firstSeats"><br><br>
FirstSeatFare:<input type="number" name="firstSeatFare"><br><br>
BussSeats:<input type="number" name="bussSeats"><br><br>
BussSeatsFare:<input type="number" name="bussSeatsFare"><br><br>
<input type="submit" value="ADD FLIGHT">

</form>
</body>
</html>