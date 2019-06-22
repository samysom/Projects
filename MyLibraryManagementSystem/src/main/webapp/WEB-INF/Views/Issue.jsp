<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./resources/css/Issue.css">
<style>
body
{
	background-image:  url("./resources/images/Issue.jpg");
	background-size: cover;
	color:darkorange;
}
</style>
</head>
<body>
<center>
<h1><i>ISSUE BOOK</i></h1>
</center>
<div class="box">
<form action="./issue" method="post">
<h3>Transaction Id:<input type="text" name="transaction_id" required><br><br>
Registration Id:<input type="text" name="registration_id" required><br><br>
Issue Date:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="issue_date" placeholder="YYYY-MM-DD"required><br><br>
Return Date:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="return_date" placeholder="14days after Issue"><br><br>
<input type="text" name="fine" value="0.0" style="display:none">
<button><h3 style="color:darkorange"><b>ISSUE</b></h3></button>
</h3>
</form></div>
</body>
</html>