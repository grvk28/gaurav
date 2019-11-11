<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><a href="/dbms/location">ADD LOCATION</a></h1>
<c:forEach items="${list }" var="loc">
<h2>${loc.lname }</h2>
<h3>${loc.bdate }  ${loc.event } </h3>
<h2><a href="./select/${loc.bid }">SELECT</a></h2>
<br>
<br>
</c:forEach> 
</body>
</html>