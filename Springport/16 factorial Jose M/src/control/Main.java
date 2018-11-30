package control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Logger logger=LogManager.getLogger("Main");
		logger.debug("App started");
		System.out.println("Introduce tu dato");
		Prueba p1=new Prueba();
		p1.prueba2();
	}

}
