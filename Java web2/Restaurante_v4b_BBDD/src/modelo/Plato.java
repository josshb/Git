package modelo;

import java.io.*;

/**
 *
 * @author Antonio Santos
 */
public class Plato implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
    private int calorias;
    private boolean conCuchara;
    // tipo:primero, segundo, postre
    private String tipo;

    public Plato() {
    }

    public Plato(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Plato(String nombre) {
        this.nombre = nombre;
    }

    public Plato(String nombre, int calorias, boolean conCuchara, String tipo) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.conCuchara = conCuchara;
        this.tipo = tipo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public boolean isConCuchara() {
        return conCuchara;
    }

    public void setConCuchara(boolean conCuchara) {
        this.conCuchara = conCuchara;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
