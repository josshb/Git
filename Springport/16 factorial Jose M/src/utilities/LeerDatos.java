package utilities;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeerDatos {
	
	public static long leer() throws Exception {
		Logger logger=LogManager.getLogger("LeerDatos");
		try { 
			logger.debug("Trying to read integer");
			return new Scanner(System.in).nextLong();
			
		} 
		
		catch (Exception e) {

			logger.info("Error, el dato debe ser un numero");
			return leer();
		}
		
	
	}
	
}
