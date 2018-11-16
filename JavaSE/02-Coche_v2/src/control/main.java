package control;

import beans.Coche;
import beans.Deportivo;
import beans.Suv;

/**
 *
 * @author Moises  -> Antonio
 */
public class main {

    public static void main(String[] args) {
        // primer coche
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        coche1.equals(coche2);
 
        
        
        
        
        
        coche1.setMarca("Seat");
        coche1.setModelo("Ibiza");
        coche1.setColor("Blanco");
        coche1.setCombustible("Diesel");
        coche1.setNumPuertas(5);
        coche1.setPotencia(90);
        coche1.setConsumoGas(4);
        System.out.println(coche1);
        
        Coche c2 = new Coche("opel","corsa", "plata");

        //coche deportivo
        Deportivo depor = new Deportivo();
        depor.setMarca("Ferrari");
        depor.setModelo("250 gto");
        depor.setColor("rojo");
        depor.setCombustible("Diesel");
        depor.setNumPuertas(2);
        depor.setPotencia(300);
        depor.setConsumoGas(8);
        depor.setDescapotable(1);

        // public Deportivo(int descapotable, String marca, String modelo, String color, String combustible, int numPuertas, int potencia, int consumoGas) {
    
        Coche depor2 = new Deportivo(1, "Ferrari", "250 gto", "rojo", "diesel", 2, 300, 8);
        System.out.println(depor2);

        // COCHE SUV      
        Suv todoterreno = new Suv();
        todoterreno.setMarca("BMW");
        todoterreno.setModelo("X6");
        todoterreno.setColor("Gris");
        todoterreno.setCombustible("Diesel");
        todoterreno.setNumPuertas(4);
        todoterreno.setPotencia(30000);
        todoterreno.setConsumoGas(8);
        todoterreno.setTransmision(1);

        System.out.println(coche1);
        System.out.println(depor);
        System.out.println(todoterreno);

    }

}
