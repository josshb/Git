package control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import datos.Coleccion;
import model.Producto;

public class Control {
	
	private Coleccion col = new Coleccion();
	private static final Logger logger = LogManager.getLogger("Control");
	
	
	public void arrancar(){
		
		col.add(42);
		col.add("hola");
		col.add(new Producto("movil"));
		logger.info(col);
		
		//Problemon por no saber le tipo de datos
		String val = ((Producto)col.randomElement()).getNombre();
		logger.info(val);
		
		
		
	}

}
