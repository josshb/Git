<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/estilos.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<title>Spring06c-FormBasico_Model_anot_SB - Formulario 1</title>
</head>
<body>

	<div id="contenedor">
		<h2>
			Spring06c-FormBasico_Model_anot_SB - Form1 <br />(Anotac +
			Model_View + Model + SB)
		</h2>
		<!-- IMPORTANTE: Puedo usar   modelAttribute="cliente"   o     commandName="cliente" -->
		<!-- Aqui usamos  modelAttribute  porque estoy con model en el controller y uso alli modelAttribute  -->
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
	</div>
</body>
</html>
