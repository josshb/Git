package Datos;

/**
 *
 * @author Antonio Santos
 */
import Beans.Producto;
import Utilidades.Datos;
import java.util.*;

public class Stock {

    ArrayList<Producto> stock;

    public Stock() {
        stock = new ArrayList<Producto>();
    }

    public ArrayList<Producto> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Producto> stock) {
        this.stock = stock;
    }

    public void ListarProductos() {

        System.out.println("-- LISTADO DE PRODUCTOS --");
        for (Producto producto : stock) {
            System.out.println(producto);
        }

    }

    public boolean AñadirProducto(Producto p) {
        stock.add(p);
        return true;
    }

    public boolean AñadirProducto() {
        Producto p = new Producto();
        p.crearProducto();
        stock.add(p);
        return true;
    }

    public int busquedaCodigo(int cod) throws Exception {

        if (stock.isEmpty()) {
            throw new Exception("   No hay stock.");
        } else {
            int a = -1;
            for (Producto p : stock) {
                if (p.getCodigo() == cod) {
                    a = stock.indexOf(p);
                }
            }
            return a;
        }
    }

    public boolean eliminarProducto(int cod) throws Exception {

        int a = busquedaCodigo(cod);

        if (a == -1) {
            System.out.println("   El supermercado no tiene ese producto");
            return false;
        }
        stock.remove(a);
        System.out.println("   Producto eliminado");
        return true;
    }

    public boolean CantidadesProducto(int cod) throws Exception {
        if (stock.isEmpty()) {
            throw new Exception("   No hay stock.");
        } else {
            int a = -1;
            for (Producto p : stock) {
                if (p.getCodigo() == cod) {
                    int cant = p.getCantidad();
                    String name = p.getNombre();
                    System.out.println(name + " (" + cant + " unidades)");
                }
            }
            return true;
        }

    }

    public boolean CantidadesMenores(int limite) throws Exception {
        if (stock.isEmpty()) {
            throw new Exception("   No hay stock de nada.");
        } else {
            int a = -1;
            for (Producto p : stock) {
                if (p.getCantidad() <= limite) {
                    int cant = p.getCantidad();
                    String name = p.getNombre();
                    System.out.println(name + " (" + cant + " unidades)");
                    a = 0;
                }
            }
            if (a == -1) {
                System.out.println("   Lo siento. No tenemos ese producto");
            }
            return true;
        }

    }

    public void CasosDePrueba() {
        Producto p1 = new Producto(1, "Leche", "Lacteos", 18);
        stock.add(p1);
        Producto p2 = new Producto(2, "Manzanas", "Frutas", 38);
        stock.add(p2);
        Producto p3 = new Producto(3, "Jamon York", "Embutidos", 3);
        stock.add(p3);
        Producto p4 = new Producto(4, "Guisantes", "Congelados", 40);
        stock.add(p4);
        Producto p5 = new Producto(5, "Galletas", "Desayuno", 4);
        stock.add(p5);
        Producto p6 = new Producto(6, "Queso", "Lacteos", 5);
        stock.add(p6);
        Producto p7 = new Producto(7, "Zumos", "Bebidas", 15);
        stock.add(p7);
    }

    @Override
    public String toString() {
        return "   Stock{" + "stock=" + stock + '}';
    }
}
