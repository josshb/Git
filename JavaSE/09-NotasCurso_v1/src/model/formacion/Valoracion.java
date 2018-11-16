package model.formacion;

import model.humanos.Alumno;

public class Valoracion {

	private Alumno alumno;
	private double nota;

	public Valoracion() {
		super();
	}

	public Valoracion(Alumno alumno, double nota) {
		super();
		this.alumno = alumno;
		this.nota = nota;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Valoracion [alumno=");
		builder.append(alumno);
		builder.append(", nota=");
		builder.append(nota);
		builder.append("]");
		return builder.toString();
	}

}
