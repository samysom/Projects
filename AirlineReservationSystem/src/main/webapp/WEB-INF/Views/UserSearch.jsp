<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Search</title>
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
<form action="./searchuser" method="post">
<div style="color:red"> ${message}</div>
<h1>Search User</h1>
<p1>UserName:</p1><input type="text" name="userName" placeholder="Enter User Name" required><br>
<br>
<input type="submit" value="Search User">
</form>
</body>
</html>