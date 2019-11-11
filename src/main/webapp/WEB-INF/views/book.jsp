<%@page import="org.springframework.ui.Model"%>
<%@page import="com.gaurav.model.Category"%>
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
  color: white;
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
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<%@ page isELIgnored="false"%>
<title>Category</title>
</head>
<body >
	<nav class="navbar navbar-inverse navbar-fixed-top"
		style="background: #ADD8E6 !important">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">NANDAN HOTEL</a>
			
			<ul class="nav navbar-nav">
				<li><a href="/dbms/user"><span class="glyphicon glyphicon-home"></span>HOME</a></li>
			
			<li><a href="/dbms/buyitem/cart"><span class="glyphicon glyphicon-shopping-cart"></span>CART</a></li>
				<li><c:if test="${pageContext.request.userPrincipal.name != null}">
					 <a href="<c:url value="/j_spring_security_logout" />"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a>
				</c:if><li>
			</ul>
			</div>
		</div>
	</nav>
	<br>
	<br>
	<br>
		<div class="list-group">
        <h3>Book the Room :</h3>
        
		 
	<table class="table table-striped">
	<thead>
      <tr>
        <th>TYPE____  </th>
        <th>FEATURES____   </th>
        
        <th>PRICE_____</th>
              </tr>
    </thead>
    <tbody>

<c:forEach items="${list1}" var="cat">
<tr>
<td>${cat.type }</td> 
<td>${cat.getFeat() }</td>

<td>${cat.getPrice() }</td>
<td><form method ="post" action="update/${cat.getPrice() }" modelAttribute="R_type" >


</form>
</td>
<td>${item.tprice }</td>

<td><a href="/dbms/user">Remove</a></td>

</tr>

</c:forEach> 
</tbody>
</table>
<br>
<h3>Fill the Details: </h3>
		</div>

 <form method="post" action="/dbms/booked/${catcid}" class="form-inline" modelAttribute="customer">
<fieldset>

    <div>
        <label for="">Check-In Date:</label>
        <input type="date"  name="cdate" path="cdate"
               min="${date }"  max="2019-12-31" required="required"/>
    
        <label for="">Check-Out Date:</label>
        <input type="date"  name="odate" path="odate"
               min="${date }"  max="2019-12-31" required="required"/>
         <label for="">Rooms:</label>
        <input type="number"  name="guests" required="required" placeholder="0" min="1" max="50"/>
        
        
        <label for="">Guests:</label>
        <input type="number"  name="rooms" required="required" placeholder="0" min="1" max="50"/>
        
       
        
        <input value="Submit" type="submit">
    </div>

</fieldset>
</form>
<br>
<br>

<table class="table table-striped">
	<thead>
      <tr>
        <th>Date</th>
        <th>AVAILABLE</th>
         </tr>
    </thead>
    <tbody>

<c:forEach items="${list}" var="bat">
<tr>
<td>${bat.cdate }-----------</td> 
<td>${bat.available }</td>

</tr>
</c:forEach> 
</tbody>
</table>
<br>
    <br>
<p1>Note: 50 Rooms are available on the dates which are not mentioned above.</p1>


    
    <script src="webjars/jquery/1.11.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>