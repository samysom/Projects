<%@page import="com.library.project.dto.UserJPA"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% boolean li=(boolean) request.getAttribute("b"); %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/StudentHome.css">
<style>
body{
	
	background-image: url("./resources/images/StudentHome.jpg");
   background-size: cover;
   color:white;
}
</style>
</head>
<body><%out.print("<h1 style='color:white'><center>"+"Book Is Registered"+"</center></h1>"); %>
<br><br><br><br>
<br><br><br>
<br><br><br>
<br><br><br>
<br><br><br>
<br><br><br><br>
<br><br>
<br>

<center>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="./registr"><button><h3 style="color:black">REGISTER A BOOK</h3></button></a>
<div><a href="./logout2"><button><h3>LOGOUT</h3></button></a></div>
</center>
</body>
</html>