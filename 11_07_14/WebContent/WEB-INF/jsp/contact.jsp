<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC</title>
</head>
<body bgcolor="yellow">
<h2>Aggiungi Contatto</h2>
<form:form method="post" action="addContact.htm">
 
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
        <td><form:label path="lastname">Email</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname">Telefono</form:label></td>
        <td><form:input path="telephone" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Aggiungi"/>
        </td>
    </tr>
	</table>
</form:form>
</body>
</html>