<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home</title>

<link rel="stylesheet" type="text/css" href="./css/AdminHomePage.css">

<style>
.button {
	background-color: #1c8adb;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 10px;
	position: fixed;
	bottom: 0;
	right: 0;
}
</style>

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
<h1>WELCOME</h1>
<a href="./logout" class="button">LOGOUT</a>
<div class="airport">
<h3>MODIFY ACCOUNT:</h3><br>
	<a href="./updatem"> <button>MODIFY DETAILS</button></a>
	<a href="./deletem"> <button>DELETE ACCOUNT</button></a>
	<a href="./forgotpasswordm"> <button>CHANGE PASSWORD</button></a>
	<a href="./logout"> <button>LOGOUT</button></a><br>
</div>
<div class="flight">
<h3>FLIGHT:</h3><br>
<a href="./searchflightm"> <button>SEARCH FLIGHT</button></a><br>
</div>
<div class="list">
<h3>BOOKING:</h3><br>
<a href="./bookingm"> <button>BOOK FLIGHT</button></a>
<a href="./cancelbookingm"> <button>BOOKING CANCEL</button></a><br>
<a href="./updatebookingm"> <button>MODIFY BOOKING</button></a><br>
</div>
</body>
</html>