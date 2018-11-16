package utilidades;

import beans.Punto;

public class Geometria {
	
    public static void distanciaDosPuntos(Punto p1, Punto p2){
        System.out.println("-- calcular distancia");
        System.out.println("Punto 1: "+p1);
        System.out.println("Punto 2: "+p2);        
        double x = Math.pow((p1.getPx() - p2.getPx()),2);
        double y = Math.pow((p1.getPy() - p2.getPy()),2);        
        double dist = Math.sqrt(x+y);
        System.out.println("Distancia: "+dist);
    }
    
    public static void distanciaCentro(Punto p1){
        distanciaDosPuntos(p1,new Punto(0,0));
    }

}
