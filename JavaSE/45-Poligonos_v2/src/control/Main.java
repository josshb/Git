package control;

import datos_enum.Material;
import poligonos.PentagonoColoreado;
import poligonos.Poligono;
import poligonos.PoligonoColoreado;

/**
 *
 * @author Antonio
 */
public class Main {

    public static void main(String[] args) {
        Poligono pol1=new Poligono (Material.carton, 5);
        Poligono pol2=new Poligono (Material.plastico, 4);
        Poligono pol3=new PoligonoColoreado ("Rojo",Material.carton, 6);
        Poligono pol4=new PentagonoColoreado("Vitorio&Luccino","Blanco",Material.madera);
        
        System.out.println(pol1.toString());
        System.out.println(pol2.toString());
        System.out.println(pol3.toString());
        System.out.println(pol4.toString());
    }
}
