package beans.auto;

import utilidades.LecturaDatos;

/**
 *
 * @author Antonio
 */
/*
 * deportivo hereda de la clase coche, por eso el extends
 */
public class Deportivo extends Coche {

    private int descapotable;
//metodo vacio
    public Deportivo() {

    }
//declara metodo vacio descapotable especifico de este metodo
    public Deportivo(int descapotable) {
        this.descapotable = descapotable;
    }
    // lo hace dos veces no se si es error
    public Deportivo(int descapotable, String marca, String modelo, String color, String combustible, int numPuertas, int potencia, int consumoGas) {
        super(marca, modelo, color, combustible, numPuertas, potencia, consumoGas);
        this.descapotable = descapotable;
    }
    
    //getter setter etc
    
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
    
    public void crearDeportivo() {
        super.crearCoche();
        this.setDescapotable(LecturaDatos.leerInt("Es descapotable: "));  
    }

}
