<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<script type="text/javascript">
function mostra(){
	window.location = "contacts.htm"; 
}
function mostra2(){
	window.location = "modifica.htm"; 
}
function mostra3(){
	window.location = "visualizza.htm"; 
}
</script>
    <title>Spring MVC</title>
</head>

<body bgcolor="skyblue"> 

   <fieldset style="background-color:limegreen;">
<legend align="center">RUBRICA</legend>
    <div>
        
       <p align="center"> <input type="button" value="Inserisci" style="height:50px; width:250px" onclick="mostra()" /></p>
        </div>
        
        <div>
       <p align="center"> <input type="button" value="Modifica" style="height:50px; width:250px" onclick="mostra2()" /></p>
        
    </div>
    
    <div>
       <p align="center"> <input type="button" value="Visualizza" style="height:50px; width:250px" onclick="mostra3()" /></p>
        
    </div>
    <br>
    <br>
    </fieldset>
</body>
</html>