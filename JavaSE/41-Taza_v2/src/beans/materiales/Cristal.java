package beans.materiales;


/**
 *
 * @author Antonio
 */
public class Cristal {

    private String color;
    private String tamano;
    private int precio;
    

    public Cristal() {

    }

    public Cristal(String color, String tamano, int precio) {
        this.color = color;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cristal{" + "color=" + color + ", tamano=" + tamano + ", precio=" + precio + '}';
    }

}
