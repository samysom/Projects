<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" type="image/png" href="logo.png" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Program Schedule</title>
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
	left:495px;
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
<form action="./programscheupdatemvclog" method="post">
<div class="offer">
<fieldset style="width:10%">
<legend align="center"><b><i>Update_Programs_Scheduled</i></b></legend>
<table border="2" bgcolor="#9CC">
<tr><td>Scheduled Program Id</td><td><input type="number" name="progId" required min="1" max="100" /></td></tr>
<tr><td>Program Nmae</td><td><input type="text" name="programname" required pattern="[A-Za-z. ]{2,29}" /></td></tr>
<tr><td>Location</td><td><input type="text" name="location" required pattern="[A-Za-z ]{2,10}"></td></tr>
<tr><td>Start Date</td><td><input type="date" name="startdate" required /></td></tr>
<tr><td>End Date</td><td><input type="date" name="enddate" required /></td></tr>

<tr><td>Session Per Week</td><td><input type="number" name="session" required min="1" max="10"/></td></tr>
<tr><td><input type="submit" value="Update Schedule"></td></tr>
</table>
</fieldset>
</div>
</form>

</body>
</html>