<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Airport</title>

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
	<h1>Delete Airport</h1>
	<form action="./deleteairport" method="post" >
	<p>Abbreviation</p>
	<input type="text" name="abbreviation" placeholder="Enter Abbreviation" required><br><br>
	<input type="submit" value="Delete Airport">
	</form>
</div>
</body>
</html>