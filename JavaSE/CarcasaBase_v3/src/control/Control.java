package control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import datos.Coleccion;
import model.Producto;
import servicios.ColeccionService;
import servicios.IColeccionService;

public class Control {
	
	IColeccionService colService = new ColeccionService();
	private static final Logger logger = LogManager.getLogger("Control");
	
	public void arrancar(){
		
		colService.add(new Producto("coche"));
		colService.add(new Producto("libro"));
		colService.add(new Producto("movil"));
		logger.info(colService);	
		
	}

}
