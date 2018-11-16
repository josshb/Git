package control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import datos.Coleccion;
import model.Producto;

public class Control {
	
	private Coleccion col = new Coleccion();
	private static final Logger logger = LogManager.getLogger("Control");
	
	
	public void arrancar(){
		
		col.add(new Producto("coche"));
		col.add(new Producto("libro"));
		col.add(new Producto("movil"));
		logger.info(col);
		
		String val = col.randomElement().getNombre();
		logger.info(val);
		
		
		
	}

}
