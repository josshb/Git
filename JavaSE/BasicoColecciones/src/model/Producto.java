package model;

public class Producto {
	private String nombre;
	
	// CONSTRUCTORES

	public Producto() {
		super();
	}

	public Producto(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	// SETTER & GETTER

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

}
