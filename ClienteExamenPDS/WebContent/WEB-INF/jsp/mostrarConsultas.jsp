<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Consultas</title>
</head>
<body>
<h2>Consultas realizadas</h2>

<table>
    <tr>
    	<th>Fecha</th>
        <th>Traducci&oacute;n</th>
        <th>Palabra</th>
        <th>Significado</th>
    </tr>
    
    <c:forEach items="${consultaForm.consultas}" var="consulta" varStatus="status">
        <tr>
        		
        		<td>${consulta.fecha}</td>
            	<td>${consulta.traduccion}</td>
            	<td>${consulta.palabra}</td>
            	<td>${consulta.significado}</td>
            	
            
        </tr>
    </c:forEach>
    
    
</table> 

<br/>
<form:form method="post" action="menu.html">
       <td colspan="2"><input type="submit" value="volver al menu" /></td>
</form:form>
</body>
</html>