<%@page import="org.springframework.ui.Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="/dbms/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<%@ page isELIgnored="false" %>
<meta charset="UTF-8">
<title>Items</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" style="background: #3366cc !important">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">NANDAN HOTEL</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="/dbms/admin">Home</a></li>
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
	<h2><a href="additems/${catid }"><span class="glyphicon glyphicon-plus"></span>ADD ITEMS</a></h2>
	<table class="table table-striped">
	<thead>
      <tr>
        <th>ITEM</th>
        <th>PRICE</th>
        <th>Remove Item</th>
      </tr>
    </thead>
    <tbody>
    
    <c:forEach items="${list }" var="item">
    <tr>
    <td>${item.name }</td>
    <td>${item.price }</td>
    <td><a href="deleteitems/${item.iid }">DELETE ITEM</a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</div>
<script src="/dbms/webjars/jquery/1.11.1/jquery.min.js"></script>
<script src="/dbms/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>



<!-- <h2><a href="additems/${catid }">ADD ITEMS</a></h2>
<div class="list-group">
<c:forEach items="${list }" var="item">
<table>
<td><tr>${item.name } ${item.price } </tr></td>
</table>
</c:forEach>
</div> > -->
</body>
</html>