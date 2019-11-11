<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>

<head>
<title>LOGIN</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<style>
.errorblock {
	color: #32CD32;
	background-color: #228B22;
}
</style>
</head>
<body onload='document.loginForm.j_username.focus()' style="background: #ADD8E6">
	<div>
		<center>
			<div class="container">
				<div style="background:  #67fa02 !important" class="jumbotron">
					<h2 style="font-size: 50px;font-family: Western">NANDAN HOTEL PALACE</h2>
					<p>WELCOME</p>
				</div>
				<h3 style="font-size: 25px">Login</h3>

				<%
					String errorString = (String) request.getAttribute("error");
					if (errorString != null && errorString.trim().equals("true")) {
						out.println("<span class=\"errorblock\">Incorrect login name or password. Please try again");
					}
				%>

				<form name='loginForm' action="<c:url value='login' />"
					method='POST' class="form-inline">
					<div class="form-group" style="font-size: 22px">
						<label>Username:</label> <input type='text' name='username'
							class="form-control" placeholder="username" value=''><br>
					</div>
					<br>
					<div class="form-group" style="font-size: 22px">
						<label>Password:</label> <input type='password' name='password'
							class="form-control" placeholder="password" />
					</div>
					<br> <input name="submit" type="submit"
						class="btn btn-success" value="LogIn" /> <input name="reset"
						type="reset" class="btn btn-success" value="Reset" />
						<a href="#">Forget Password</a>

				</form>

<br>
<br>
<br>
<br>
				<div class="container" style="font-size: 25px">
					
					<form action="register" class="form-inline">
						<h3 style="font-size: 25px">IF NOT REGISTERED, REGISTER HERE
						<input value="Register" type="submit" class="btn btn-success"></h3>
					</form>
		</center>
	</div>
	</div>
	</div>
	
	<script src="webjars/jquery/1.11.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>