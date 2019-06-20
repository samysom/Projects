<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight List</title>
<style type="text/css">
body {
	background: url(./images/ListResult.jpg);
	background-size: cover;
	font-family: sans-serif;
}
</style>
</head>
<body>
	<c:forEach items="${lists}" var="element" >
		<table border="1" bgcolor="#FFFFFF" align="center">
			<tr>
				<th>FlightNo</th>
				<th>Airline</th>
				<th>Departure Date</th>
				<th>Arrival Date</th>
				<th>Departure Time</th>
				<th>arrival Time</th>
				<th>Departure City</th>
				<th>Arrival City</th>
				<th>Fare</th>
			</tr>
			<tr>
				<td><c:out value="${element.flightNo}" /></td>
				<td><c:out value="${element.airline}" /></td>
				<td><c:out value="${element.depDate}" /></td>
				<td><c:out value="${element.arrDate}" /></td>
				<td><c:out value="${element.depTime}" /></td>
				<td><c:out value="${element.arrTime}" /></td>
				<td><c:out value="${element.depCity}" /></td>
				<td><c:out value="${element.arrCity}" /></td>
				<td><c:out value="${element.fare}" /></td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>