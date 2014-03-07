<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
	<title>Saludos</title>
</head>
<body>
	${message}
	
<form:form method="post" action="menu.html">
       <td colspan="2"><input type="submit" value="volver al menu" /></td>
</form:form>
</body>
</html>