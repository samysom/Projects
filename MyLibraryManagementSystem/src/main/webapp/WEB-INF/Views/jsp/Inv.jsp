<%@page import="com.library.project.dto.BookInventoryJPA"%>
<%@page import="com.library.project.dto.BookInventory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%-- <% boolean li=(boolean) request.getAttribute("b1"); %> --%>
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

.abc{
position:absolute;
top:200px;
right:600px;

}
 
</style>

</head>
<body>

<center>
<div class="abc">
<h1 style="color:white">${Success}</h1></div>
<br>
<a href="./addll2"><button><h3 style="color:white">ADD BOOK</h3></button></a>
<a href="./update11"><button><h3 style="color:white">UPDATE BOOK DETAILS</h3></button></a>
<a href="./delete11"><button><h3 style="color:white">DELETE BOOK</h3></button></a>
<div><a href="./home5"><button><h3 style="color:white">HOME</h3></button></a></div>
</center>
</body>
</html>