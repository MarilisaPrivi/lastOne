<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Visualizza contatti</title>
</head>
<body>

<table border="5px">
<c:forEach items="${contatti}" var="contact">
<tr>
	<td><c:out value="${contact.firstname}" /></td>
	<td><c:out value="${contact.lastname}" /></td>
	<td><c:out value="${contact.email}" /></td>
	<td><c:out value="${contact.telephone}" /></td>
</c:forEach>
</table>

<a href="index.jsp"> home </a>
</body>
</html>