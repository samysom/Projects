<%@page import="java.util.List"%>
<%@page import="com.airline.dto.UsersDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>

<link rel="stylesheet" type="text/css" href="./css/ListUser.css">

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

	<%
		List<UsersDTO> list = (List<UsersDTO>) session.getAttribute("list");
	%>
<div class="ftable">
	<h1>User Details</h1>
	<table>
		<tr>
			<th>UserName</th>
			<th>Mobile_No</th>
			<th>Role</th>
		</tr>

		<%
			for(UsersDTO us:list)
			{
				out.println("<tr><td>"+us.getUserName()+"</td><td>"+us.getMobileNo()+"</td><td>"+us.getRole()+"</td></tr>");
			}
		%>
	</table>
</div>
</body>
</html>