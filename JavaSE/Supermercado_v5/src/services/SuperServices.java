package services;

import datos.Stock;
import modelo.Producto;
import utilidades.Datos;

/**
 *
 * @author Antonio
 */
public class SuperServices {

    private Stock stock = new Stock();

    public boolean AddProducto() {
        Producto p = new Producto();
        p.crearProducto();
        return this.AddProducto(p);
    }

    public boolean AddProducto(Producto p) {
        //Habria que decidir un algoritmo de códigos (una funciona Hash)
        return stock.AddProducto((int) (Math.random() * 100000), p);
    }

    //Esto hace que el metodo de Datos sea m´s sencillo.. pero compkica la capa servicios
    public boolean eliminarProducto() throws Exception {
        int codigo = Datos.recogeInt("   Indica el código del producto a eliminar");

        if (stock.existeCodigo(codigo)) {
            stock.eliminarProducto(codigo);
            System.out.println("   Producto eliminado");
            return true;
        } else {
            System.out.println("   El supermercado no tiene ese producto");
            return false;
        }
    }

    public void ListarProductos() {
        stock.ListarProductos();
    }

    public boolean CantidadesProducto() throws Exception {
        int codigo = Datos.recogeInt("   Indica el código del producto del que quieres saber la cantidad");
        return stock.CantidadesProducto(codigo);
    }

    public void CantidadesMenores(int cant) throws Exception {
        stock.CantidadesMenores(cant);
    }

    public void CasosDePrueba() {
        stock.CasosDePrueba();
    }

    public void serializarStock() {
        //Por defecto
        stock.serializarStock("listado_stock.dat");
    }

    public void deSerializarStock() {
        //Por defecto
        stock.deSerializarStock("listado_stock.dat");
    }
}
