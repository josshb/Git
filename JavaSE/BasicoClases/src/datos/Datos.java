package datos;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class Datos {
	private List<Producto> colVegana = new ArrayList<>();

	public List<Producto> getCol() {
		return colVegana;
	}

	public void setCol(List<Producto> col) {
		this.colVegana = col;
	}

	public void anadir(Producto p) {
		colVegana.add(p);

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Control [col=");
		builder.append(colVegana);
		builder.append("]");
		return builder.toString();
	}

}
