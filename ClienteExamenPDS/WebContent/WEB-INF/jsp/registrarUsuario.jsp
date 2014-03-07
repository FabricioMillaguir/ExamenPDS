<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Registrar Nuevo Usuario de Administracion</title>
</head>
<body>
	
	<h2>Registro de Administrador</h2>
	
	<form:form method="post" action="registrarUsuario.html">

		<table>
			<tr> 	
        <td>Username</td>
 		<td><input name="username"></td>
    </tr>
			
			<tr> 	
        <td>Password</td>
 		<td><input type="password" name="password"></td>
    </tr>
    <tr>
    <td></td>
    <td>${message}</td>
    </tr>

			<tr>
				<td colspan="2"><input type="submit" value="Registrar Usuario" />
				</td>
			</tr>
			
			
		</table>
	</form:form>
	
<form:form method="post" action="menu.html">
       <td colspan="2"><input type="submit" value="volver al menu" /></td>
</form:form>
	
</body>
</html>