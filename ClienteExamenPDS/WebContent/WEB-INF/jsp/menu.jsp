<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<title>Menu</title>
</head>
<body>
<h2>Inicio</h2>
<form:form method="post" action="mostrarRegistrarUsuario.html">
        <td colspan="2">
            <input type="submit" value="Crear Nuevo Usuario"/>
        </td>
</form:form>

<form:form method="post" action="mostrarBusqueda.html">
        <td colspan="2">
            <input type="submit" value="Ir a Traduccion"/>
        </td>
</form:form>

<form:form method="post" action="mostrarConsultas.html">
        <td colspan="2">
            <input type="submit" value="Ver historico de consultas"/>
        </td>
</form:form>



<form:form method="post" action="salir.html">
        <td colspan="2">
            <input type="submit" value="            Salir                "/>
        </td>
</form:form>

</body>
</html>