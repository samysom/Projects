<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Room</title>
<style type="text/css">
body
{
    background-image: url('./resources/images/Room.jpeg');

    background-size: cover;
}

.button {
 padding: 5px 15px;
  font-size: 20px;
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
color: white;

}



</style>
</head>
<body>



<CENTER>
<h1>WELCOME TO DELETE ROOM PAGE</h1>
<form action="./deleteroom" method="post">
<table border="2" cellspacing="4" bgcolor="lightblue">

<tr><td>Room Id</td><td><input type="text" name="roomid" required placeholder="Enter Room Id"><br>
<tr><td><input type="submit" value="Delete Room" class="button" ></td></tr>

</form>



</CENTER>
</body>

</html>