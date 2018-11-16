package datos;
import java.util.ArrayList;
import java.util.List;

import beans.ParqueNacional;


/**
 *
 * @author Antonio
 */
public class Kenia {
    
    private List<ParqueNacional> parques = new ArrayList<>();

    public Kenia() {
    }
    
    public void anadirParque(ParqueNacional p) {
        parques.add(p);
    }

    @Override
    public String toString() {
        String aux;
        aux = "Kenia{\n";
        for (ParqueNacional p : parques) {
            aux += "   " + p.toString();
            aux += "\n";
        }
        return aux;
    }
    
        public String nombresParques() {
        String aux;
        aux = "Kenia{\n";
        for (ParqueNacional p : parques) {
            aux += "   " + p.getNombre();
            aux += "\n";
        }
        return aux;
    }
}
