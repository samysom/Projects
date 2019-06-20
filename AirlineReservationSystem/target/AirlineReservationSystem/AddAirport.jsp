
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./addairport" method="post">
<h1>Add Airport</h1>
AirportName:<input type="text" name="airportName"><br><br>
Abbreviation:<input type="text" name="Abbreviation"><br><br>
Location:<input type="text" name="location"><br><br>
City:<input type="text" name="city"><br><br>
State:<input type="text" name="state"><br><br>
Zipcode:<input type="number" name="zipCode"><br><br>
<input type="submit" value="Add Airport">
</form>

</body>
</html>