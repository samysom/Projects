<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Flight</title>
</head>
<body>
<form action="./updateflight" method="post">
Flight No:<input type="number" name="flightNo"><br><br>
<h1>Update Flight</h1>
Airline:<input type="text" name="airline"><br><br>
DepCity:<input type="text" name="depCity"><br><br>
ArrCity:<input type="text" name="arrCity"><br><br>
DepDate:<input type="date" name="depDate"><br><br>
ArrDate:<input type="date" name="arrDate"><br><br>
DepTime:<input type="time" name="depTime"><br><br>
ArrTime:<input type="time" name="arrTime"><br><br>
Fare:<input type="number" name="fare"><br><br>
<input type="submit" value="UPDATE FLIGHT">
</form>
</body>
</html>