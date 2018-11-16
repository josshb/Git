package model.humanos;

public class Profesor extends Persona {

	// De 5 a 10
	private int gradoMalaLeche;

	public Profesor() {
		super();
	}
	
	public Profesor(String nombre) {
		super(nombre);
	}

	public Profesor(int gradoMalaLeche) {
		super();
		this.gradoMalaLeche = gradoMalaLeche;
	}

	public int getGradoMalaLeche() {
		return gradoMalaLeche;
	}

	public void setGradoMalaLeche(int gradoMalaLeche) {
		this.gradoMalaLeche = gradoMalaLeche;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesor [");
		builder.append(super.toString());
		builder.append(", \ngradoMalaLeche=");		
		builder.append(gradoMalaLeche);
		builder.append("]");
		return builder.toString();
	}

}
