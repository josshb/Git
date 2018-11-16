package control;

import beans.auto.Coche;
import beans.auto.Deportivo;
import beans.auto.Suv;
import utilidades.LecturaDatos;

/**
 *
 * @author Moises  -> Antonio
 */
public class Main {

    public static void main(String[] args) {
        // primer coche
        Coche coche1 = new Coche();
        System.out.println("Digame la marca");
        coche1.setMarca(LecturaDatos.leerString());
        System.out.println("Digame el modelo");
        coche1.setModelo(LecturaDatos.leerString());
        System.out.println("Digame el combustible");
        coche1.setCombustible(LecturaDatos.leerString());
        System.out.println("Digame el numero de puertas");
        coche1.setNumPuertas(LecturaDatos.leerInt());  
        //...
        
        // Problema
        // Muchas cosas en el main()
        // Un main deberia tener solo 3-6 lineas
        // No reutiilizable lo del main()
        
        //... deberiamos borrar ya el resto, ¿no?
        coche1.setModelo("Ibiza");
        coche1.setColor("Blanco");
        coche1.setCombustible("Diesel");
        coche1.setNumPuertas(5);
        coche1.setPotencia(90);
        coche1.setConsumoGas(4);

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

        Coche depor2 = new Deportivo("Ferrari", "250 gto", "rojo", "diesel", 2, 300, 8,1);
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
