package personas;

public class Personas {

	
	private String Nombre;
	private int Edad;
	
	
	public Personas (String Nombre,int Edad) {
		this.Nombre=Nombre;
		this.Edad=Edad;
		
	}
	
	public Personas(){
		
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getEdad() {
		return Edad;
	}


	public void setEdad(int edad) {
		Edad = edad;
	}
	
}
