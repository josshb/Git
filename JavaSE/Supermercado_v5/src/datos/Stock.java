package datos;

/**
 *
 * @author Antonio Santos
 */
import modelo.Producto;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import utilidades.Datos;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categorias;

public class Stock {

    //codigo, Producto
    private Map<Integer, Producto> stock;

    public Stock() {
        stock = new HashMap<>();
    }

    public Map<Integer, Producto> getStock() {
        return stock;
    }

    public void setStock(Map<Integer, Producto> stock) {
        this.stock = stock;
    }
    
    /*
    METODOS
    */

    public void ListarProductos() {
        Integer clave;
        Iterator<Integer> productos = stock.keySet().iterator();
        System.out.println("-- LISTADO DE PRODUCTOS --");
        while (productos.hasNext()) {
            clave = productos.next();
            System.out.println("[" + clave + "]: " + stock.get(clave));
        }
    }
    
    //Se puede hacer tan simple como el de Eliminar
    //El truco está en hacer más compleja la capa de servicios
    public boolean AddProducto(int codigo, Producto p) {
        if (stock.containsKey(codigo)) {
            System.out.println("No se puede guardar el producto. El código esta repetido.");
            return false;
        } else {
            stock.put(codigo, p);
            return true;
        }
    }    
    
    public boolean existeCodigo(int cod){
        return stock.containsKey(cod);
    }

    public void eliminarProducto(int cod) throws Exception {
            stock.remove(cod);
    }

    public boolean CantidadesProducto(int cod) throws Exception {
        if (stock.isEmpty()) {
            throw new Exception("   No hay stock. Está la cosa muy malita");
        } else if (stock.containsKey(cod)) {
            //Existe
            System.out.println(stock.get(cod).getNombre() + " (" + stock.get(cod).getCantidad() + " unidades)");
            return true;
        } else {
            System.out.println("   El supermercado no tiene ese producto");
            return false;
        }

    }

    public boolean CantidadesMenores(int limite) throws Exception {
        if (stock.isEmpty()) {
            throw new Exception("   No hay stock de nada. Estamos pelones");
        } else {
            Integer clave;
            Iterator<Integer> productos = stock.keySet().iterator();
            System.out.println("-- LISTADO DE PRODUCTOS CON CANTIDAD MENOR A " + limite + "  --");
            while (productos.hasNext()) {
                clave = productos.next();
                if (stock.get(clave).getCantidad() <= limite) {
                    System.out.println(stock.get(clave).getNombre() + "  (" + stock.get(clave).getCantidad() + " unidades)");
                }
            }
        }
        return true;
    }



    public void serializarStock(String fichero) {
        System.out.println("-- serializando");
        try {
            FileOutputStream f = new FileOutputStream(fichero);
            try (ObjectOutputStream s = new ObjectOutputStream(f)) {
                s.writeObject(stock);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deSerializarStock(String fichero) {
        System.out.println("-- Deserializando");
        try {
            File fich = new File(fichero);
            FileInputStream f = new FileInputStream(fich);
            try (ObjectInputStream s = new ObjectInputStream(f)) {
                stock = (Map<Integer, Producto>) s.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CasosDePrueba() {
        stock.put(1, new Producto("Leche", Categorias.Lacteos, 18));
        stock.put(2, new Producto("Manzanas", Categorias.Frutas, 38));
        stock.put(3, new Producto("Jamon York", Categorias.Embutidos, 3));
        stock.put(4, new Producto("Guisantes", Categorias.Congelados, 40));
        stock.put(5, new Producto("Galletas", Categorias.Desayuno, 4));
        stock.put(6, new Producto("Queso", Categorias.Lacteos, 5));
        stock.put(7, new Producto("Zumos", Categorias.Bebidas, 15));
    }

}
