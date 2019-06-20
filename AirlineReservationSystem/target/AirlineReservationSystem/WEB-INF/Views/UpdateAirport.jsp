<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./updateairport" method="post">
<h1>Update Airport-</h1>
<h3>Enter Old Abbreviation</h3> <br>
Abbreviation:<input type="text" name="abbreviation"><br><br>
<h3>Update Data-</h3><br>
Location:<input type="text" name="location"><br><br>
City:<input type="text" name="city"><br><br>
Zipcode:<input type="number" name="zipCode"><br><br>
<input type="submit" value="Update Airport">
</form>

</body>
</html>