package utilidades;

import java.io.*;

public class DatosBuffer {

    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static String recogeString() throws Exception {
        String dato = new BufferedReader(new InputStreamReader(System.in)).readLine();
        return dato;
    }
    
    public static String recogeString(String msg) throws Exception {
        System.out.println(msg);
        return recogeString();
    }    

    public int recogeInt() throws Exception {
        int dato = Integer.parseInt(teclado.readLine());
        return dato;
    }

    public double recogeDouble() throws Exception {
        double dato = Double.parseDouble(teclado.readLine());
        return dato;
    }
}
