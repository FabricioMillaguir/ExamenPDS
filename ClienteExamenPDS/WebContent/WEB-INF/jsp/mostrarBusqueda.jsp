<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Buscar Palabra</title>
</head>
<body>
	<h1>Buscar Palabra</h1>
	<form:form method="post" action="traducir.html">
	<select name="idioma">
	<option value="1">Español - Mapudungun</option>
	<option value="2">Mapudungun - Español</option>
	</select>
	
		<input type="text" name="busqueda"/>
		<input type="submit" value="traducir" />
	</form:form>
		
<form:form method="post" action="menu.html">
       <td colspan="2"><input type="submit" value="volver al menu" /></td>
</form:form>
</body>
</html>