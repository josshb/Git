package utilidades;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class LecturaDatos {
	

    //metodo estatico
    @SuppressWarnings("resource")
	public static String leerString() {
        return new Scanner(System.in).nextLine();
    }

    public static String leerString(String msg) {
        System.out.println(msg);
        //Llama al metodo de arriba
        return leerString();
    }

    @SuppressWarnings("resource")
	public static int leerInt() {
        return new Scanner(System.in).nextInt();
    }
    
        public static int leerInt(String msg) {
        System.out.println(msg);
        //Llama al metodo de arriba
        // return new Scanner(System.in).nextLine();
        return leerInt();
    }

}
