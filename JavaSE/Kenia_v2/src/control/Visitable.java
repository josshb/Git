package control;

/**
 *
 * @author Antonio
 */
public interface Visitable {
    
    // es correcto el uso de constantes,.. 
    // pero por logica parece mas un detalle de implementacion

    public static final int VISITAS_MAXIMAS = 1000;

    public String visitar();
}
