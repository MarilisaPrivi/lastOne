<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<script type="text/javascript">
function mostra(){
	window.location = "contacts.html"; 
}
function mostra2(){
	window.location = "www.staiapezzi.com"; 
}
</script>
    <title>Spring MVC</title>
</head>

<body bgcolor="skyblue"> 

   <fieldset style="background-color:limegreen; border:red; margin:15px">
<legend align="center">RUBRICA</legend>
    <div>
        
       <p align="center"> <input type="button" value="Inserisci" style="height:50px; width:250px" onclick="mostra()" /></p>
        </div>
        <br>
        <div>
       <p align="center"> <input type="button" value="Modifica" style="height:50px; width:250px" onclick="mostra2()" /></p>
        
    </div>
    <br>
    <br>
    </fieldset>
</body>
</html>