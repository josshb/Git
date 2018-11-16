package ejemplos;

import java.util.LinkedList;
import java.util.List;

public class ClaseParaDepurar {

    private double suma;
    private List<Double> lista;

    public ClaseParaDepurar() {
        System.out.println("construyendo clase");
    }
    public double echaCuentas() {
    	System.out.println("Voy a sumar del 1 al 100");
    	System.out.println("Primero los guardo y luego sumo");
        lista = new LinkedList<Double>();
        for (int i = 0; i<100;i++){
            lista.add((double)i);
        }
        suma = 0.0;
        for (Double valor : lista){
            suma +=Operaciones.formatear(valor);
        }
        return suma;
    }

}
