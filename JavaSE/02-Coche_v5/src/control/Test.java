package control;

import beans.auto.Coche;
import beans.auto.Deportivo;
import beans.auto.Suv;

/**
 *
 * @author Antonio
 */
public class Test {
		/*
		 * crea un nuevo objeto que se llama coche
		 * la estructura sería:
		 * nombredeclase nombreinventado=new nombredelaclase
		 */
	//POR QUE HACE ESTE METODO STATIC
    public static void prueba1() {
    	/*
    	 * esto nos lleva a la clase coche
    	 */
        Coche coche = new Coche();
        /*
         * esto de abajo redirige a un metodo que se ha creado especificamente
         * donde se piden los datos del coche que quieres crear.
         */
        coche.crearCoche();
        coche.imprimeInforme();
    }
    
    public static void prueba1MasCorrecta() {
        Coche coche = factoriaCoches();
        coche.crearCoche();
        coche.imprimeInforme();
    }    
    
    public static Coche factoriaCoches(){
    	return new Deportivo();
    }

    //mejor mirar prueba 1
    public static void prueba2() {
        Coche coche = new Coche();
        coche.crearCoche();
        coche.imprimeInforme();

        Deportivo depor = new Deportivo();
        depor.crearDeportivo();
        //depor.imprimeInforme();        

        Suv todoterreno = new Suv();
        //todoterreno.crearTodoterreno();
        todoterreno.imprimeInforme();    
    }  
    
    
    
    // Para gente talludita de conocimientos
    
    public static Coche teDoyUnCoche(){
    	//return new Coche();
    	//Imaginate que siempre te doy un deportivo    	
    	return new Deportivo();
    }
    
    public static void prueba3() {
    	//Prueba de casting
    	Coche c1 = new Coche();
    	Deportivo d1 = new Deportivo();
    	Coche c2 = new Deportivo();
    	Deportivo d2;
    	
    	//Esto seria un error de asignacion
    	//d2= (Deportivo) teDoyUnCoche();
    	
    	//Deberiamos asegurarnos siempre. Usa un instaceOf
    	//Transparencia 102
    	if (teDoyUnCoche() instanceof Deportivo) {
    	    // Es un deportivo
    		d2 = (Deportivo) teDoyUnCoche();
    	}

    	
    }
}
