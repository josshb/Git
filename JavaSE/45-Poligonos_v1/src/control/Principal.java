package control;

/**
 *
 * @author Antonio
 */
import poligonos.*;

public class Principal {

    public static void main(String[] args) {
        Poligono pol1=new Poligono (Material.carton, 5);
        Poligono pol2=new Poligono (Material.plastico, 4);
        Poligono pol3=new PoligonoColorado ("Rojo",Material.carton, 6);
        
        System.out.println(pol1.toString());
        System.out.println(pol2.toString());
        System.out.println(pol3.toString());
        
    }
}
