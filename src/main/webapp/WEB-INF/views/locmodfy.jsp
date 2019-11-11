<%@page import="org.springframework.ui.Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #ADD8E6;
}

.active {
  background-color: #4CAF50;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="/dbms/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<%@ page isELIgnored="false"%>
<title>Locationbydate</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top"
		style="background: #ADD8E6 !important">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">NANDAN HOTEL</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="/dbms/user"><span class="glyphicon glyphicon-home"></span>HOME</a></li>
				
          	    <li><a href="./order">Bookings</a></li>
                <li><a href="./location">Locations</a></li>
                <li><a href="./allcat">Order Food</a>
                <li><a href="#news">FAQ</a></li>
				</ul>
				
				<li class="active"><a href="/dbms/allcat">CATEGORIES</a></li>
			</ul>
			
			<ul class="nav navbar-nav navbar-right">
			<li><a href="/dbms/buyitem/cart"><span class="glyphicon glyphicon-shopping-cart"></span>CART</a></li>
				<li><c:if test="${pageContext.request.userPrincipal.name != null}">
					 <a href="<c:url value="/j_spring_security_logout" />"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a>
				</c:if><li>
			</ul>
		</div>
	</nav>
	<br>
	<br>
	<br>
	<div class="container">
		<div class="list-group">
	<h2>AVAILABLE LOCATION on ${date }</h2>
	<h3>IF YOU CANNOT FIND ANY LOCATION TRY DIFFERENT DATE</h3>
	<h3><a href="location">Change date</a></h3>
<c:forEach items="${list }" var="loc">
<li class="list-group-item">Name: ${loc.lname } <br> Price: ${loc.price } <br> Address: ${loc.address }</li>
<li class="list-group-item"><a href="bookloc/${loc.lid }/${date }/addevent">BOOK</a></li><br>
<br>
<br>
</c:forEach> 
</body>
</html>