package utilidades;

/**
 *
 * @author Antonio Santos
 */
public class Simulacion {

    public static String diaAleatorioLaborable() {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        int dia = (int) (Math.random() * dias.length);
        return dias[dia];
    }

    public static String diaAleatorio() {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int dia = (int) (Math.random() * dias.length);
        return dias[dia];
    }
    

}
