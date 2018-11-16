package beans;

public class Estudiante extends Persona implements VaClase{
	
	public String asignatura;

	public Estudiante(String nombre, String edad, String sexo) {
		super(nombre, edad, sexo);
		// TODO Auto-generated constructor stub
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public static boolean vaaclase;
	

	

	

}
