package model.formacion;

import java.util.Arrays;

import model.humanos.Alumno;

public class Curso {

	private String nombreCurso;
	private Asignatura[] asignaturas = new Asignatura[2];
	private Alumno[] colMatriculas = new Alumno[2];
	
	//Estos indices indican la posicion vacia
	private int indAsign = 0;
	private int indMat = 0;

	public Curso() {
		super();
	}

	public Curso(String nombreCurso) {
		super();
		this.nombreCurso = nombreCurso;
	}

	public Curso(String nombreCurso, Asignatura[] asignaturas, Alumno[] colMatriculas) {
		super();
		this.nombreCurso = nombreCurso;
		this.asignaturas = asignaturas;
		this.colMatriculas = colMatriculas;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Alumno[] getColMatriculas() {
		return colMatriculas;
	}

	public void setColMatriculas(Alumno[] colMatriculas) {
		this.colMatriculas = colMatriculas;
	}
	
	public void addAsignatura(Asignatura asign){
		asignaturas[indAsign] = asign;
		if (indAsign < asignaturas.length-1){
			indAsign++;
		}
	}
	
	public void addMatricula(Alumno alumno){
		colMatriculas[indMat] = alumno;
		if (indMat < colMatriculas.length-1){
			indMat++;
		}
	}	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [nombreCurso=");
		builder.append(nombreCurso);
		builder.append(", \nasignaturas=");
		builder.append(Arrays.toString(asignaturas));
		builder.append(", \ncolMatriculas=");
		builder.append(Arrays.toString(colMatriculas));
		builder.append("]");
		return builder.toString();
	}

	

}
