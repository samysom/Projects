<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<style type="text/css">
body
{
    background-image: url('./resources/images/Register.jpg');
    background-repeat: no-repeat;
    background-size: cover;
}
h1
{
color: black;

}
.button {
  padding: 15px 25px;
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
	<center>
		<h1>WELCOME TO REGISTER PAGE</h1>
		<form action="./register" method="post">
		    <table border="2" cellspacing="4" bgcolor="lightblue">
			<tr><td>User Id</td><td><input type="text" name="userid" required></td></tr>
			<tr><td>Password</td><td><input type="password" name="password" required></td></tr> 
			<tr><td>Role</td><td><input type="text" name="role" required></td></tr> 
			<tr><td>User Name</td><td><input type="text" name="username" required></td></tr> 
			<tr><td>Mobile No</td><td><input type="text" name="mobileno" required></td></tr>
			<tr><td>Phone</td><td><input type="text" name="phone" required></td></tr> 
			<tr><td>Address</td><td><input type="text" name="address" required></td></tr>
			<tr><td>Email</td><td><input type="email" name="email" required></td></tr>
			<tr><td><input type="submit" value="register" class="button"></td></tr>
			</table>
		</form>
	
	</center>
</body>


</html>