package control;

import servicios.IServiciosEmpresa;
import utilities.LeerTeclado;

public class Empresa {

	IServiciosEmpresa serviciosNI = new ServiciosEmpresa();

	public void start() {
		boolean seguir = true;
		do {
			Menu.mostrarMenu();
			seguir = this.seleccionOpciones();

		} while (seguir);
		System.out.println("fin de la sesion");
	}

	public boolean seleccionOpciones() {

		boolean continuar = true;
		switch (LeerTeclado.leerInt()) {
		case 1:
			servicios.addEmpleado();
			break;

		case 2:
			servicios.eliminarEmpleado();
			break;
		case 3:
			servicios.listado();
			break;
		case 4:
			servicios.existeEmpleado();
			break;
		case 5:
			servicios.modificarEmpleado();
			break;
		case 6:

			break;
		case 7:
			servicios.casosDePrueba();
			break;
		case 0:
			continuar = salir();
			break;

		}
		return continuar;

	}

	private boolean salir() {
		String sino = LeerTeclado.leerLinea("seguro? s/n");
		return (sino.toUpperCase().charAt(0) != 'S');
	}

}
