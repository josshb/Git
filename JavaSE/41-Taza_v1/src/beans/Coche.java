package beans;

/**
 *
 * @author Antonio
 */
public class Coche {
    
    private int velocidad;

    public Coche() {
    }

    public Coche(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public Coche dameCoche(){
        return this;
    }

    @Override
    public String toString() {
        return "Coche{" + "velocidad=" + velocidad + '}';
    }    
}
