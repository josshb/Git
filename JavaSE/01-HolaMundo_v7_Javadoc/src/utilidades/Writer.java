package utilidades;

import model.Mensaje;

/**
* @author Antonio Santos
* 
*/


public class Writer {
	
	public static void escribirPantalla(Mensaje msg){
		System.out.print("[Pantalla] "+msg);
	}
	
	public static void escribirFichero(Mensaje msg){
		System.out.print("[Fichero] "+msg.getTexto());
	}	

}