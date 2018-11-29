// Envolvemos el componente AngularJS en una IIFE (o patron closure)
//        Permite eliminar las variables del scope global
// http://www.desarrolloweb.com/articulos/iife-closures-envolutra-funcion-javascript.html

(function () {

    // Usamos modo estricto 
    // The "use strict" directive is new in JavaScript 1.8.5 (ECMAScript version 5).
    // http://www.w3schools.com/js/js_strict.asp
    // With strict mode, you can not, for example, use undeclared variables.

    'use strict';

    // Cargamos la aplicacion AngularJS
    angular
        .module('myApp', [])
        .controller('SimpleController', SimpleController);

    // Esta funcion es el controlador que asociamos a la vista
    function SimpleController() {

        //Es interesante hacer esto en vez de usar en todos los lados   this  o $this
        //   SI no lo usamos nos puede dar algun problema con las herencias
        var vm = this;

        //antes usabamos   $scope.personas = [...]
        vm.personas = [
                {name:'Antonio',city:'Madrid'},
                {name:'Luis',city:'Barcelona'},
                {name:'Virginia',city:'Valencia'},
                {name:'Maria',city:'Murcia'}
            ];
    }
})();