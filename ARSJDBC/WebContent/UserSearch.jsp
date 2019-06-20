<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search User</title>

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
<form action="./searchUser" method="post">
<h1>Search User</h1>
<p>User Name</p>
<input type="text" name="username" placeholder="Enter User Name" required><br><br>
<input type="submit" value="Search User">
</form>
</div>
</body>
</html>