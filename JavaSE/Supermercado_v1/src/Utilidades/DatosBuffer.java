package Utilidades;

import java.io.*;

public class DatosBuffer {

    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public String recogeString() throws Exception {
        String dato = teclado.readLine();
        return dato;
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
