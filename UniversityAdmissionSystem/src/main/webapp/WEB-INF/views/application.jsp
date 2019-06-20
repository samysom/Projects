<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.reg
{
	position:absolute;
	left:500px;
	top:50px;
}
.body
{
	height:650px;
	width:1355px;
	position:absolute;
	top:0px;
	border:solid;
	left:0px;
	background:url(university.jpg);
	background-size:cover;
	border-radius:40px;
}
</style>
</head>
<body>
<div class="body"></div>
<form action="./applicationaddmvclog" method="post">
<div class="reg">
<fieldset style="width:10%">
<legend align="center"><b><i>Application Form</i></b></legend>
<table border="2" cellpadding="5" cellspacing="5" bgcolor="#FFCC00">
<tr><td>Full Name</td><td><input type="text" name="fname" required pattern="[A-Za-z ]{2,19}" /></td></tr>
<tr><td>D.O.B</td><td><input type="date" name="dob" required /></td></tr>
<tr><td>Highest Qualification</td><td><input type="text" name="qualification" required pattern="[A-Za-z0-9. ]{2,19}" ></td></tr>
<tr><td>Marks Obtained</td><td><input type="number" name="marks" required min="1" max="100" /></td></tr>
<tr><td>Goals</td><td><input type="text" name="goals" required pattern="[A-Za-z ]{2,19}" /></td></tr>
<tr><td>Email</td><td><input type="email" name="email" required/></td></tr>
<tr><td>Scheduled Program Id</td><td><input type="number" name="scheduledId" required min="1" max="100"/></td></tr>
<tr><td>Date of Interview</td><td><input type="date" name="interviewDate" required /></td></tr>
<tr><td><input type="submit" value="Register" name="reg" /></td></tr>
</table>
</fieldset>
</div>
</form>

</body>
</html>