<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="/dbms/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<meta charset="UTF-8">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top"
		style="background: #3366cc !important">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">NANDAN HOTEL</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="/dbms/admin">Home</a></li>
				
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="<c:url value="/j_spring_security_logout" />"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a></li>
			</ul>
		</div>
	</nav>
	<br>
	<br>
	<br>
	<div class="container">
		<form:form method="post" modelAttribute="category"
			action="addcat"
			class="form-inline">
			<div class="form-group">
			<label for="">CATEGORY NAME</label><br>
					<form:input path="cname" type="text" required="required" class="form-control" />
						<form:errors path="cname"></form:errors>
				
				</div>
				<br><br>
						<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>
	<script src="/dbms/webjars/jquery/1.11.1/jquery.min.js"></script>
	<script src="/dbms/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>








<!--<form:form method="post" modelAttribute="category" action="addcat">
<table>
<tr><td>Category Name:</td>
<td><form:input path="cname" type="text" required="required"/>
<form:errors path="cname"></form:errors>
</td></tr>
<tr><td><input type="submit"/></td></tr>
</table>
</form:form>-->
</body>
</html>