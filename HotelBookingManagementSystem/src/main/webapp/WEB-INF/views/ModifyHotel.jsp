<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify Hotel</title>
<style type="text/css">
body
{
    background-image: url('./resources/images/Hotel.jpg');

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
<h1> WELCOME TO MODIFY HOTEL PAGE</h1>
<form action="./modifyhotel" method="post">

<table border="2" cellspacing="4" bgcolor="lightblue">
<tr><td>Hotel Id</td><td><input type="text" name="hotelid" required placeholder="Enter Hotel Id"></td></tr>
<tr><td>City</td><td><input type="text" name="city" required placeholder="Enter City"></td></tr>
<tr><td>Hotel Name</td><td><input type="text" name="hotelname" required placeholder="Enter Hotel Name"></td></tr>
<tr><td>Address</td><td><input type="text" name="address" required placeholder="Enter Address"></td></tr>
<tr><td>Description</td><td><input type="text" name="description" required placeholder="Enter Description"></td></tr>
<tr><td>Avg RatePerNight</td><td><input type="number" name="avgratepernight" required placeholder="Enter Avg RatePerNight"></td></tr>
<tr><td>PhoneNo1</td><td><input type="text" name="phoneno1" required placeholder="Enter PhoneNo1"></td></tr>
<tr><td>PhoneNo2</td><td><input type="text" name="phoneno2" required placeholder="Enter PhoneNo2"></td></tr>
<tr><td>Rating</td><td><input type="text" name="rating" required placeholder="Enter Rating"></td></tr>
<tr><td>Email</td><td><input type="email" name="email" required placeholder="Enter Email"></td></tr>
<tr><td>Fax</td><td><input type="text" name="fax" required placeholder="Enter Fax"></td></tr>

<tr><td><input type="submit" value="Modify Hotel" class="button"></td></tr>

</form>
</center>
</body>

</html>