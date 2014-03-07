<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html> 
    <head> 
        <title>Login</title> 
    </head> 
    <h1>Login</h1>
	        <form:form method="post" action="loggear.html">

		<table>
			<tr> 	
        <td>Usuario</td>
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
				<td colspan="2"><input type="submit" value="Iniciar Sesión" />
				</td>
			</tr>	
		</table>
	</form:form>
  
    </body> 
</html> 