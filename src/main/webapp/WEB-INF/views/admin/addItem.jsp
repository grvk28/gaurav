<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" modelAttribute="item" action="additem">
<table>
<tr><td>Name:</td>
<td><form:input path="name" type="text" required="required"/>
<form:errors path="name"></form:errors>
</td></tr>
<tr><td>Quantity:</td>
<td><form:input path="quantity" type="int" default="10"/>
<form:errors path="quantity"></form:errors></td></tr>
<tr><td>Description:</td>
<td><form:input path="description" type="text"/></td></tr>
<form:errors path="description"></form:errors>
<tr><td><input type="submit"/></td></tr>
</table>
</form:form>
</body>
</html>