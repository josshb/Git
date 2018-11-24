<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/estilos.css">
<title>Spring05d-HolaMundoMVC_Model_AnotacionesII</title>
</head>
<body>
	<div id="contenedor">
		<h2>Spring(05f) - HolaMundoMVC_Model_Anotaciones_Spring Boot</h2>
		<p>Bienvenida: ${greeting}</p>
		<p>
			Hoy es día
			<fmt:formatDate pattern="d 'de' MMMM 'de' yyyy" value="${fecha}" />
		</p>
	</div>
	</div>
</body>
</html>