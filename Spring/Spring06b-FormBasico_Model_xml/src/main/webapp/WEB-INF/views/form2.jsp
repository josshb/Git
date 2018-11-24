<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
<spring:url value="/resources/css/estilos.css" var="estilos" />
<link href="${estilos}" rel="stylesheet" />          
        <title>Spring (06b) - FormBasico_Model - Form2</title>
    </head>
    <body>
        <div id="contenedor">
            <h2>Spring06b-FormBasico_Model Form2 <br /> (Anotac + Model_View + Model + RequestMapping)</h2>
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
