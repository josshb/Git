package control;

import org.apache.logging.log4j.*;
public class MainEdades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger logger = LogManager.getLogger(MainEdades.class);
	 int edad=19;
	 final int mayoriaedad=18;
	 
	 if (edad>=mayoriaedad) {
		 logger.error("This is error : "); 
		 
		
	}else {
		 logger.error("This is error o no: "); 

	}
		
		
	}

}
