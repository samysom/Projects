<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/Delete.css">
<style>

body
{
	background-image: url("./resources/images/Delete.jpg");
	background-size: cover;
	color:white;
}
</style>
</head>
<body>
<h1><i>DELETE BOOKS</i></h1>
<form action="./delete12" method="post">
<div class="box">
<center>
<h2>
Book Id: <input type="text" name="book_id" required><br><br>
<button><b>DELETE BOOK</b></button>
</h2>
</center>
</div>

</form>
</body>
</html>