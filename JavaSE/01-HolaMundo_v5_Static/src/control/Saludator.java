package control;

/**
* @author Antonio Santos
* 
**/

import model.Mensaje;
import utilidades.Writer;

public class Saludator {

	public void saludar() {
		Mensaje msg = new Mensaje();
		msg.setTexto("hola a todos");
		Writer.escribirPantalla(msg);
	}
}
