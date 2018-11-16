package beans.auto;

public class Suv extends Coche {

    private int transmision;

	public Suv() {
		super();
	}

	public Suv(int transmision) {
		super();
		this.transmision = transmision;
	}

	public Suv(String marca, String modelo, String color, String combustible, int numPuertas, int potencia,
			int consumoGas, int transmision) {
		super(marca, modelo, color, combustible, numPuertas, potencia, consumoGas);
		this.transmision = transmision;
	}

	public int getTransmision() {
		return transmision;
	}

	public void setTransmision(int transmision) {
		this.transmision = transmision;
	}

	@Override
	public String toString() {
		return super.toString() +  "Suv [transmision=" + transmision + "]";
	}
	
	
    
    


}
