package main;

/**
*
* @author Antonio
*/

import utilidades.LecturaDatos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	private static Logger logger;

	static {
		try {
			logger = LogManager.getLogger(Test.class);
		} catch (Throwable e) {
			System.out.println("Logger Don't work");
		}
	}

	public void test01() {
		
		logger.info("Inicio de la aplicacion-----");		

		System.out.println("Elige dos números para dividir");
		int num1 = LecturaDatos.LeerInt("Numero 1: ");
		int num2 = LecturaDatos.LeerInt("Numero 2: ");

		try {
			logger.trace("Comprobando si funciona el try-catch");
			logger.debug("Valor del denominador: "+num2);
			int div = num1 / num2;
			System.out.println("-- El valor de la division es: "+div);
			logger.debug("Valor de la division: "+div);			
		} catch (ArithmeticException e) {
			logger.error("Esta la cosa mu malita");
			logger.error(e.getMessage());
		} finally {
			//cuidado. el trace no tiene porque aparecer
	        logger.trace("Mensaje en Finally");
	        logger.debug("Mensaje en Finally");		
		}
		logger.info("Fin de la aplicacion");
	}

}
