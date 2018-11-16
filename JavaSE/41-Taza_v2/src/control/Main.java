package control;

/**
 *
 * @author Antonio
 */
import beans.Taza;
import beans.materiales.Cristal;
import beans.materiales.Porcelana;

public class Main {

    public static void main(String[] args) {

        Taza<Cristal> c1 = new Taza<>(new Cristal());
        
        //color, tamaño, precio
        Cristal c = new Cristal("esmerilado","pequeño",100);
        Taza<Cristal> c2 = new Taza<>(c);
        c2.getItem().getColor();
       
        
        Porcelana p = new Porcelana("Dinastia Ming",3000);
        Taza<Porcelana> c3 = new Taza<>(p);
        c3.getItem().getProcedencia();
        
        System.out.println("Taza c1: "+c1);
        System.out.println("Taza c2: "+c2);
        System.out.println("Taza c3: "+c3);        

    }

}
