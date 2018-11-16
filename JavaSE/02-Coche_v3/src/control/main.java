package control;

import java.util.Scanner;

import beans.auto.Coche;
import beans.auto.Deportivo;
import beans.auto.Suv;
import utilidades.LecturaDatos;

/**
 *
 * @author Moises  -> Antonio
 */
public class main {

    public static void main(String[] args) {
        // primer coche
        Coche coche1 = new Coche();
        
        //v1
        Scanner teclado = new Scanner(System.in);
        String val1 = teclado.next();
        coche1.setMarca(val1);
        
        //v2
        LecturaDatos ld = new LecturaDatos();
        String val2 = ld.leerString();
        coche1.setMarca(val2);
        
        //v3
        LecturaDatos ld1 = new LecturaDatos();    
        coche1.setMarca(ld.leerString());
        
        //v4
        coche1.setMarca(new LecturaDatos().leerString());
        
        //v5
        coche1.setMarca(LecturaDatos.leerString1());
        
        
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
