<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% boolean li=(boolean) request.getAttribute("b"); %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/Start.css">
<style>
body{
	
	background-image: url("./resources/images/login.jpg");
   background-size: cover;   
}

.abc{
position:absolute;
top:200px;
right:500px;

}
</style>
</head>
<body>

<center>

<h1 ><i>LIBRARY MANAGEMENT SYSTEM</i></h1>

<br>
<br>
<div class="abc">
<h1 style="color:white">${Success}</h1></div>
<a href="./lo1">
<button class="a"><h3>LOGIN</h3></button></a>
<center><a href="./create3"><button style="background-color: transparent ;border-radius: 15px; "><h3 style="color:white">CREATE USER</h3></button></a></center>
</center>

</body>
</html>
