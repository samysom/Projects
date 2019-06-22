<%@page import="com.library.project.dto.BookTransactionJPA"%>
<%@page import="com.library.project.dto.BookRegistrationJPA"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% BookTransactionJPA j= (BookTransactionJPA)request.getAttribute("obj");%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BOOKS TRANSACTION</title>
<link rel="stylesheet" href="./resources/css/Transaction.css">
<style>
body{
	
	background-image: url("./resources/images/Transation.jpeg");
   background-size: cover;  
   color:white; 
}

.abc{
position:absolute;
top:200px;
left:600px;

}
 
</style>
</head>
<body>
<div class="abc">
<h2 style="color:white"> Fine is: ${Success}</h2></div>
<br>
<br>
<br>
<center>
<a href="./issuetransaction"><button><h3 Style="color:white">ISSUE TRANSACTION</h3></button></a>
<a href="./returntransaction"><button><h3 Style="color:white">RETURN TRANSACTION</h3></button></a>
<div><a href="./home5"><button><h3 Style="color:white">HOME</h3></button></a></div>
</center>

</body>
</html>