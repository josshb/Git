package beans.auto;

/**
 *
 * @author Moises  -> Antonio
 */
public class Deportivo extends Coche {

    private int descapotable;

    public Deportivo() {

    }

    public Deportivo(int descapotable) {
        this.descapotable = descapotable;
    }

    public Deportivo(int descapotable, String marca, String modelo, String color, String combustible, int numPuertas, int potencia, int consumoGas) {
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
        return super.toString()+", Deportivo{" + "descapotable=" + descapotable + '}';
    }
    
    

}
