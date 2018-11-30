package control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import utilities.Factorializer;
import utilities.LeerDatos;

public class Prueba {
	Logger logger= LogManager.getLogger("Prueba");
	public void prueba1() throws Exception {
		logger.info(LeerDatos.leer());
	} 
	public void prueba2() throws Exception {
		logger.debug("Prueba 2");
		Factorializer f1=new Factorializer();
		f1.factorialize();
	}
}
