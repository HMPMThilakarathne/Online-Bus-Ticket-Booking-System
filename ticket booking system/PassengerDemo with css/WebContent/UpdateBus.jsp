<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1">
<style>
body{
	background-image: url("C:/Users/Manujini/Desktop/back.jpg");

}
.form{
	width: 250px;
	height:20px;
}
.submit{
	width: 170px;
	height:30px;
}
.update-box{
	width: 400px;
    height: 720px;
    background: rgba(0, 0, 0, 0.5);
    color: #fff;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 50px 30px;
	border-radius: 5px;
}
</style>

<title>Insert title here</title>
</head>
<body>
 
	
	<div class="update-box">
	<center>
	<h1>Update the Account</h1><br>
	<form action="UpdateBus" method="post">
		Bus ID<br><input type="text" class="form" name="busid" value="${busDetails.busID }"readonly><br><br>
		Owner Name<br><input type="text" class="form" name="name" value="${busDetails.ownerName }"><br><br>
		Owner Contact Number<br><input type="text" class="form" name="contact" value="${busDetails.contactNo }"><br><br>
		Owner Email<br><input type="text" class="form" name="email" value="${busDetails.ownerEmail }"><br><br>
		Bus Number<br><input type="text" class="form" name="BNo" value="${busDetails.busNo }"><br><br>
		Bus Type<br><input type="text" class="form" name="BType" value="${busDetails.BType }"><br><br>
		No Of Seats<br><input type="text" class="form" name="seats" value="${busDetails.noOfSeats }"><br><br>
		Passwords<br><input type="password" class="form" name="password" value="${busDetails.password }"><br><br><br>
		<input type="submit" class="submit" name="submit" value="Update Data">
		
		
	</form>
	</center>
	
	</div> 
</body>
</html> 