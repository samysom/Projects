<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Empire</title>

<style>

body
{
    background-image: url('./resources/images/Empire.jpg');
   
    background-size: cover;
}

.button {
 padding: 15px 25px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: white;
  background-color: black;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

h1
{
color: white;
}

h3
{
color: white;
}

table,th,td{
border:1px solid white;
border-collapse:collapse;
}
</style>
</head>
<body>



<center>
<h1>Empire</h1>
<h3>Hotel Details</h3>

<table border="2" cellspacing="4" bgcolor="lightblue">
<tr><th>HotelId</th><th>City</th><th>HotelName</th><th>Address</th><th>Description</th><th>AvgRatePerNight</th><th>PhoneNo1</th><th>PhoneNo2</th><th>Rating</th><th>Email</th><th>Fax</th></tr>
<tr><td>103</td><td>Goa</td><td>Empire</td><td>88, OMR</td><td>nice hotel</td><td>4000.000000</td><td>8579641230</td><td>8794563210</td><td>4</td><td>empire@gmail.com</td><td>emp456</td>
</table><br>

<a href="bookhotelmvc"><input type="submit" value="Book Hotel" class="button"> </a>

</center>
</body>
</html>