<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Flight</title>
<link rel="stylesheet" type="text/css" href="./css/DeleteAirport.css">
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
<div class="deleteairport">
<form action="./searchflight" method="post">
<div style="color:red"> ${message}</div>
<h1>Search   Flight</h1>
<p>Flight No.:</p><br><br>
 <select name="flightNo">
  <option value="">Select a Flight Number</option>
  <option value="123qw">123QW</option>
  <option value="AB272">AB272</option>
</select><br><br>
<input type="submit" value="Search Flight">
</form>
</div>
</body>
</html>