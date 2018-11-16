package poligonos;

import datos_enum.Material;

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
        this.precio = material.precio;
    }

    public Poligono(int numeroPuntos) {
        this.numeroPuntos = numeroPuntos;
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
