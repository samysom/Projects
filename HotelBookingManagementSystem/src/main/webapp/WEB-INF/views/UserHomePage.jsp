<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home Page</title>
<style type="text/css">
body
{
    background-image: url('./resources/images/Home2.jpeg');
   background-repeat: no-repeat;
    background-size: cover;
}

.button {
 padding: 15px 25px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: white;
  background-color: black;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}
h1
{
color: black;
}

</style>
</head>
<body>



<center>
<h1>Welcome to User Homepage</h1>
<form action="./listhotelmvc" method="post" >
<button class="button">List of Hotels</button>
</form>



</form>
</center>

</body>
</html>