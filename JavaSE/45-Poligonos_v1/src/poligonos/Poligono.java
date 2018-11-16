package poligonos;

/**
 * @author Antonio
 */
public class Poligono {

    private Material material;
    private int precio;
    private int numeroPuntos;

    public Poligono() {
    }

    public Poligono(Material material, int numeroPuntos) {
        this.material = material;
        this.numeroPuntos = numeroPuntos;

        switch (material) {
            case carton:
                this.precio = 100;
                break;
            case plastico:
                this.precio = 300;
                break;
            case madera:
                this.precio = 500;
                break;
        }
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumeroPuntos() {
        return numeroPuntos;
    }

    public void setNumeroPuntos(int numeroPuntos) {
        this.numeroPuntos = numeroPuntos;
    }

    @Override
    public String toString() {
        return "Poligono{" + "material=" + material + ", precio=" + precio + ", numeroPuntos=" + numeroPuntos + '}';
    }
}
