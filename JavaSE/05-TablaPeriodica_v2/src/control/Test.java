package control;

import model.ElementoTablaPeriodica;

/**
 *
 * @author Antonio
 */


public class Test {


    
    public static void prueba1() {
    	ElementoTablaPeriodica e1 = new ElementoTablaPeriodica("Oro", "Au", (short) 79);
    	ElementoTablaPeriodica e2 = new ElementoTablaPeriodica("Plata", "Ag", (short) 47);
    	ElementoTablaPeriodica e3 = new ElementoTablaPeriodica("Wolframio", "W", (short) 74);
    	
    	System.out.println("He creado "+e1.getNumInstancias()+" elementos");
 
    }

}
