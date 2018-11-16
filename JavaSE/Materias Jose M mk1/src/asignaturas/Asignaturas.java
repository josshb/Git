package asignaturas;

public class Asignaturas {

	private String Nombre;
	private int Cofigo;
	private String Curso;
	
	
	public Asignaturas(){
		
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getCofigo() {
		return Cofigo;
	}


	public void setCofigo(int cofigo) {
		Cofigo = cofigo;
	}


	public String getCurso() {
		return Curso;
	}


	public void setCurso(String curso) {
		Curso = curso;
	}


	@Override
	public String toString() {
		return "Asignaturas: " + Nombre + "\nCofigo: " + Cofigo + "\nCurso: " + Curso ;
	}
	
	
	
	
}
