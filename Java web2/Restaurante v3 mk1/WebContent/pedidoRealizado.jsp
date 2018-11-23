<!DOCTYPE html>
<html lang="en">

<head>
    <title>Restaurante v3d (Multi,MVC,JSP,Eventos)</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width">
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="css/restaurante.css" rel="stylesheet" type="text/css" />
</head>
<div id="wrapper">
    <div id="header">
        <h1>Restaurante</h1>
        <h2> tu pedido </h2>

    </div>
    <div id="main">
        <p>Gracias por utilizar nuestros servicios.</p>
        <p>Enseguida le llevamos su pedido.<br /></p>

        <h3><strong>Datos del cliente</strong></h3>
        <ul>
            <li> Nombre del cliente: <strong>${cliente.nombre}</strong></li>
            <li> Habitacion del cliente: <strong>${cliente.habitacion}</strong></li>
        </ul>
        <h3><strong>Menu encargado para hoy</strong></h3>
        <ul>
            <li> De Primero: <strong>${encargo.primero}</strong></li>
            <li> De Segundo: <strong>${encargo.segundo}</strong></li>
            <li> De Postre: <strong>${encargo.postre}</strong></li>
        </ul>
        <!-- esto viene del contexto de web.xml -->
        <!-- Caso 1. Como evento -->
        <p>${frasefinal}</p>
        <!-- Caso 2. Directamente -->
        <p>${initParam.despedida}</p>
        <p>
            Si existe algun problema, envia un mensaje a <a href="#">${initParam.reservas}</a>
        </p>
    </div>
</div>

<body>

</body>

</html>
