<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/Update.css">
<style >
body{
	
	background-image: url("./resources/images/Update.jpg");
   background-size: cover; 
   color:orange;  
}
</style>
</head>
<body>

<form action="./update12"method="post"><div class="box">
<h2 style="color:darkorange">Book Id:<input type="text" name="book_id" required><br><br>
New Book Name:<input type="text" name="book_name" required><br><br>
<button id="b"><b><h3 style="color:darkorange">UPDATE BOOK</h3></b></button>
</h2></div>
</form>

</body>
</html>