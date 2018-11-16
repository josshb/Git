package model.formacion;

import java.util.Arrays;
import java.util.Date;

public class Examen {

	private Date fechaExamen;
	private String textoExamen;
	private Asignatura asignatura;
	private Valoracion[] valoraciones = new Valoracion[2];

	public Examen() {
		super();
	}

	public Examen(Asignatura asignatura) {
		super();
		this.asignatura = asignatura;
	}

	public Examen(Date fechaExamen, String textoExamen, Asignatura asignatura, Valoracion[] valoraciones) {
		super();
		this.fechaExamen = fechaExamen;
		this.textoExamen = textoExamen;
		this.asignatura = asignatura;
		this.valoraciones = valoraciones;
	}

	public Date getFechaExamen() {
		return fechaExamen;
	}

	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}

	public String getTextoExamen() {
		return textoExamen;
	}

	public void setTextoExamen(String textoExamen) {
		this.textoExamen = textoExamen;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Valoracion[] getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(Valoracion[] valoraciones) {
		this.valoraciones = valoraciones;
	}
	
	public void redactarTexto(){
		textoExamen="lorem ipsum dolor sir amet...";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Examen [fechaExamen=");
		builder.append(fechaExamen);
		builder.append(", textoExamen=");
		builder.append(textoExamen);
		builder.append(", asignatura=");
		builder.append(asignatura);
		builder.append(", valoraciones=");
		builder.append(Arrays.toString(valoraciones));
		builder.append("]");
		return builder.toString();
	}

}
