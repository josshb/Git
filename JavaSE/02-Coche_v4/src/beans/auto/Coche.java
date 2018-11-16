package beans.auto;

import java.util.Objects;

/**
 *
 * @author Moises  -> Antonio
 */
public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private String combustible;
    private int numPuertas;
    private int potencia;
    private int consumoGas;
    
	public Coche() {
		super();
	}

	public Coche(String marca, String modelo, String color, String combustible, int numPuertas, int potencia,
			int consumoGas) {
		super();
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
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", combustible=" + combustible
				+ ", numPuertas=" + numPuertas + ", potencia=" + potencia + ", consumoGas=" + consumoGas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
    
    
    
    


    
    
    
    

}
