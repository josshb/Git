package beans.materiales;

/**
 *
 * @author Antonio
 */
public class Porcelana {
   

    private String procedencia;
    private int precio;

    public Porcelana() {
    }
    
    public Porcelana(String procedencia, int precio) {
        this.procedencia = procedencia;
        this.precio = precio;
    }
   
    public String getProcedencia() {
        return procedencia;
    }
    
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Porcelana{" + "procedencia=" + procedencia + ", precio=" + precio + '}';
    }

}
