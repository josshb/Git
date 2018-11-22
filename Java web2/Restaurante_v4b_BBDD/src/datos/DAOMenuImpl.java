package datos;

import utilidades.ConexionDB;
import modelo.MenuDia;
import modelo.Plato;
import modelo.ListaPlatos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Antonio Santos
 */
public class DAOMenuImpl implements DAOMenu {

    private Connection con;

    public DAOMenuImpl() {
    	System.out.println("-- constructor DAO");
    }

    @Override
    public MenuDia consultarMenuDia() {
    	System.out.println("-- en consultarMenu");
        String dia = utilidades.Simulacion.diaAleatorioLaborable();
        //De momento cojo los platos de un dia normal
        MenuDia menu = new MenuDia(dia);
        ListaPlatos primeros = new ListaPlatos();
        ListaPlatos segundos = new ListaPlatos();
        ListaPlatos postres = new ListaPlatos();
        menu.annadirListaPlatos(primeros, 0);
        menu.annadirListaPlatos(segundos, 1);
        menu.annadirListaPlatos(postres, 2);

        try (ResultSet rs = obtenerMenu(dia)) {
            while (rs.next()) {

                if (rs.getString(2).equals("primero")) {
                    primeros.anadirPlato(new Plato(rs.getString(3)));
                }
                if (rs.getString(2).equals("segundo")) {
                    segundos.anadirPlato(new Plato(rs.getString(3)));
                }
                if (rs.getString(2).equals("postre")) {
                    postres.anadirPlato(new Plato(rs.getString(3)));
                }
            }
            return menu;
        } catch (Exception e) {
            System.out.println("Problema: " + e);
        } finally {
            return menu;
        }
    }

    public ResultSet obtenerMenu(String dia) {

        ResultSet rs = null;
        Statement st = null;

        String q1 = "select menu_nombre AS TipoMenu, mp_tipo AS Orden, plato_nombre AS Plato";
        String q2 = " from menus, platos, menus_platos";
        String q3 = " where menus.menu_id = menus_platos.menu_id and";
        String q4 = " platos.plato_id = restaurante.menus_platos.plato_id and";
        String q5 = " menu_nombre like '" + dia + " normal" + "%'";
        String q6 = " order by menu_nombre DESC, menus_platos.plato_id ASC;";

        String query = q1 + q2 + q3 + q4 + q5 + q6;

        System.out.println(query);

        //Obtengo la conexion
        try {
            // Busco el objeto para hacer la conexion
            con = ConexionDB.getConection();
            ConexionDB.getConection();

            st = con.createStatement();
            rs = st.executeQuery(query);
            //stm.close();
            //con.close();
        } catch (SQLException E) {
            System.out.println("Excepcion SQL: " + E.getMessage());
            System.out.println("Estado SQL: " + E.getSQLState());
            System.out.println("Código del Error: " + E.getErrorCode());
        }
        return rs;
    }

}
