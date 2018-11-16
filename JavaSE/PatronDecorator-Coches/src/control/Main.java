package control;

import patron.Vendible;
import modelos.OpelCorsa;
import modelos.RenaultClio;
import modelos.extras.Gasoil;
import modelos.extras.AireAcondicionado;
import modelos.extras.MP3Player;
import modelos.extras.PinturaMetalizada;
import modelos.extras.TechoSolar;

/**
 *
 * @author Antonio
 */
public class Main {

    public static void main(String[] args) {
        Vendible coche = new OpelCorsa();
        System.out.println(coche.getDescripcion());
        System.out.println("Precio base: " + coche.getPrecio()+"€");

        System.out.println("\n---- OFERTACA");

        coche = new Gasoil(coche);
        //coche = new TechoSolar(coche);
        System.out.println(coche.getDescripcion());
        System.out.println("Precio con extras: " + coche.getPrecio() + "€\n");
        
        System.out.println("------------------------------");

        Vendible coche2 = new RenaultClio();
        System.out.println(coche2.getDescripcion());
        System.out.println("Precio base: " + coche2.getPrecio()+"€");

        System.out.println("\n---- OFERTACA");

        coche2 = new MP3Player(coche2);
        coche2 = new Gasoil(coche2);
        coche2 = new AireAcondicionado(coche2);
        coche2 = new PinturaMetalizada(coche2);

        System.out.println(coche2.getDescripcion());
        System.out.println("Precio con extras: " + coche2.getPrecio()+"€");

    }

}
