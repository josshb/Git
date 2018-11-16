package control;

import beans.AreaProtegida;
import beans.AreaProtegidaAcuatica;
import beans.AreaProtegidaTerrestre;
import beans.ParqueNacional;
import beans.ReservaCaza;
import datos.Kenia;

/**
 *
 * @author Antonio
 */
public class Principal {

    public static void main(String[] args) {
        Kenia kenia = new Kenia();

        ReservaCaza p1 = new ReservaCaza(1500, "fusil", "reserva de casa 1", 10000, 3000);
        ReservaCaza p2 = new ReservaCaza(2500, "escopeta", "reserva de casa 2", 5000, 2500);
        AreaProtegida p3 = new AreaProtegida(2000, "ONG 1", "Area Protegida 1", 1000, 1500);
        AreaProtegida p4 = new AreaProtegidaAcuatica(3000, "ONG 2", "Area Protegida 1000 lagos", 4000, 5500,1000);
        AreaProtegida p5 = new AreaProtegidaTerrestre(4000, "ONG 3", "Area Protegida Terrestre", 14000, 500,"arcilla");

        kenia.anadirParque(p1);
        kenia.anadirParque(p2);
        kenia.anadirParque(p3);
        kenia.anadirParque(p4);
        kenia.anadirParque(p5);

        System.out.println("---------------------");
        System.out.println("---TODOS LOS DATOS---");
        System.out.println("---------------------");
        System.out.println(kenia);
        System.out.println("\n\n------");
        System.out.println(kenia.nombresParques());
        

        System.out.println(p3.visitar());
        
        //elemnto = get();
        //elemtno.visitar();
    }
}
