package servicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import datos.Coleccion;
import datos.IColeccion;
import model.Producto;

public class ColeccionService implements IColeccionService {
	
	private IColeccion col = new Coleccion();
	private static final Logger logger = LogManager.getLogger("ColeccionService");
	
	public void add(Producto p){
		col.add(p);
	}

}
