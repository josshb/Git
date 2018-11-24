package modelo;

import java.io.*;

/**
 *
 * @author Antonio santos
 */
public class Pedido implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String primero;
    private String segundo;
    private String postre;

    public Pedido() {
    }

    public String getPrimero() {
        return primero;
    }

    public void setPrimero(String primero) {
        this.primero = primero;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }
}
