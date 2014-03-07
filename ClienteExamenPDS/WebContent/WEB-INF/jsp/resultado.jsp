<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Resultados encontrados</title>
</head>
<body>

<h4>${message}</h4>

<table width="50%">
 
 		<c:if test="${palabra.idioma == 1}"> 
        <tr><td><h2>${palabra.espanol}</h2></td></tr>
         <tr><td><strong>En Mapudungun : </strong></td></tr>
            <tr><td>${palabra.mapudungun}</td></tr>
         </c:if>
         
         <c:if test="${palabra.idioma == 2}"> 
        <tr><td><h2>${palabra.mapudungun}</h2></td></tr>
         <tr><td><strong>En Español : </strong></td></tr>
            <tr><td>${palabra.espanol}</td></tr>
         </c:if>
</table>  
<br/>
<form:form method="post" action="mostrarBusqueda.html">
       <td colspan="2"><input type="submit" value="nueva busqueda" /></td>
</form:form>
<form:form method="post" action="menu.html">
       <td colspan="2"><input type="submit" value="volver al menu" /></td>
</form:form>
</body>
</html>