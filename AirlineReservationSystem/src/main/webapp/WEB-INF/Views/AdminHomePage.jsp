<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
body {
	background-image: url(./images/Home.jpg);
	background-size: cover;
	font-family: sans-serif;
}
</style>
</head>
<body>
	<h1>Administration Home Page</h1>
	<a href="./logout" class="button">LOGOUT</a>
	<div style="color: blue">${creationmessage}</div>
	<div class="airport">
		<h3>AIRPORT:</h3>
		<br> <a href="./addairportm">
			<button>ADD AIRPORT</button>
		</a> <a href="./deleteairportm">
			<button>DELETE AIRPORT</button>
		</a> <a href="./updateairportm">
			<button>UPDATE AIRPORT</button>
		</a> <a href="./searchairportm">
			<button>SERACH AIRPORT</button>
		</a><br>
	</div>
	<div class="flight">
		<h3>FLIGHT:</h3>
		<br> <a href="./addflightm">
			<button>ADD FLIGHT</button>
		</a> <a href="./deleteflightm">
			<button>DELETE FLIGHT</button>
		</a> <a href="./updateflightm">
			<button>UPDATE FLIGHT</button>
		</a> <a href="./searchflightm">
			<button>SEARCH FLIGHT</button>
		</a><br>
	</div>
	<div class="user">
		<h3>USER:</h3>
		<br> <a href="./deletem">
			<button>DELETE USER</button>
		</a> <a href="./searchuserm">
			<button>SEARCH USER</button>
		</a> <a href="./listbookm">
			<button>USERS BOOKING</button>
		</a><br>
	</div>
	<div class="list">
		<h3>LIST:</h3>
		<br> <a href="./listflights">
			<button>FLIGHT LIST</button>
		</a> <a href="./listusers">
			<button>USERS LIST</button>
		</a>
		</div>
		</form>
</body>
</html>