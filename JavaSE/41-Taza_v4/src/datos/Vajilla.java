package datos;

import beans.Taza;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mañana
 */
public class Vajilla {

    private Set<Taza> juegoDeTazas = new HashSet();

    public Vajilla() {
    }

    public Set getJuegoDeTazas() {
        return juegoDeTazas;
    }

    public void setJuegoDeTazas(Set juegoDeTazas) {
        this.juegoDeTazas = juegoDeTazas;
    }

    public void anadir(Taza t) {
        juegoDeTazas.add(t);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Taza t : juegoDeTazas) {
            sb.append(",");
            sb.append(t);
        }
        return sb.toString();
    }

}
