package Control;

import beins.auto.Coche;

/**
 *
 * @author Moises  -> Antonio
 */
public class main {

    public static void main(String[] args) {
        // primer coche
        Coche coche1 = new Coche();
        coche1.setColor("rojo");
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
       
    }

}
