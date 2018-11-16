package beans.materiales;


/**
 *
 * @author DAVID
 */
public class Cristal extends Materiales {

    private String color;
    private String tamano;

    public Cristal() {
        super();
    }

    public Cristal(String color, String tamano, int precio) {
        super(precio);
        this.color = color;
        this.tamano = tamano;
        
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


    @Override
    public String toString() {
        return "Cristal{" + "color=" + color + ", tamano=" + tamano  + '}';
    }

}
