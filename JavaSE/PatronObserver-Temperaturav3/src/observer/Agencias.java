package observer;

import java.util.Observer;

/**
 *
 * @author Antonio
 */
public abstract class Agencias implements Observer {

    private String nombre;

    public Agencias() {
    }

    public Agencias(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
