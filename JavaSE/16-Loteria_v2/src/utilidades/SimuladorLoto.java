package utilidades;

/**
 *
 * @author Antonio
 */
public class SimuladorLoto {

    public void rellenarBoletoCompleto() {
        variasApuestasLoto(8);
    }

    public static void variasApuestasLoto(int numApuestas) {
        for (int i = 1; i <= numApuestas; i++) {
            System.out.println("--------------------");
            System.out.println("  APUESTA NUMERO " + i);
            System.out.println("--------------------");
            simuladorApuestaloto();
        }
    }

    public static void variasApuestasLoto() {
        int apuestas = LecturaDatos.leerInt("¿Cuantas apuestas?");
        variasApuestasLoto(apuestas);
    }

    public static void simuladorApuestaloto() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Num(0" + i + "): " + Simuladores.randBetween(1, 49));
        }
    }

    public static boolean noEsta(int valor, int[] aux) {
        boolean norepe = true;
        for (int i = 0; i < aux.length; i++) {
            if (valor == aux[i]) {
                norepe = false;
            }
        }
        return norepe;
    }

    public static int[] simuladorApuestalotoNoRepes() {
        int[] aux = new int[6];
        for (int i = 0; i < 6; i++) {
            int valor = Simuladores.randBetween(1, 49);
            boolean noesta = false;
            do {
                noesta = noEsta(valor, aux);
                if (noesta) {
                    aux[i] = valor;
                }
                else{
                    valor = Simuladores.randBetween(1, 49);
                }
            } while (noesta==false);
        }
        return aux;
    }
}
