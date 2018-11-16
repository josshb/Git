package control;

import java.util.Date;

import modelo.Director;
import modelo.Empleado;
import modelo.Gerente;
import gui.Menu;
import servicios.IServiciosEmpresa;
import servicios.ServiciosEmpresa;
import utilidades.LeerTeclado;

public class Empresa {

	// atributos
	IServiciosEmpresa servicios = new ServiciosEmpresa();

	public void start() {

		boolean seguir = true;
		do {
			Menu.mostrarMenu();
			seguir = this.seleccionOpciones();
		} while (seguir);
		System.out.println("   --- Fin de la sesion ---");

	}

	public boolean seleccionOpciones() {
		
	/*
        1.-Dar de alta un empleado
        2.-Eliminar un empleado
        3.-Listar los empleados existentes
        4.-Indicar si existe un empleado concreto
        5.-Modificar datos de un empleado
        6.-Incentivar a los directores        
        7.-Casos de prueba
        0.-Terminar sesion
     */		

		boolean continuar = true;
		switch (LeerTeclado.leerInt()) {
		case 1:
			// ALTA DE UN EMPLEADO
			servicios.addEmpleado();
			break;

		case 2:
			// ELIMINAR UN EMPLEADO
			servicios.eliminarEmpleado();
			break;

		case 3:
			// LISTAR EMPLEADOS
			servicios.listado();
			break;

		case 4:
			// INDICAR SI EXISTE UN EMPLEADO
			servicios.existeEmpleado();
			break;

		case 5:
			// MODIFICAR DATOS DE UN EMPLEADO
			servicios.modificarEmpleado();
			break;

		case 6:
			// INCENTIVAR DATOS DE UN DIRECTOR
			//servicios.incentivarDirectores();
			break;

		case 7:
			// CASOS DE PRUEBA
			servicios.CasosDePrueba();
			break;

		case 0:
			continuar = salir();
			break;
		}

		return continuar;
	}
	
    private boolean salir() {
        String sino = LeerTeclado.leerLinea("   ¿Esta seguro?(S/N)");
        return (sino.toUpperCase().charAt(0) != 'S');
    }

}
