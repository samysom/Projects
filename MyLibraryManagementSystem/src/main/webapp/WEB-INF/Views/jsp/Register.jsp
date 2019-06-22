<%@page import="com.library.project.dto.BookInventoryJPA"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% BookInventoryJPA li= (BookInventoryJPA)request.getAttribute("book"); %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BOOKS INVENTORY</title>
<link rel="stylesheet" href="./resources/css/Registration.css">
<style>
body
{
	background-image: url("./resources/images/Registration.jpg");
	background-size: cover;
	color: darkorange;
}
 table,tr,th,td {
        border: 1px solid darkorange;
         border-collapse: collapse
    }
</style>

</head>
<body>
<h2 style="float:right;">Book Is Available In The Inventory</h2>
<br><br><br><br>
<table style="float:right;">
	<thead>
        <tr>
        <th><h3 style='color:darkorange'> BookId</h3></th>
        <th><h3 style='color:darkorange'> Book Name</h3></th>
        <th><h3 style='color:darkorange'> Author1</h3></th>
        <th><h3 style='color:darkorange'> Author2</h3></th>
        <th><h3 style='color:darkorange'> Publisher</h3></th>
        <th><h3 style='color:darkorange'> Year Of Publication</h3></th>   
        </tr></thead>
        <tbody>
        
        <tr>
        	<td><%=li.getBookId() %></td>
            <td><%=li.getBookName() %></td> 
            <td><%=li.getAuthor1() %></td>  
            <td><%=li.getAuthor2() %></td>  
            <td><%=li.getPublisher() %></td>  
            <td><%=li.getYearOfPublication() %></td>   
        </tr></tbody>
  
</table>
<center><br>
<div class="box">
<form action="./registr1"method="post">
<h2 style="color:darkorange">Book Name:<input type="text" name="book_name" required><br><br>
<button id="b"><h4 style="color:darkorange">SEARCH</h4></button>
</h2>
</form>
<a href="./after33"><button><h3 style="color:darkorange">REQUEST FOR BOOK</h3></button></a>
</div>
</center>
</body>
</html>