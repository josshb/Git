package datos;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import utilidades.Simuladores;

public class Coleccion {
	
	private List col = new ArrayList();
	private static final Logger logger = LogManager.getLogger("Coleccion");
	

	public Coleccion() {
		super();
	}

	public Coleccion(List col) {
		super();
		this.col = col;
	}

	public List getCol() {
		return col;
	}

	public void setCol(List col) {
		this.col = col;
	}
	
	public void add(Object obj){
		col.add(obj);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(col);
		builder.append("]");
		return builder.toString();
	}
	
	public Object randomElement(){
		int pos = Simuladores.randBetween(0, col.size()-1);
		logger.info("seleccion: "+col.get(pos));
		return col.get(pos);
	}

}
