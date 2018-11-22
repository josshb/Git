package datos;

import modelo.MenuDia;
import modelo.Plato;
import modelo.ListaPlatos;

/**
 *
 * @author Antonio Santos
 */
public class DAO {

    public DAO() {
    }

    public MenuDia consultarMenuDia() {

        String dia = "Martes";

        // Aqui se pedirian los datos mediante JDBC para crear la
        // estructura de platos.
        // Aqui simplificamos y lo hacemos 'a pelo'

        //El dia me vendra dado en algun sitio
        MenuDia menu = new MenuDia(dia);

        ListaPlatos primeros = new ListaPlatos();
        ListaPlatos segundos = new ListaPlatos();
        ListaPlatos postres = new ListaPlatos();

        primeros.anadirPlato(new Plato("lentejas"));
        primeros.anadirPlato(new Plato("huevos"));
        primeros.anadirPlato(new Plato("ensalada"));

        segundos.anadirPlato(new Plato("filete"));
        segundos.anadirPlato(new Plato("merluza"));
        segundos.anadirPlato(new Plato("cordero"));

        postres.anadirPlato(new Plato("flan"));
        postres.anadirPlato(new Plato("fruta"));
        postres.anadirPlato(new Plato("helado"));

        menu.annadirListaPlatos(primeros, 0);
        menu.annadirListaPlatos(segundos, 1);
        menu.annadirListaPlatos(postres, 2);

        return menu;
    }
}