<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Hotel</title>
<style type="text/css">
body
{
    background-image: url('./resources/images/BookHotel.jpeg');
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
  background-color: black;
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
<h1> WELCOME TO BOOKHOTEL PAGE</h1>
<form action="./bookhotel" method="post">
<table border="2" cellspacing="4" bgcolor="lightblue">

<tr><td>Booking Id</td><td><input type="text" name="bookingid" required placeholder="Enter Booking Id"></td></tr>
<tr><td>Room Id</td><td><input type="text" name="roomid" required placeholder="Enter Room Id"></td></tr>
<tr><td>User Id</td><td><input type="text" name="userid" required placeholder="Enter User Id"></td></tr>
<tr><td>Booked From</td><td><input type="text" name="bookedfrom" required placeholder="Enter Booked From"></td></tr>
<tr><td>Booked To</td><td><input type="text" name="bookedto" required placeholder="Enter Booked To"></td></tr>
<tr><td>No Of Adults</td><td><input type="number" name="noofadults" required placeholder="Enter No Of Adults"></td></tr>
<tr><td>No Of Children</td><td><input type="number" name="noofchildren" required placeholder="Enter No Of Children"></td></tr>
<tr><td>Amount</td><td><input type="text" name="amount" required placeholder="Enter Amount"></td></tr>

<tr><td><input type="submit" value="Book Hotel" class="button1" ></td></tr>



</form>

</center>
</body>
</html>