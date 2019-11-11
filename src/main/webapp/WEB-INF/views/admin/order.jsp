<%@page import="org.springframework.ui.Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style>
body {
    counter-reset: section;
}

h2::before {
    counter-increment: section;
    content: "Order " counter(section) ": ";
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="/dbms/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<%@ page isELIgnored="false"%>
<title>Event</title>
</head>
<body style="background: #ffe6e6">
	<nav class="navbar navbar-inverse navbar-fixed-top" style="background: #3366cc !important">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">NANDAN HOTEL</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="/dbms/admin">Home</a></li>
				<li><a href="addcat">ADD CATEGORY</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="<c:url value="/j_spring_security_logout" />"><span class="glyphicon glyphicon-log-out"></span>
						Logout</a></li>
			</ul>
		</div>
	</nav>
	<br>
	<br>
	<br>
	<div class="container">
	<h1>ALL ORDERS</h1>
	<div class="list-group">
<c:forEach items="${list }" var="order">
<h2><a href="order/${order.bid }/${order.cid }/${order.uid }">${order.uid }</a></h2>
<br>
<br>
</c:forEach> 
</body>
</html>