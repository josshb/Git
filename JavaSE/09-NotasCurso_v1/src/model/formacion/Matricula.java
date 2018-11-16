package model.formacion;

import java.util.Date;

import model.humanos.Alumno;

public class Matricula {

	private Date fechaMatricula;
	private Alumno alumno;

	public Matricula() {
		super();
	}

	public Matricula(Date fechaMatricula, Alumno alumno) {
		super();
		this.fechaMatricula = fechaMatricula;
		this.alumno = alumno;
	}

	public Date getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Matricula [fechaMatricula=");
		builder.append(fechaMatricula);
		builder.append(", alumno=");
		builder.append(alumno);
		builder.append("]");
		return builder.toString();
	}

}
