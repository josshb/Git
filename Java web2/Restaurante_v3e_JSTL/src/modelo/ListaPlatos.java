package modelo;

import java.io.*;
import java.util.*;

/**
 *
 * @author Antonio Santos
 */
public class ListaPlatos implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// aqui guardare listados de platos del mismo tipo: primeros, segundos, postres,..
    private List<Plato> listaPlatos = new ArrayList<>();

    public ListaPlatos() {
    }

    public List<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(List<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    public void anadirPlato(Plato plato) {
        listaPlatos.add(plato);
    }

    public void vaciarListaPlatos() {
        listaPlatos.clear();
    }

    public Plato darPlatos(int posicion) {
        return listaPlatos.get(posicion);
    }

    @Override
    public String toString() {
        String aux = "";
        for (Plato plato : listaPlatos) {
            aux += plato + " / ";
        }
        return "Platos{" + aux + '}';
    }
}
