package datos_enum;

/**
 *
 * @author Antonio
 */
public enum Material {
    carton(100), 
    plastico(300), 
    madera(500);   
    
    public final int precio;
    
    private Material(int precio){
        this.precio=precio;
    }
}
