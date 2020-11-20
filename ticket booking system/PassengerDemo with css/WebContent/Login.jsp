<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
	background-image: url("C:/Users/Manujini/Desktop/back.jpg");
    margin: 0;
    padding: 0;
    background-size:cover;
    background-position:center;
    font-family:sans-serif;
}
.box2{
	width: 250px;
	height:20px;
}
.box3{
	width: 100px;
	height:30px;
	font-size:19px;
}
.login-box{
	width: 400px;
    height: 420px;
    background: rgba(0, 0, 0, 0.5);
    color: #fff;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 70px 30px;
	border-radius: 5px;
}
.reg{
	colour:#fff;
	font-size:19px;
}
</style>
<title>Login</title>
</head>
<body>
	
	<div class="login-box">
	<center>
	<h1>Login here</h1><br>
	<form action="Login" method="post">
		Bus Number<br><input type="text" class="box2" name="BusNo" placeholder="Enter Bus Number" required><br><br>
		Password<br><input type="password" class="box2" name="password" placeholder="Enter Password" required><br><br><br>
		
		<input type="submit" class="box3" name="submit" value="Login"><br><br>
	</form>
	<a href="<%=request.getContextPath()%>/BusRegister" class="reg">Register New Bus</a>
	</center>
	</div>
	
</body>
</html> 