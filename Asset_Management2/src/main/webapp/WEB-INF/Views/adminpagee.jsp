<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@page import="com.asset.jpa.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<link rel="stylesheet" type="text/css" href="./resources/CSS/page.css">


</head>
<body>
	<%
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("./loginpage.jsp");
		}
	%>
	<div>
		<img src="./resources/image/banner1.jpg" style="border-radius: 10px;" width="1340"
			height="350">
	</div>

	<div class="container">

		<div class="dropdown">
			<button class="dropbtn">Inventory</button>
			<div class="dropdown-content">
				<a href="./addassetpage">Add Asset</a>
				<a href="./updateassetpage">Update Asset</a>
				<a href="./deleteassetpage">Delete Asset</a>
			</div>
		</div>
		
		<div class="dropdown">
			<button class="dropbtn">User</button>
			<div class="dropdown-content">
				<a href="./adduserpage">Add user</a>
				<a href="./updateuserpage">Update user</a> 
				<a href="./deleteuserpage">Delete user</a> 
				
			</div>
		</div>
		
		
		
		
		<div class="dropdown">

				<form action="./viewrequestpagee" method="post">
				<input type="submit" value="View Request"></form>
		</div>
		

		<div class="dropdown">
			<button class="dropbtn">List of Assets</button>
			<div class="dropdown-content">
			
				<form action="./viewallocatedassetpagee" method="post">
				<input type="submit" value="Allocated Asset">
				</form>
				
				
				<form action="./viewunallocatedasset" method="post">
				<input type="submit" value="Unallocated Asset">
				</form>
			</div>
		</div>
		
		
		
		<div class="dropdown">
			<button class="dropbtn">Employee</button>
			<div class="dropdown-content">
				<a href="./addemppage">Add Employee</a> 
				<a href="./updateemppage">Update Employee</a>
				<a href="./deleteemppage">Delete Employee</a> 
				
			</div>
		</div>
		
		
		<div class="dropdown" align="right">
			<a href="./logoutmvc" class="dropbtn"> Logout </a>
		</div>
	</div>


	<h1 align="center">Admin Page</h1>

	<div class="footer">
		<b class="foottext">&copy; copyright
			AssetManagementSystem/The Achievers</b>
	</div>

</body>
</html>