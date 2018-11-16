package control;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;


public class MainMayores {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger logger = LogManager.getLogger(MainMayores.class);

		int edad=Asignador.asignar();
		final int MayoriaEdad=18;
		
		if (edad<=MayoriaEdad) {
			
			logger.error("eres menor a la hoguera");
			//System.out.println("eres menor a la hoguera");
			
			
		}else {
			logger.error("eres mayor de edad bienvenid@");
			//System.out.println("eres mayor de edad bienvenid@");
			
			

			
		}
	}

}
