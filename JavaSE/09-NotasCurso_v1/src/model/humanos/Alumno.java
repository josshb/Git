package model.humanos;

public class Alumno extends Persona {

	private String numMatricula;

	public Alumno() {

	}

	public Alumno(String numMatricula) {
		super();
		this.numMatricula = numMatricula;
	}
	


	public Alumno(String nombre, String numMatricula) {
		super(nombre);
		this.numMatricula = numMatricula;
	}

	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [");
		builder.append(super.toString());
		builder.append(", numMatricula=");
		builder.append(numMatricula);
		builder.append("]");
		return builder.toString();
	}

}
