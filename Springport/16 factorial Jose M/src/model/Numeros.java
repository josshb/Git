package model;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Numeros {
	Logger logger=LogManager.getLogger("Numeros");
	private long numero;

	

	public void setNumero(long numero) throws Exception {
		logger.debug("setNumero Method");
		this.numero = numero;
	}
	public long getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Numeros [numero=" + numero + "]";
	}
	
	
}
