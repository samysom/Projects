<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/Login1.css">
<style>
body
{
	background-image: url("./resources/images/Login1.jpg");
	background-size:  cover;
}

</style>
</head>
<body>
<div class="box">
<form action="./log34" method="post">
<center><h3>
User Id:<input type="text" name="user_id" required><br><br>
Password:<input type="password" name="password" required><br><br>
Select Role: <br>Librarian:<input type="radio" value="Librarian"name="role"><br>
Student:<input type="radio" value="Student" name="role"><br><br>
<input type="submit" value="LOGIN"></h3>


</center>
</form>

</div>
 </body>
</html>