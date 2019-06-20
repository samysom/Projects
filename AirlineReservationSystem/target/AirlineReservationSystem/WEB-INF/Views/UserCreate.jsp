<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./user" method="post">
		User Name:<input type="text" name="userName"> <br>
		Password:<input type="password" name="password"> <br>
		Mobile Number:<input type="text" name="mobileNo"> <br>
		Role: <input type="radio"name="role" value="Executive">Executive
			  <input type="radio" name="role" value="User">User <br>
		<input type="submit" value="Sign Up">
	</form>
</body>
</html>