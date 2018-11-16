package control;

import model.Mensaje;
import utilidades.LecturaDatos;
import utilidades.Writer;

/**
* @author Antonio Santos
* 
*/

public class Saludator {

	public void saludar() {
		Mensaje msg = new Mensaje();
		msg.setTexto(LecturaDatos.LeerTexto("Saluda: "));
		Writer.escribirPantalla(msg);
	}
}
