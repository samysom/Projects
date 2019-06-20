<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
<style type="text/css">
body {
	background: url(./images/UserListPage.jpg);
	background-size: cover;
	font-family: sans-serif;
}
</style>
</head>
<body>
	<c:forEach items="${lists}" var="element">
		<table border="1" bgcolor="#FFFFFF" align="center">
			<tr>
				<th>UserName</th>
				<th>Mobile_No</th>
				<th>Role</th>
			</tr>
			<tr>
				<td><c:out value="${element.userName}" /></td>
				<td><c:out value="${element.mobileNo}" /></td>
				<td><c:out value="${element.role}" /></td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>