<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>ADMIN</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">NANDAN HOTEL</a>
			</div>
		</div>
	</nav>
<div class="container">
<div class="jumbotron">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
            Welcome to the admin page :<mark>${user}</mark>  | <a href="<c:url value="/j_spring_security_logout" />"><span class="glyphicon glyphicon-log-out"></span>
						Logout</a>
        </h2>
    </c:if>
    </div>
    <h2> <a href="admin/allusers">All USERS</a></h2>
    <h2> <a href="admin/allcat">All Category</a></h2>
    <h2><a href="admin/alllocation">Location</a></h2>
    <h2><a href="admin/order">BOOKINGS</a></h2>
    <h2><a href="admin/allstock">Show Stock</a></h2>
    <h2><a href="admin/addstock">Add Stock</a></h2>
    <h2><a href="admin/allemp">Show Employee</a></h2>
    <h2><a href="admin/addemp">Add Employee</a></h2>
    </div>
</body>
</html>
