<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/estilos.css">
<title>Spring06c-FormBasico_Model_anot_SB - Form2</title>
</head>
<body>
	<div id="contenedor">
		<h2>
			Spring06c-FormBasico_Model_anot_SB <br /> (Anotac + Model_View +
			Model + SB)
		</h2>
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
	</div>
</body>
</html>
