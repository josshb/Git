package control;

/**
 *
 * @author Antonio
 */
import beans.Taza;
import beans.Coche;

public class Main {

    public static void main(String[] args) {

        Taza<String> c1 = new Taza<>("plato");
        Taza<Integer> c2 = new Taza<>(123);
        Taza<Double> c3 = new Taza<>(3.1415);

        String s = c1.getItem();
        Integer x = c2.getItem();
        Double d = c3.getItem();

        //el resto son sin sentido
        Taza<Coche> c4 = new Taza<>();
        Taza<Coche> c5 = new Taza<>(new Coche());

        Coche c = new Coche();
        Taza<Coche> c6 = new Taza<>(c);
        
        // igual a      c.setVelocidad(120);
        c6.getItem().setVelocidad(120);
        Taza<Coche> c7 = new Taza<>(c.dameCoche());
        Taza<Integer> c8 = new Taza<>(c.getVelocidad());
        System.out.println("---c9");
        Taza<Coche> c9 = new Taza<>(c,c.toString());
        //Taza<Coche> c10 = new Taza<>(c.getVelocidad());
        
        //Existen tazas antropotazas?
        Taza<Taza> c11 = new Taza<>();     
        c11.getItem().getItem();
        
    }

}
