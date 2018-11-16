package control;

/**
 *
 * @author Antonio
 */
import utilidades.SimuladorLoto;
import utilidades.LecturaDatos;
import beans.Apuesta;

public class Test {

    public static void prueba1() {
        Apuesta a = new Apuesta();
        a.rellenarApuesta();
        a.leerApuesta();
    }

    public static void prueba2() {
        SimuladorLoto.variasApuestasLoto();
    }
}
