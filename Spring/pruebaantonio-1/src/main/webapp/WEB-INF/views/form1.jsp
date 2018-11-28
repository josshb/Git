<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>FORM1</title>
</head>
<body>
	<h1>Formulario paso 1</h1>
	<h2>Recogida datos</h2>
	<form:form method="post" modelAttribute="cliente"
		action="addCliente.htm">
		<table>
			<tr>
				<td><form:label path="nombre">Nombre</form:label></td>
				<td><form:input path="nombre" /></td>
			</tr>
			<tr>
				<td><form:label path="id">Nombre Usuario</form:label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Contraseña</form:label></td>
				<td><form:input path="password" /></td>
			</tr>
		</table>
		<br />
		<p>
			<input type="submit" value="Dar de alta" />
		</p>
	</form:form>
	<br />
	<p>
		<input type="submit" value="Dar de alta" />
	</p>
</body>
</html>