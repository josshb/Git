package control;

/**
 *
 * @author Antonio Santos
 */
import datos.Stock;
import gui.Menu;
import utilidades.Datos;

public class Supermercado {

    private Stock stock = new Stock();

    public void abrirSupermercado() {
        boolean seguir = true;
        do {
            Menu.mostrarMenu();
            seguir = this.seleccionOpciones();
        } while (seguir);
        System.out.println("   --- Fin de la sesion ---");
    }

    public boolean seleccionOpciones() {

        boolean continuar = true;

        try {
            switch (Datos.recogeInt()) {
                case 1:
                    //ALTA DE UN PRODUCTO
                    stock.AñadirProducto();
                    break;

                case 2:
                    //ELIMINAR UN PRODUCTO
                    stock.eliminarProducto();
                    break;

                case 3:
                    //LISTAR PRODUCTOS
                    stock.ListarProductos();
                    break;

                case 4:
                    //INDICAR CANTIDADES DE UN PRODUCTO
                    stock.CantidadesProducto();
                    break;

                case 5:
                    //LISTADO DE PRODUCTOS CON EXISTENCIAS MENORES DE 5
                    stock.CantidadesMenores(5);
                    break;

                case 6:
                    //CASOS DE PRUEBA
                    stock.CasosDePrueba();
                    break;

                case 7:
                    //SERIALIZAR
                    stock.serializarStock();
                    break;

                case 8:
                    //DESERIALIZAR
                    stock.deSerializarStock();
                    break;

                case 0:
                    continuar = salir();
                    break;
            }
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        return continuar;
    }

    private boolean salir() throws Exception {
        String sino = Datos.recogeString("   ¿Está seguro?(S/N)");
        return (sino.toUpperCase().charAt(0) != 'S');
    }

}
