<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Visualizza contatti</title>

<script type="text/javascript">
function home(){
	window.location = "index.jsp"; 
}
</script>
</head>

<body>
<h1 align="center">Contatti in rubrica</h1>
<div align="center">
<table border="5px">
<c:forEach items="${contatti}" var="contact">
<tr>
	<td><c:out value="${contact.firstname}" /></td>
	<td><c:out value="${contact.lastname}" /></td>
	<td><c:out value="${contact.email}" /></td>
	<td><c:out value="${contact.telephone}" /></td>
</c:forEach>
</table>
</div>

<div>
        
       <p align="center"> <input type="button" value="Pagina iniziale" style="height:50px; width:250px" onclick="home()" /></p>
        </div>

</body>
</html>