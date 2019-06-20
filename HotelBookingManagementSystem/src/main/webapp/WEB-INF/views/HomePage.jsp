<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME PAGE</title>
<style type="text/css">
body
{
    background-image: url('./resources/images/Home.jpg');
   background-repeat: no-repeat;
    background-size: cover;
}

h1
{
color: white;
}


div
{
text-align: center;
}
.button1 {
padding: 15px 25px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: white;
  background-color:black;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
  
}
.button2 {
padding: 15px 25px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: white;
  background-color:black;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
  
}

</style>

</head>
<body>
<div >


<center><h1>WELCOME TO HOME PAGE</h1></center><br>
<form action="./registermvc">
<button class="button1">Register</button>
</form><br>
<form action="./loginmvc">
<button class="button2">Login</button>
</form>
</div>
</body>
</html>