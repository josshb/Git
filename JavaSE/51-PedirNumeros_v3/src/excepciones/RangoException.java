package excepciones;

public class RangoException extends Exception {

	/**
	 * 
	 */

	/**
	 * @author Antonio
	 */

	private int valor;

	public RangoException() {

	}

	public RangoException(int valor) {
		super();
		this.valor = valor;
	}

	@Override
	public String toString() {
		
		return "------------PROBLEMA: Valor no correcto: " + valor;
	}

}
