<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style type="text/css">
body
{
    background-image: url('./resources/images/Login.jpg');
   background-repeat: no-repeat;
    background-size: cover;
}
.button {
  padding: 5px 15px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: black;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}
</style>
</head>
<body>
<CENTER>
<H1>WELCOME TO LOGIN PAGE</H1>
<form action="./login" method="post">
<table border="2" cellspacing="4" bgcolor="lightblue">
<tr><td>User Name</td><td><input type="text" name="username" required></td></tr>
<tr><td>Password</td><td><input type="password" name="password" required></td></tr>
<tr><td>Role</td><td><select name="role" size="1" required>
<option value="user">User</option>
<option value="employee">Employee</option>
<option value="admin">Admin</option>
</select></td></tr>

<tr><td><input type="submit" value="login" class="button"></td></tr>

</form>

</body>
</html>