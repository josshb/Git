package Control;

/**
 *
 * @author Antonio Santos
 */
import Datos.Stock;
import Menus.Menu;
import Utilidades.Datos;

public class Supermercado {

    static boolean seguir = true;
    Stock stock = new Stock();

    public void abrirSupermercado() {
        Menu m = new Menu();
        do {
            m.Menu();
            this.datosSupermercado();
        } while (seguir);
        System.out.println("   --- Fin de la sesion ---");
    }

    public void datosSupermercado() {

        char n = 'N';

        try {
            int codigo;
            switch (Datos.recogeInt()) {
                case 1:
                    //ALTA DE UN PRODUCTO
                    stock.AñadirProducto();
                    break;

                case 2:
                    //ELIMINAR UN PRODUCTO
                    System.out.println("   Indica el código del producto a eliminar");
                    codigo = Datos.recogeInt();
                    stock.eliminarProducto(codigo);

                    break;

                case 3:
                    //LISTAR PRODUCTOS
                    stock.ListarProductos();
                    break;

                case 4:
                    //INDICAR CANTIDADES DE UN PRODUCTO
                    System.out.println("   Indica el código del producto del que quieres saber la cantidad");
                    codigo = Datos.recogeInt();
                    stock.CantidadesProducto(codigo);
                    break;


                case 5:
                    //LISTADO DE PRODUCTOS CON EXISTENCIAS MENORES DE 5
                    stock.CantidadesMenores(5);
                    break;

                case 6:
                    System.out.println("   ¿Está seguro?(S/N)");
                    String sino = Datos.recogeString();

                    seguir = (n != 'S');
                    n = sino.charAt(0);
                    break;

                case 7:
                    //CASOS DE PRUEBA
                    stock.CasosDePrueba();
                    break;
            }
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
        }

    }
}
