package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Numeros;

public class Factorializer {

	Logger logger=LogManager.getLogger("Factorializer");
 
	
	public long factorialize() throws Exception {
		long f=1;
		Numeros numero=new Numeros();
		logger.info("Introduce el numero a factorizar por favor:");
		
		numero.setNumero(LeerDatos.leer());
		long num=numero.getNumero();
		
	while (num != 0 ) {
		f=f*num;
		num--;
	}
	logger.info("El factorial del numero "+numero.getNumero()+"es "+ f);;
	return f;
	}
}
