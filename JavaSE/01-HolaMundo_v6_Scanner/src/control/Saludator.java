package control;

/**
* @author Antonio Santos
* 
**/

import model.Mensaje;
import utilidades.LecturaDatos;
import utilidades.Writer;

public class Saludator {

	public void saludar() {
		Mensaje msg = new Mensaje();
		msg.setTexto(LecturaDatos.LeerTexto("Saluda: "));
		Writer.escribirPantalla(msg);
	}
}
