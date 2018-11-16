package datos;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Producto;
import utilidades.Simuladores;

public class Coleccion implements IColeccion{
	
	private List<Producto> col = new ArrayList<>();
	private static final Logger logger = LogManager.getLogger("Coleccion");
	

	public Coleccion() {
		super();
	}

	public Coleccion(List<Producto> col) {
		super();
		this.col = col;
	}

	public List<Producto> getCol() {
		return col;
	}

	public void setCol(List<Producto> col) {
		this.col = col;
	}
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(col);
		builder.append("]");
		return builder.toString();
	}
	
	public Producto randomElement(){
		int pos = Simuladores.randBetween(0, col.size()-1);
		logger.info("seleccion: "+col.get(pos));
		return col.get(pos);
	}


	public void add(Producto obj){
		col.add(obj);
	}	

}
