package poligonos;

/**
 *
 * @author Antonio
 */
public class PoligonoColorado extends Poligono{
    private String color;

    public PoligonoColorado() {
    }

    public PoligonoColorado(String color, Material material, int numeroPuntos) {
        super(material, numeroPuntos);
        this.color = color;
        
        this.setPrecio((int)(this.getPrecio()*1.15));
        
        int precio=super.getPrecio();
        precio += precio*15/100;
        super.setPrecio(precio);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "PoligonoColorado{" +super.toString()+ "color=" + color + '}';
    }
}
