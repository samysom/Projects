<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/CreateUser.css">
<style>
body
{
	background-image: url("./resources/images/Create User.jpg");
	background-size: cover;
}
</style>
</head>
<body>
<div class="box">
<form action="./create" method="post">
<center><h2>
User Id:<input type="text" name="user_id" required><br><br>
User Name:<input type="text" name="user_name" required><br><br>
Password:<input type="text" name="password" required><br><br>
Email Id:<input type="email" name="email" required><br><br>
Role:   Librarian:<input type="radio" value="Librarian" name="role">
Student:<input type="radio" value="Student" name="role" ><br>
<button><b>CREATE</b></button></h2>
</center>
</form>
</div>
</body>
</html>