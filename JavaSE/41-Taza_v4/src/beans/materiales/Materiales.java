package beans.materiales;

/**
 *
 * @author Mañana
 */
public class Materiales {
    
    private int precio;

    public Materiales() {
    }

    public Materiales(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Materiales{" + "precio=" + precio + '}';
    }
    
}
