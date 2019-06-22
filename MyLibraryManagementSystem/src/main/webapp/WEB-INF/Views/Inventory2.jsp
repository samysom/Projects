<%@page import="com.library.project.dto.BookInventory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BOOKS INVENTORY</title>
<link rel="stylesheet" href="./resources/css/Inventory.css">
<style>
body{
	
	background-image: url("./resources/images/Inventory.jpg");
   background-size: cover;  
   color:white; 
   
}

</style>

</head>
<body>

<center><br><br><br>
<a href="./add1"><button><h3 style="color:white">ADD BOOK</h3></button></a>
<a href="./up1"><button><h3 style="color:white">UPDATE BOOK DETAILS</h3></button></a>
<a href="./delete1"><button><h3 style="color:white">DELETE BOOK</h3></button></a>
<div><a href="./libra2"><button><h3 style="color:white">HOME</h3></button></a></div>
</center>
</body>
</html>