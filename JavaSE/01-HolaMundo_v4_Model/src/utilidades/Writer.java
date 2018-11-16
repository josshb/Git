package utilidades;

/**
* @author Antonio Santos
* 
**/

import model.Mensaje;

public class Writer {
	
	public void escribirPantalla(Mensaje msg){
		System.out.print("[Pantalla] "+msg.getTexto());
	}
	
	public void escribirFichero(Mensaje msg){
		System.out.print("[Fichero] "+msg.getTexto());
	}	

}
