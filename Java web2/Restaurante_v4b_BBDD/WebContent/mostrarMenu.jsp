<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--
Proyecto: Restaurante
Versión: 4b
Descripción: Restaurante v4b (Multi,MVC,JSP,JSTL, BBDD)
-->
<html>
    <head>
        <title>Restaurante v4b (Multi,MVC,JSP,JSTL, BBDD)</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>  
        <link href="css/restaurante.css" rel="stylesheet" type="text/css" />        
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h1>Restaurante v4b (Multi,MVC,JSP,JSTL, BBDD)</h1>
                <h2>Paso 02 - Menú a elegir</h2>
            </div>
            <div id="main">
                <form action="Peticion" method="post">
                    <fieldset>
                        <legend>Menú del día (${menuDia.diaSemana})</legend>
                        <p>Elige un primero, un segundo y un postre.</p>

                        <p>
                            <label for="primero">Primeros platos:</label>
                            <br />  

                            <!-- menu.getPrimeros().darPlatos(0).getNombre() -->
                            <c:forEach var="plato" items="${menuDia.menu[0].listaPlatos}">
                               
                                <input type='radio' name='primero' value='${plato.nombre}' />
                                ${plato.nombre} |
                            </c:forEach>
                            <br />
                        </p>
                        <p>
                            <label for="segundo">Segundos platos:</label>
                            <br />
                            <c:forEach var="plato" items="${menuDia.menu[1].listaPlatos}">
                                <input type='radio' name='segundo' value='${plato.nombre}' />
                                ${plato.nombre} |  
                            </c:forEach>
                            <br />
                        </p>
                        <p>
                            <label for="postre">Postres:</label>
                            <br />                                              
                            <c:forEach var="plato" items="${menuDia.menu[2].listaPlatos}">
                                <input type='radio' name='postre' value='${plato.nombre}' />
                                ${plato.nombre} |                             
                            </c:forEach>
                            <br />
                        </p>
                        <p>
                            <input type="submit" value="Realizar pedido" />
                        </p>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
