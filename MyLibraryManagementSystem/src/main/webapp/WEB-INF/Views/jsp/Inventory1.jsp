<%@page import="com.library.project.dto.BookInventoryJPA"%>
<%@page import="com.library.project.dto.BookInventory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% ArrayList<BookInventoryJPA> list = new ArrayList<BookInventoryJPA>();
list = (ArrayList<BookInventoryJPA>) request.getAttribute("list"); %>
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
 table,tr,th,td {
        border: 1px solid white;
         border-collapse: collapse
    }
</style>

</head>
<body>

<h3>Book Details :</h3>
<table>
	<thead>
        <tr>
        <th><h3 style='color:white'>BookId</h3></th>
        <th><h3 style='color:white'> Book Name</h3></th>
        <th><h3 style='color:white'> Author1</h3></th>
        <th><h3 style='color:white'> Author2</h3></th>
        <th><h3 style='color:white'> Publisher</h3></th>
        <th><h3 style='color:white'> Year Of Publication</h3></th>   
        </tr></thead>
        <tbody>
         <% 
      
         for(int i = 0; i < list.size(); i++) {
        	 BookInventoryJPA books=new BookInventoryJPA();
                books = list.get(i);%>
        <tr>
        	<td><%=books.getBookId()%></td>
            <td><%=books.getBookName() %></td> 
            <td><%=books.getAuthor1() %></td>  
            <td><%=books.getAuthor2() %></td>  
            <td><%=books.getPublisher() %></td>  
            <td><%=books.getYearOfPublication() %></td>   
        </tr></tbody>
   <% }%> 
</table>
<center><br>
<a href="./addll2"><button><h3 style="color:white">ADD BOOK</h3></button></a>
<a href="./update11"><button><h3 style="color:white">UPDATE BOOK DETAILS</h3></button></a>
<a href="./delete11"><button><h3 style="color:white">DELETE BOOK</h3></button></a>
<div><a href="./home5"><button><h3 style="color:white">HOME</h3></button></a></div>
</center>
</body>
</html>