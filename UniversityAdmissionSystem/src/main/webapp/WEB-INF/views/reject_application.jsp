	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ page session="false"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" type="image/png" href="logo.png" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reject Candidate</title>
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
	background:url(./resources/images/university.jpg);
	background-size:cover;
	border-radius:40px;
}
.back
{
	position:absolute;
	top:150px;
	left:25px;
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
<form action="./applicationrejectmvclog" method="post">
<div class="reg">
<fieldset style="width:10%">
<legend align="center"><b><i>Reject_Application_Form</i></b></legend>
<table border="2" cellpadding="5" cellspacing="5" bgcolor="#FF9">
<tr><td>Applicaton Id</td><td><input type="number" name="appid" required min="1" max="500" /></td></tr>
<tr><td><input type="submit" value="Reject Application" /></td></tr>
</table>
</fieldset>
</div>
</form>

</body>
</html>