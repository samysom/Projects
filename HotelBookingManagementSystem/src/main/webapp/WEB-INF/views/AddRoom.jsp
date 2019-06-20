<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Room</title>
<style type="text/css">
body
{
    background-image: url('./resources/images/Room.jpeg');

    background-size: cover;
}

.button {
 padding: 5px 15px;
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
color: white;

}



</style>
</head>
<body>


<center>
<h1> WELCOME TO ADD ROOM PAGE</h1>
<form action="./addroom" method="post">
<table border="2" cellspacing="4" bgcolor="lightblue">
<tr><td>Hotel Id</td><td><input type="text" name="hotelid" required placeholder="Enter Hotel Id"></td></tr>
<tr><td>Room Id</td><td><input type="text" name="roomid" required placeholder="Enter Room ID"></td></tr>
<tr><td>Room No</td><td><input type="number" name="roomno" required placeholder="Enter Room No"></td></tr>
<tr><td>Room Type</td><td><input type="text" name="roomtype" required placeholder="Enter Room Type"></td></tr>
<tr><td>PerNightRate</td><td><input type="number" name="pernightrate" required placeholder="Enter PerNightRate"></td></tr>
<tr><td>Availability</td><td><input type="text" name="availability" required placeholder="Enter Availability"></td></tr>

<tr><td><input type="submit" value="Add Room" class="button" ></td></tr>
</form>
</center>
</body>

</html>