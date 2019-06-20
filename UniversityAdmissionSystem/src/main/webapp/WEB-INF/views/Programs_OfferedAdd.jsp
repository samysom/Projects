<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" type="image/png" href="logo.png" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Program</title>
<style>
.offer
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
	background:url(./resources/images/university.jpg);
	background-size:cover;
	border-radius:40px;
}
.back
{
	position:absolute;
	top:330px;
	left:485px;
}
</style>
</head>
<body>
<%HttpSession session = request.getSession(false);
if(session==null)
{
	response.sendRedirect("./loginmvc");
}
%>
<div class="body"></div>
<form action="./programofferedaddmvclog" method="post">
<div class="offer">
<fieldset style="width:10%">
<legend align="center"><b><i>Add Programs</i></b></legend>
<table border="2" bgcolor="#F99">
<tr><td>Program Name</td><td><input type="text" name="programname" required pattern="[A-Za-z. ]{2,29}" /></td></tr>
<tr><td>Description</td><td><input type="text" name="desc" required pattern="[A-Za-z ]{2,50}" /></td></tr>
<tr><td>Applicant Eligibility</td><td><input type="text" name="eligblity" required pattern="[A-Za-z0-9 , ]{2,30}" /></td></tr>
<tr><td>Duration(months)</td><td><input type="number" name="duration" required ></td></tr>
<tr><td>Degree Certificate Offered</td><td><input type="text" name="degcerti" required pattern="[A-Za-z ]{2,10}" /></td></tr>
<tr><td><input type="submit" value="Add Program" name="add" /></td></tr>
</table>
</fieldset>
</div>
</form>
<a href="./programoffermainmvc"><div class="back"><input type="button" value="Go Back To Previous Page" style="background-color:#39F; font-size:18px; height:40px; width:350px;border-radius:30px"></div></a>
</body>
</html>