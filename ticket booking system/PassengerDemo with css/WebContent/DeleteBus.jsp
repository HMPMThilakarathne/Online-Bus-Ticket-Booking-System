<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
	background-image: url("C:/Users/Manujini/Desktop/back.jpg");

}
.box6{
	width: 250px;
	height:20px;
}
.box7{
	width: 170px;
	height:30px;
	font-size:19px;
}
.delete-box{
	width: 450px;
    height: 650px;
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
<div class="delete-box">

	<% 
		String ID = request.getParameter("id");
		String ownerName= request.getParameter("name");
		String ownerContact = request.getParameter("contact");
		String ownerEmail = request.getParameter("email");
		String busNo= request.getParameter("BNo");
		String busType = request.getParameter("BType");
		String seats = request.getParameter("Seats");
		String Password = request.getParameter("password");
	
	%>
	
	<center>
	
	<h1>Bus Account Delete</h1><br>
	<form action="BusDetails" method="post">
		Bus ID<br><input type="text" class="box6" name="busid" value="${busDetails.busID }"readonly><br><br>
		Owner Name<br><input type="text" class="box6" name="name" value="${busDetails.ownerName }"readonly><br><br>
		Owner Contact Number<br><input type="text" class="box6" name="contact" value="${busDetails.contactNo }"readonly><br><br>
		Owner Email<br><input type="text" class="box6" name="email" value="${busDetails.ownerEmail }"readonly><br><br>
		Bus Number<br><input type="text" class="box6" name="BNo" value="${busDetails.busNo }"readonly><br><br>
		Bus Type<br><input type="text" class="box6" name="BType" value="${busDetails.BType }"readonly><br><br>
		No Of Seats<br><input type="text" class="box6" name="seats" value="${busDetails.noOfSeats }"readonly><br><br><br>
	
		<input type="submit" class="box7" name="submit" value="Delete my Data">
		
		
	</form>
	</center>
	</div> 

</body>
</html>