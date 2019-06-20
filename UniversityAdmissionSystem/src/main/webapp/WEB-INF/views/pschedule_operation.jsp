<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" type="image/png" href="logo.png" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Program Schedule</title>
<style>
.add
{
	position:absolute;
	left:350px;
	top:150px;
}
.update
{
	position:absolute;
	left:750px;
	top:150px;
}
.delete
{
	position:absolute;
	left:550px;
	top:300px;
}
.body
{
	height:650px;
	width:1355px;
	position:absolute;
	top:0px;
	border:solid;
	left:0px;
	background:url(./resources/images/book.jpg);
	background-size:cover;
	border-radius:40px;
}
.back
{
	position:absolute;
	top:590px;
	left:485px;
}
</style>
</head>
<body><%HttpSession session = request.getSession(false);
if(session==null)
{
	response.sendRedirect("./loginmvc");
}
%>
<div class="body"></div>
<a href="./programscheaddmvc"><div class="add"><input type="button" value="Add a Schedule" name="poffer" style="height:80px; width:200px; background-color:#FC3; border-radius:10px; font-size:24px" /></div></a>
<form action="./progschdlist" method="post">
</form>
<a href="./programscheupdatemvc"><div class="update"><input type="button" value="Update Schedule" name="poffer" style="height:80px; width:200px; background-color:#FC3; border-radius:10px; font-size:24px" /></div></a>
<a href="./programschedeletemvc"><div class="delete"><input type="button" value="Remove Schedule" name="poffer" style="height:80px; width:225px; background-color:#FC3; border-radius:10px; font-size:24px" /></div></a>

</body>
</html>