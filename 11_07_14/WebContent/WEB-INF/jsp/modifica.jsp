<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC</title>
</head>
<body bgcolor="skyblue">
<h2>Modifica Contatto</h2>
<form:form method="post" action="modifyContact.htm">
 
    <table>
    <tr>
        <td><form:label path="firstname">Nome</form:label></td>
        <td><form:input path="firstname" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname">Cognome</form:label></td>
        <td><form:input path="lastname" /></td>
    </tr>
     <tr>
        <td><form:label path="telephone">telefono</form:label></td>
        <td><form:input path="telephone" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Modifica"/>
        </td>
    </tr>
	</table>
</form:form>
</body>
</html>