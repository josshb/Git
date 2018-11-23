package modelo;

/**
 *
 * @author Antonio Santos
 */
public class MenuDia {

    private String diaSemana;
    //Tengo primeros, segundos y postres
    private ListaPlatos[] menu = new ListaPlatos[3];

    public MenuDia() {
    }

    public MenuDia(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public MenuDia(String dia, ListaPlatos primeros, ListaPlatos segundos, ListaPlatos postres) {
        diaSemana = dia;
        menu[0] = primeros;
        menu[1] = segundos;
        menu[2] = postres;
    }

    public MenuDia(ListaPlatos primeros, ListaPlatos segundos, ListaPlatos postres) {
        menu[0] = primeros;
        menu[1] = segundos;
        menu[2] = postres;
    }

    public ListaPlatos[] getMenu() {
        return menu;
    }

    public void setMenu(ListaPlatos[] menu) {
        this.menu = menu;
    }

    public ListaPlatos getPrimeros() {
        return menu[0];
    }

    public ListaPlatos getSegundos() {
        return menu[1];
    }

    public ListaPlatos getPostres() {
        return menu[2];
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    //0 para primeros, 1 para segundos, 2 para postres
    public void annadirListaPlatos(ListaPlatos lista, int indice) {
        menu[indice] = lista;
    }

    @Override
    public String toString() {
        return "---MenuDia{" + "menu=" + menu + '}';
    }
}
