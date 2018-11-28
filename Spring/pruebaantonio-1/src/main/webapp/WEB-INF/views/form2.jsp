<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORM1</title>
</head>
<body>
	<h1>Formulario paso 1</h1>
	<h2>Recogida datos</h2>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Password</th>
				<th>Id</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<!-- Aqui cambia porque el objeto guardado es el cliente.. no sus atributos individuales -->
				<td><c:out value="${cliente.nombre}" /></td>
				<td><c:out value="${cliente.password}" /></td>
				<td><c:out value="${cliente.id}" /></td>
			</tr>
		</tbody>
	</table>
</body>
</html>