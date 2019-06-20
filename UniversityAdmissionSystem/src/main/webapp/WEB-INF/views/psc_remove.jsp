<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" type="image/png" href="logo.png" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remove Program Schedule</title>
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
	left:2px;
	background:url(./resources/images/university.jpg);
	background-size:cover;
	border-radius:40px;
}
.back
{
	position:absolute;
	top:190px;
	left:495px;
}
</style>
</head>
<body>
<div class="body"></div>
<%HttpSession session = request.getSession(false);
if(session==null)
{
	response.sendRedirect("./loginmvc");
}
%>
<form action="./programschedeletemvclog" method="post">
<div class="offer">
<fieldset style="width:10%">
<legend align="center"><b><i>Delete_Programs_Scheduled</i></b></legend>
<table border="2" bgcolor="#99F">
<tr><td>Scheduled Program Id</td><td><input type="number" name="progId" required min="1" max="100" /></td></tr>
<tr><td><input type="submit" value="Delete Schedule"></td></tr>
</table>
</fieldset>
</div>
</form>

</body>
</html>