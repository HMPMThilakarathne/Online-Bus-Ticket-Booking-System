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
.table{
	border:5px solid black;
}
.box1{
	width: 250px;
	height:20px;
}
.font{
	font-size:18px;
}
.box{
	width: 100px;
	height:30px;
	font-size:19px;
}
.regis-box{
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
<title>Register</title> 
<script>
function validate(){
	
	var fullname = document.form.fullname.value;
	var email = document.form.email.value;
	var phone = document.form.phone.value;
	var username = document.form.username.value;
	var password = document.form.password.value
	var confirm = document.form.confirm.value;
	
	if(fullname==null || fullname==""){
		alert("Full Name can't be blank");
		return false;
	}
	else if(email==null || email==""){
		alert("Email can't be blank");
		return false;
	}
	else if(phone==null || phone==""){
		alert("Phone Number can't be blank");
		return false;
	}
	else if(username==null || username==""){
		alert("Username can't be blank");
		return false;
	}
	else if(password==null || password==""){
		alert("Password can't be blank");
		return false;
	} 
	else if(password!=confirm){
		alert("Confirm Password should match with your Password");
		return false;
	}
}
</script>
</head>
<body>

	<div class="regis-box">
	<center>
	<h1>Register here</h1>
	<form class="font" action="Register" method="post">
		Fullname <br><input type="text" class="box1" name="fullname" placeholder="Enter Fullname" required><br><br>
		Email <br><input type="text" class="box1" name="email" placeholder="Enter Email" required><br><br>
		Phone Number <br><input type="text" class="box1" name="phone" placeholder="Enter Contact Number" required><br><br>
		User Name <br><input type="text" class="box1" name="username" placeholder="Enter Username" required><br><br>
		Password <br> <input type="password" class="box1" name="password" placeholder="Enter Bus Password" required><br><br>
		Confirm Password <br><input type="password" class="box1" name="confirm" placeholder="Confirm Password" required><br><br><br>
		
		<input type="submit" class="box" name="submit" value="Register">
		<input type="reset" class="box" name="reset" value="Re-enter">  
	
	</form>
	</center>
	</div>
</body>
</html>