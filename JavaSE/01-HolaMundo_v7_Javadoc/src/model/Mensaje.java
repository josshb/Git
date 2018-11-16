package model;


/**
 * Clase Mensaje
 *
 * Contiene informacion de un mensaje
 *
 * @author Antonio
 * @version 1.0
 */

public class Mensaje {
	
	// ATRIBUTOS
	
	
    /**
     * Texto del mensaje
     */
	private String texto;
	
	// CONSTRUCTORES	
	
    /**
     * Constructor por defecto
     */	
	public Mensaje(){
		
	}
	
    /**
     * Constructor con 1 parametro
     * @param texto texto del mensaje
     */	
	public Mensaje(String texto){
		this.texto = texto;
	}

	
	
    // MÉTODOS PÚBLICOS
	 
    /**
     * devuelve el texto almacenado
     *     <ul>
     *          <li>texto: de tipo String</li>
     *          </ul>
     * @return texto (de tipo String)          
     */
	
	public String getTexto() {
		return texto;
	}

    /**
     * Modifica el valor del texto
     * @param texto: de tipo String
     * @return void: sin valor especifico
     */
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
    /**
     * Devuelve un valor al imprimir el objeto
     * @return String
     */
	public String toString(){
		return texto;
	}
	
	

}
