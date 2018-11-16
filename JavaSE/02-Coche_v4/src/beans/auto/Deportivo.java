package beans.auto;

/**
 *
 * @author Moises
 */
public class Deportivo extends Coche {

    private int descapotable;
    
    public Deportivo(){}

	public Deportivo(int descapotable) {
		super();
		this.descapotable = descapotable;
	}

	public Deportivo(String marca, String modelo, String color, String combustible, int numPuertas, int potencia,
			int consumoGas, int descapotable) {
		super(marca, modelo, color, combustible, numPuertas, potencia, consumoGas);
		this.descapotable = descapotable;
	}

	public int getDescapotable() {
		return descapotable;
	}

	public void setDescapotable(int descapotable) {
		this.descapotable = descapotable;
	}

	@Override
	public String toString() {
		return super.toString() + "Deportivo [descapotable=" + descapotable + "]";
	}

  
    

}
