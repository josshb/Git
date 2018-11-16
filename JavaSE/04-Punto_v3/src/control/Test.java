package control;

import beans.Pixel;
import beans.Punto;

/**
 *
 * @author Antonio
 */
public class Test {

    public static void prueba1() {
        Punto p = new Punto();
        p.crearPunto();
        p.imprimeInforme();
    }
    
    public static void prueba2() {
        Punto p1 = new Punto();
        p1.crearPunto();
        p1.imprimeInforme();
        
        Pixel p2 = new Pixel();
        p2.crearPixel();
        p2.imprimeInforme();
        
        Pixel p3 = new Pixel(p1,"rojo");
        p3.imprimeInforme();
        
    }   
    
    public static void prueba3() {
        Punto p1 = new Punto(5,7);
        Punto p2 = new Punto(9,12);
        p1.distanciaDosPuntos(p2);
        p1.distanciaCentro();
    } 



}
