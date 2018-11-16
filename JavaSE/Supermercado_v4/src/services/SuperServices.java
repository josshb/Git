package services;

import datos.Stock;

/**
 *
 * @author Antonio
 */
public class SuperServices {

    private Stock stock = new Stock();

    public void AddProducto() {
        stock.AddProducto();
    }

    public void eliminarProducto() throws Exception {
        stock.eliminarProducto();
    }

    public void ListarProductos() {
        stock.ListarProductos();
    }

    public void CantidadesProducto() throws Exception {
        stock.CantidadesProducto();
    }

    public void CantidadesMenores(int cant) throws Exception {
        stock.CantidadesMenores(cant);
    }

    public void CasosDePrueba() {
        stock.CasosDePrueba();
    }

    public void serializarStock() {
        stock.serializarStock();
    }

    public void deSerializarStock() {
        stock.deSerializarStock();
    }
}
