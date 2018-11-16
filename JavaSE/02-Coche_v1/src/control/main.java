package control;

import beans.auto.Coche;
import beans.auto.Deportivo;
import beans.auto.Suv;

/**
 *
 * @author Moises -> Antonio
 */
public class main {

    public static void main(String[] args) {
        // primer coche
        Coche coche1 = new Coche();
        coche1.setMarca("Seat");
        coche1.setModelo("Ibiza");
        coche1.setColor("Blanco");
        coche1.setCombustible("Diesel");
        coche1.setNumPuertas(5);
        coche1.setPotencia(90);
        coche1.setConsumoGas(4);
        System.out.println("La marca del coche es " + coche1.getMarca());
        System.out.println("El modelo es " + coche1.getModelo());
        System.out.println("El color es " + coche1.getColor());
        System.out.println("El tipo de combustible es " + coche1.getCombustible());
        System.out.println("Numero de puertas es " + coche1.getNumPuertas());
        System.out.println("Su potencia es  " + coche1.getPotencia() + " CV");
        System.out.println("Su consumo de 1 a 10 es " + coche1.getConsumoGas());
        System.out.println("");
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
        System.out.println("La marca del coche es " + depor.getMarca());
        System.out.println("El modelo es " + depor.getModelo());
        System.out.println("El color es " + depor.getColor());
        System.out.println("Es descapotable 1: - Si y  2: -No " + depor.getDescapotable());
        System.out.println("El tipo de combustible es " + depor.getCombustible());
        System.out.println("Numero de puertas es " + depor.getNumPuertas());
        System.out.println("Su potencia es  " + depor.getPotencia() + " CV");
        System.out.println("Su consumo de 1 a 10 es " + depor.getConsumoGas());
        System.out.println("");

        // COCHE SUV      
        Suv todoterreno = new Suv();
        todoterreno.setMarca("Ferrari");
        todoterreno.setModelo("250 gto");
        todoterreno.setColor("rojo");
        todoterreno.setCombustible("Diesel");
        todoterreno.setNumPuertas(2);
        todoterreno.setPotencia(300);
        todoterreno.setConsumoGas(8);
        todoterreno.setTransmision(1);
        System.out.println("La marca del coche es " + todoterreno.getMarca());
        System.out.println("El modelo es " + todoterreno.getModelo());
        System.out.println("El color es " + todoterreno.getColor());
        System.out.println("1- 4 x 4 y 2- 4 x 2 " + todoterreno.getTransmision());
        System.out.println("El tipo de combustible es " + todoterreno.getCombustible());
        System.out.println("Numero de puertas es " + todoterreno.getNumPuertas());
        System.out.println("Su potencia es  " + todoterreno.getPotencia() + " CV");
        System.out.println("Su consumo de 1 a 10 es " + todoterreno.getConsumoGas());

    }

}
