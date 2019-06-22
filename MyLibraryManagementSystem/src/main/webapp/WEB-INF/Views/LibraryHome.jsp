<%@page import="com.library.project.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/LibraryHome.css">
<style>

body{
	
	background-image: url("./resources/images/LibraryHome.jpg");
   background-size: cover;
   color:white;   
}
</style>
</head>
<body><% User us= (User)request.getAttribute("user"); %>
<center><h1>Welcome <%=us.getUserName() %> !</h1>
<h2>User Id: <%=us.getUserId() %><br>
Role: <%=us.getRole() %><br>
Email Id: <%=us.getEmail() %></h2></center>
<br><br>
<br><center>
<a href="./listall"><button><h3>BOOK INVENTORY</h3></button></a>
<a href="./tran"><button><h3>BOOK TRANSACTION</h3></button></a>
<div><a href="./logout"><button><h3>LOGOUT</h3></button></a></div></center>
</body>
</html>