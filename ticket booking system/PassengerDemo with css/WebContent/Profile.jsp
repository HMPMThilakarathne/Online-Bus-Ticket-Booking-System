<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
	background-image: url("C:/Users/Manujini/Desktop/back.jpg");

}
.profile-box{
	width: 450px;
    height: 420px;
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
.font{
	colour:#fff;
	font-size:19px;
}

</style>
<title>Profile</title>
</head>
<body>
	
	<div class="profile-box">
	<center>
	
	<h1>My Profile</h1>
	<table>

	
	<tr>
		<td>Bus ID</td><br>
		<td>${busDetails.busID}</td>
	</tr>
	
	<tr>
		<td>Owner Name</td>
		<td>${busDetails.ownerName}</td>
	</tr>
	
	<tr>
		<td>Owner Contact Number</td>
		<td>${busDetails.contactNo}</td>
	</tr>
	
	<tr>
		<td>Owner Email</td>
		<td>${busDetails.ownerEmail}</td>
	</tr>
	 
	<tr>
		<td>Bus Number</td>
		<td>${busDetails.busNo}</td>
	</tr>
	
	<tr>
		<td>Bus Type</td>
		<td>${busDetails.BType}</td>
	</tr>
	
	<tr>
		<td>No Of Seats</td>
		<td>${busDetails.noOfSeats}</td>
	</tr>
	
	<tr>
		<td>Password</td>
		<td>${busDetails.password}</td>
	</tr>
	
	</table> 

	<br>
	
	<a href="<%=request.getContextPath()%>/UpdateBus" class="font">Update Data</a>
	
	
	<br><br>
	
		<a href="<%=request.getContextPath()%>/DeleteBus?busid=${busDetails.busID}" class="font">Delete Data</a>
	
	</center>
	</div>
</body>
</html>