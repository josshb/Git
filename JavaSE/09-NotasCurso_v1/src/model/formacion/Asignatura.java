package model.formacion;

import model.humanos.Profesor;

public class Asignatura {
	
	private String nombre;
	private Profesor profe;
	
	public Asignatura() {
		super();
	}
	public Asignatura(String nombre, Profesor profe) {
		super();
		this.nombre = nombre;
		this.profe = profe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Profesor getProfe() {
		return profe;
	}
	public void setProfe(Profesor profe) {
		this.profe = profe;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asignatura [nombre=");
		builder.append(nombre);
		builder.append(", \nprofe=");
		builder.append(profe);
		builder.append("]");
		return builder.toString();
	}


}
