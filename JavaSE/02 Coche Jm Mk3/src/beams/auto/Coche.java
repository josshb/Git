package beams.auto;

import util.LecturaDatos;

public class Coche {

	private String marca;
	private String modelo;
	private String color;
	private String combustible;
	private int numPuertas;
	private int potencia;
	private int consumoGas;

	public Coche() {

	}

	public Coche(String marca, String modelo, String color, String combustible, int numPuertas, int potencia,
			int consumoGas) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.combustible = combustible;
		this.numPuertas = numPuertas;
		this.potencia = potencia;
		this.consumoGas = consumoGas;

	}

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getConsumoGas() {
		return consumoGas;
	}

	public void setConsumoGas(int consumoGas) {
		this.consumoGas = consumoGas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", combustible=");
		builder.append(combustible);
		builder.append(", numPuertas=");
		builder.append(numPuertas);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append(", consumoGas=");
		builder.append(consumoGas);
		builder.append("]");
		return builder.toString();
	}
	public void crearCoche() {
		System.out.println("CREADOR DE COCHES FUSILADO");
		this.setMarca(LecturaDatos.leerString("Dime la marca: "));
		this.setModelo(LecturaDatos.leerString("Dime el modelo: "));
		this.setColor(LecturaDatos.leerString("Dime el color: "));
		this.setCombustible(LecturaDatos.leerString("Dime dime el tipo de combustible: "));
		this.setNumPuertas(LecturaDatos.leerInteger("Dime el numero de puertas: "));
		this.setPotencia(LecturaDatos.leerInteger("Dime la potencia: "));
		this.setConsumoGas(LecturaDatos.leerInteger("Dime el consumo: "));
		
	}
	public void imprimirInforme() {
		System.out.println(this.toString());
	}
}
