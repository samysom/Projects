<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Booking</title>
<style type="text/css">
body {
	background: url(./images/ListResult.jpg);
	background-size: cover;
	font-family: sans-serif;
}
</style>
</head>
<body>
<c:forEach items="${lists}" var="element">
		<table border="1" bgcolor="#FFFFFF" align="center">
			<tr>
				<th>Booking Id</th>
				<th>Customer Mail</th>
				<th>Number ofPassangers</th>
				<th>ClassType</th>
				<th>Payment Mode</th>
				<th>Source City</th>
				<th>Destination City</th>
			</tr>
			<tr>
				<td><c:out value="${element.bookingId}" /></td>
				<td><c:out value="${element.custemail}" /></td>
				<td><c:out value="${element.noPassangers}" /></td>
				<td><c:out value="${element.classType}" /></td>
				<td><c:out value="${element.paymentMode}" /></td>
				<td><c:out value="${element.srcCity}" /></td>
				<td><c:out value="${element.destCity}" /></td>
			</tr>
		</table>
	</c:forEach>

</body>
</html>