package Beans;

/**
 *
 * @author Antonio Santos
 */
import Utilidades.Datos;

public class Producto {

    int codigo;
    String nombre;
    String categoria;
    int cantidad;

    public Producto() {
    }

    public Producto(int codigo, String nombre, String categoria, int cantidad) {
        this.codigo = codigo;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto crearProducto() {

        Producto p = null;

        try {
            System.out.println("Introduzca el código del producto");
            int cod = Datos.recogeInt();

            System.out.println("Introduce el nombre del producto");
            String name = Datos.recogeString();

            System.out.println("Introduce la categoriá del producto");
            String cat = Datos.recogeString();

            System.out.println("Introduce la cantidad existente");
            int cant = Datos.recogeInt();

            p = new Producto(cod, name, cat, cant);

        } catch (Exception e) {
            e.getStackTrace();
        }
        return p;
    }

    @Override
    public String toString() {
        return "[" + codigo + "]  " + nombre + " (" + categoria + ") -- " + cantidad + " unidades";
    }
}
