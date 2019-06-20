<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@page import="com.asset.jpa.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
<link rel="stylesheet" type="text/css" href="./resources/CSS/page.css">
</head>
<body>

	 <%
		HttpSession session = request.getSession(false);
		if(session == null){
			response.sendRedirect("./loginpage.jsp");
		}
	%> 

	<div>
		<img src="./resources/image/banner1.jpg" style="border-radius: 10px;" width="1340"
			height="350">
	</div>

	<div class="container">


		<div class="dropdown">
			<a href="./raiserequestpage" class="dropbtn"> Raise Request </a>
		</div>

		<div class="dropdown">

				<form action="./statusrequestlog" method="post">
				<input type="submit" value="Status of Request"></form>
		</div>
		
		<div class="dropdown" align="right">
			<a href="./logoutmvc" class="dropbtn"> Logout </a>
		</div>



	</div>

	<h1 align="center"> User(Manager) Page</h1>

	<div class="footer">
		<b class="foottext">&copy; copyright
			AssertManagementSystem/The Achievers</b>
	</div>

</body>
</html>