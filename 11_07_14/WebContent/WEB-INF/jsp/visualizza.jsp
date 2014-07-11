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
<c:forEach items="${contatti}" var="contact">
	<c:out value="${contact.firstname}" /><br>
	<c:out value="${contact.lastname}" /><br>
	<c:out value="${contact.email}" /><br>
	<c:out value="${contact.telephone}" /><br>
</c:forEach>
<a href="index.jsp"> home </a>
</body>
</html>