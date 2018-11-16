package modelo;

public class Coche {

	private String marca;
	private String modelo;
	private boolean metalizado;
	private String matricula;
	private String tipo_coche;
	private int fabricacion;
	private boolean seguro;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isMetalizado() {
		return metalizado;
	}

	public void setMetalizado(boolean metalizado) {
		this.metalizado = metalizado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTipo_coche() {
		return tipo_coche;
	}

	public void setTipo_coche(String tipo_coche) {
		this.tipo_coche = tipo_coche;
	}

	public int getFabricacion() {
		return fabricacion;
	}

	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public Coche() {

	}

	public Coche(String marca, String modelo, boolean metalizado, String matricula, String tipo_coche, int fabricacion,
			boolean seguro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.metalizado = metalizado;
		this.matricula = matricula;
		this.tipo_coche = tipo_coche;
		this.fabricacion = fabricacion;
		this.seguro = seguro;
	}

public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", metalizado=" + metalizado + ", matricula="
				+ matricula + ", tipo_coche=" + tipo_coche + ", fabricacion=" + fabricacion + ", seguro=" + seguro
				+ "]";
	}
	

}
