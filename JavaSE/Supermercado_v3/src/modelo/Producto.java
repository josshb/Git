package modelo;

/**
 *
 * @author Antonio Santos
 */
import java.io.Serializable;
import utilidades.Datos;

public class Producto implements Serializable {

    private String nombre;
    private String categoria;
    private int cantidad;

    public Producto() {
    }

    public Producto(String nombre, String categoria, int cantidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void crearProducto() {

        try {
            this.nombre = Datos.recogeString("Introduce el nombre del producto");
            this.categoria = Datos.recogeString("Introduce la categoría del producto");
            this.cantidad = Datos.recogeInt("Introduce la cantidad existente");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + categoria + ") -- " + cantidad + " unidades";
    }
}
