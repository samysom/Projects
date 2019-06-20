<%@page import="com.airline.dto.AirportDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Detail</title>

<link rel="stylesheet" type="text/css" href="./css/ShowAirport.css">

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
		AirportDTO ap = (AirportDTO) session.getAttribute("airport");
	%>
<div class="atable">
	<h1>Airport Detail</h1>
	<table>
	<tr>
		<th>AirportName</th>
		<th>Abbreviation</th>
		<th>Location</th>
		<th>City</th>
		<th>State</th>
		<th>ZipCode</th>
	</tr>
	
	<tr>
		<td><%=ap.getAirportName() %></td>
		<td><%=ap.getAbbreviation() %></td>
		<td><%=ap.getLocation() %></td>
		<td><%=ap.getCity() %></td>
		<td><%=ap.getState() %></td>
		<td><%=ap.getZipCode() %></td>
	</tr>
	</table>
</div>

</body>
</html>