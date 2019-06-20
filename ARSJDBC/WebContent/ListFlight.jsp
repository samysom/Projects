<%@page import="com.airline.dto.FlightInformationDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight List</title>

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
		List<FlightInformationDTO> lists = (List<FlightInformationDTO>) session.getAttribute("lists");
%>
<div class="table">
	<h1>Flight Details</h1>
	<table>
	<tr>
		<th>Flight Number</th>
		<th>Airline</th>
		<th>Departure City</th>
		<th>Arrival City</th>
		<th>Departure Date</th>
		<th>ArrivalDate</th>
		<th>First Seat</th>
		<th>First Seat Fare</th>
		<th>Business Seat</th>
		<th>Business Seat Fare</th>
	</tr>
	
	<%
			for(FlightInformationDTO fi:lists)
			{
				out.println("<tr><td>"+fi.getFlightNo()+"</td><td>"+fi.getAirline()+"</td><td>"+fi.getDepCity()+"</td><td>"+fi.getArrCity()+"</td><td>"+fi.getDepDate()+"</td><td>"+fi.getArrDate()+"</td><td>"+fi.getFirstSeats()+"</td><td>"+fi.getFirstSeatFare()+"</td><td>"+fi.getBussSeats()+"</td><td>"+fi.getBussSeatsFare()+"</td></tr>");
			}
	%>

	</table>
</div>
</body>
</html>