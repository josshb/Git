package utilidades;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;

public class Mensaje {

	final Logger logger = LogManager.getLogger(Mensaje.class);
	
	
	private String Txtmenor;
	private String Txtmayor;
	
	
	
	public Mensaje(){
		
	}
	public Mensaje(String Txtmenor, String Txtmayor) {
		
	}
	

	public String getTxtmenor() {
		return Txtmenor;
		
	}
	public void setTxtmenor(String Txtmenor) {
		 logger.error("menor: ");
		this.Txtmenor=Txtmenor;
		
		
		
	}
	public void setTxtmayor(String Txtmayor) {
		 logger.error("mayor : ");
		this.Txtmayor=Txtmayor;
	}
	
	public String getTxtmayor() {
		return Txtmayor;
		
	}
	/*public void setTxtmayor(String Txtmayor){	
		logger.info("mayor de edad");
		this.Txtmayor=Txtmayor;
	
	}
	
	
	
	
	/*private static org.apache.logging.log4j.Logger logger;
	private String Txtmenor;
	private String Txtmayor;
	
	static {
		logger = LogManager.getLogger(Mensaje.class);
	}
	public static org.apache.logging.log4j.Logger getLogger() {
		return logger;
	}
	public static void setLogger(Logger logger) {
		logger.info("Mensaje");
	}
	
	public Mensaje(){
		
	}
	public Mensaje(String Txtmenor, String Txtmayor) {
		
	}
	

	public String getTxtmenor() {
		return Txtmenor;
		
	}
	public void setTxtmenor(String Txtmenor) {
		logger.log(null, "menor de edad");
		this.Txtmenor=Txtmenor;
		
		
		
	}
	
	
	public String getTxtmayor() {
		return Txtmayor;
		
	}
	/*public void setTxtmayor(String Txtmayor){	
		logger.info("mayor de edad");
		this.Txtmayor=Txtmayor;
	
	}
	*/
	
	
	

}