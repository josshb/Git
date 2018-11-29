// Libreria JavaScript
// Catálogo de funciones generales

// A ver.. que esto es mu duro para el primer día de Javascript
// Pero piensa qu esto lo hace Jquery sin que te des cuenta

/* Agregar un nuevo evento a cualquier elemento */
function nuevoEvento(elemento, evento, funcion) {
    // para cualquier navegador
    try {
        if (elemento.addEventListener)
            elemento.addEventListener(evento, funcion, false);

        // para IE
        else
            elemento.attachEvent("on" + evento, funcion);
    } catch(e) {
        alert("No se pudo agregar el eventon" + e.name + " - " + e.message);
    }
}

// codigo javascript no intrusivo que asigna al evento onload una funcion
function addLoadEvent(func) {
    var oldonload = window.onload;
    if (typeof window.onload != 'function')
        window.onload = func;
    else {
        window.onload = function() {
            if (oldonload)
            oldonload();
            func();
        }
    }
}
