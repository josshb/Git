<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Proyecto: Restaurante
Versión: 3c
Descripción: Formato HTML
-->
<html>
    <head>
        <title>Restaurante v3d (Multi,MVC,JSP,Eventos)</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>  
        <link href="css/restaurante.css" rel="stylesheet" type="text/css" />        
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h1>Restaurante v3d (Multi,MVC,JSP,Eventos)</h1>
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
                            <input type="radio" id="primero1" name="primero" value="${menuDia.menu[0].listaPlatos[0].nombre}" checked="checked" />${menuDia.menu[0].listaPlatos[0].nombre}
                            <input type="radio" id="primero2" name="primero" value="${menuDia.menu[0].listaPlatos[1].nombre}" />${menuDia.menu[0].listaPlatos[1].nombre}
                            <input type="radio" id="primero3" name="primero" value="${menuDia.menu[0].listaPlatos[2].nombre}" />${menuDia.menu[0].listaPlatos[2].nombre}
                        </p>
                        <p>
                            <label for="segundo">Segundos platos:</label>
                            <br />
                            <input type="radio" id="segundo1" name="segundo" value="${menuDia.menu[1].listaPlatos[0].nombre}" />${menuDia.menu[1].listaPlatos[0].nombre}
                            <input type="radio" id="segundo2" name="segundo" value="${menuDia.menu[1].listaPlatos[1].nombre}" checked="checked" />${menuDia.menu[1].listaPlatos[1].nombre}
                            <input type="radio" id="segundo3" name="segundo" value="${menuDia.menu[1].listaPlatos[2].nombre}" />${menuDia.menu[1].listaPlatos[2].nombre}
                        </p>
                        <p>
                            <label for="postre">Postres:</label>
                            <br />
                            <input type="radio" id="postre1" name="postre" value="${menuDia.menu[2].listaPlatos[0].nombre}" />${menuDia.menu[2].listaPlatos[0].nombre}
                            <input type="radio" id="postre2" name="postre" value="${menuDia.menu[2].listaPlatos[1].nombre}" checked="checked" />${menuDia.menu[2].listaPlatos[1].nombre}
                            <input type="radio" id="postre3" name="postre" value="${menuDia.menu[2].listaPlatos[2].nombre}" />${menuDia.menu[2].listaPlatos[2].nombre}
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
