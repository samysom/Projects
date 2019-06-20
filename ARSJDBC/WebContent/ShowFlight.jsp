<%@page import="com.airline.dto.FlightInformationDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Flight</title>
<link rel="stylesheet" type="text/css" href="./css/ListFlight.css">

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
	<%
		FlightInformationDTO fi = (FlightInformationDTO) session.getAttribute("flight");
	%>
<div class="table">
	<h1>Flight Detail</h1>
	<table>
	<tr>
		<th>FlightNo</th>
		<th>Airline</th>
		<th>DepCity</th>
		<th>ArrCity</th>
		<th>DepDate</th>
		<th>ArrDate</th>
		<th>FirstSeat</th>
		<th>FirstSeatFare</th>
		<th>BussSeat</th>
		<th>BussSeatFare</th>
	</tr>
	
	<tr>
		<td><%=fi.getFlightNo() %></td>
		<td><%=fi.getAirline() %></td>
		<td><%=fi.getDepCity() %></td>
		<td><%=fi.getArrCity() %></td>
		<td><%=fi.getDepDate() %></td>
		<td><%=fi.getArrDate() %></td>
		<td><%=fi.getFirstSeats() %></td>
		<td><%=fi.getFirstSeatFare() %></td>
		<td><%=fi.getBussSeats() %></td>
		<td><%=fi.getBussSeatsFare() %></td>
	</tr>
	</table>
</div>

</body>
</html>