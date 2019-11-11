<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
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

.active {
  background-color: #4CAF50;
}
</style>
<meta charset="ISO-8859-1">
<title>Details</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="/dbms/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<%@ page isELIgnored="false"%>
<title>order2</title>
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
                <li><a href="#">FAQ</a></li>
				
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
	<h2>Event Bookings:</h2>
<div class="container">
	<table class="table table-striped">
		<thead>
		<th>Location</th>
		<th>Booking date</th>
		<th>Event</th>
		<th>Price</th>
		</thead>
		<tbody>
		<tr>
		<td>${list[0].lname }</td>
		<td>${list[0].bdate }</td>
		<td>${list[0].event }</td>
		<td>${list[0].price }</td>
		</tr>
		</tbody>
		</table>
</div>
<h2>Food Orders:</h2>
		<table class="table table-striped">
		<thead>
		<th>name</th>
		<th>quantity</th>
		<th>subtotal</th>
		</thead>
		<tbody>
<c:forEach items="${list }" var="order">
<tr>
<td>${order.name }</td>
<td>${order.quantity }</td>
<td>${order.tprice }</td>
</tr>

</c:forEach> 
</tbody>
</table>
<div class="container">
<h2>Room Bookings:</h2>
 <div class="container">
	<table class="table table-striped">
	<thead>
      <tr>
        <th>Check-in Date</th>
        <th>Check-out Date</th>
        <th>Number of Rooms</th>
        <th>Price</th>
      </tr>
    </thead>
    <tbody>

<c:forEach items="${list1}" var="cat">
<tr>
<td>${cat.cdate }</td> 
<td>${cat.odate }</td>
<td>${cat.rooms }</td>
<td>${cat.price }</td>
</tr>
</c:forEach> 
</tbody>
</table>

		</div>
</div>

<script src="/dbms/webjars/jquery/1.11.1/jquery.min.js"></script>
<script src="/dbms/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>