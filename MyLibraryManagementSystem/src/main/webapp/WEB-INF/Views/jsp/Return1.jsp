<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="./resources/css/Returns.css">
 

</head>
<body>
<style>
body
{
	background-image: url("./resources/images/Return.jpg");
	background-size:cover;
	color:white;
}
</style>

<form action="./returntransaction1" method="post">
<center>
<div class="box" >
<h2>
Transaction Id:<input type="text" name="transaction_id" required><br><br>
Registration Id:<input type="text" name="registraton_id" required><br><br><br>
<button><b>TRACK<b></b></button>
</h2>
</div>
</center>
</form>
</body>
</html>