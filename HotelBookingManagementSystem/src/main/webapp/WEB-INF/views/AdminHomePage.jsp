<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
<style type="text/css">
body
{
    background-image: url('./resources/images/AdminHome.jpeg');
   background-repeat: no-repeat;
    background-size: cover;
}
.button1 {
 padding: 15px 25px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: white;
  background-color: grey;
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
  background-color: grey;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}
.button1 {
 padding: 10px 15px;
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
.button2 {
 padding: 10px 15px;
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
.button3 {
 padding: 10px 15px;
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
.button4 {
 padding: 10px 15px;
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
.button5 {
 padding: 10px 15px;
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
.button6 {
 padding: 10px 15px;
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
color: grey;

}
</style>
</head>
<body>


<center>
<h1>Welcome to Admin Homepage</h1>
<form action="./addhotelmvc" >
<button class="button1" >Add Hotel</button>
</form><br>
<form action="./modifyhotelmvc">
<button class="button2">Modify Hotel</button>
</form><br>
<form action="./deletehotelmvc">
<button class="button3">Delete Hotel</button>
</form><br>
<form action="./addroommvc">
<button class="button4">Add Room</button>
</form><br>
<form action="./modifyroommvc">
<button class="button5">Modify Room</button>
</form><br>
<form action="./deleteroommvc">
<button class="button6">Delete Room</button>
</form>
</center>
</body>
</html>