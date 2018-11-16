package poligonos;

import datos_enum.Material;

/**
 * @author Antonio
 */
public class PoligonoColoreado extends Poligono {

    private String color;
    private int incremento = 15;

    public PoligonoColoreado() {
    }

    public PoligonoColoreado(String color, Material material, int numeroPuntos) {
        super(material, numeroPuntos);
        this.color = color;
        this.aplicarIncremento();
    }

    public PoligonoColoreado(String color, Material material, int numeroPuntos, int incremento) {
        super(material, numeroPuntos);
        this.color = color;
        this.incremento = incremento;
        this.aplicarIncremento();
    }

    public PoligonoColoreado(String color, int numeroPuntos) {
        super(numeroPuntos);
        this.color = color;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void aplicarIncremento() {
        int precio = getPrecio();
        precio += precio * incremento / 100;
        setPrecio(precio);
    }

    @Override
    public String toString() {
        return "PoligonoColoreado{" + super.toString() + "color=" + color + '}';
    }
}
