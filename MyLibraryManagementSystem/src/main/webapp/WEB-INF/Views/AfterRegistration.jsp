 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/AfterRegistration.css">
<style>
body
{
	background-image: url("./resources/images/AfterRegistration.jpg");
	background-size: cover;
	color: darkorange;
}
</style>
</head>
<body>
<center><h1><b><i>BOOK REGISTRATION</i></b></h1></center>
<div class="box"><form action="./afterregn" method="post">
<h2>
Registration Id:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="registration_id" required><br><br>
Book Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="book_id" required><br><br>
User Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="user_id" required><br><br>
Registration date:<input type="text" name="registrationdate" placeholder="YYYY-MM-DD" required><br><br>
<button><b><h3>PLACE</h3></b></button></h2>

</form></div>
</body>
</html>