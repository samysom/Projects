<%@page import="com.library.project.dto.BookRegistration"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% ArrayList<BookRegistration> list = new ArrayList<BookRegistration>();
list = (ArrayList<BookRegistration>) request.getAttribute("list"); %>
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
 table,tr,th,td {
        border: 1px solid white;
         border-collapse: collapse
    }
</style>
</head>
<body><h3>Book Registration Details :</h3>
<table>
	<thead>
        <tr>
        <th><h3 style='color:white'>Registration Id</h3></th>
        <th><h3 style='color:white'> Book Id</h3></th>
        <th><h3 style='color:white'> User Id</h3></th>
        <th><h3 style='color:white'> Registration Date</h3></th>
          
        </tr></thead>
        <tbody>
         <% 
      
         for(int i = 0; i < list.size(); i++) {
        	 BookRegistration books=new BookRegistration();
                books = list.get(i);%>
        <tr>
        	<td><%=books.getRegistrationId() %></td>
            <td><%=books.getBookId() %></td> 
            <td><%=books.getUserId() %></td>  
            <td><%=books.getRegistrationDate() %></td>  
        
        </tr></tbody>
   <% }%> 
</table>
<br>

<center>
	<a href="./issue1"><button><h3 Style="color:white">ISSUE TRANSACTION</h3></button></a>
	<a href="./return1"><button><h3 Style="color:white">RETURN TRANSACTION</h3></button></a>
	<div><a href="./libra2"><button><h3 Style="color:white">HOME</h3></button></a></div>
	</center>
</body>
</html>