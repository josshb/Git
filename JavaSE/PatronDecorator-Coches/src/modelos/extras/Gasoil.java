package modelos.extras;

import patron.AutoDecorator;
import patron.Vendible;

/**
 *
 * @author Antonio
 */
public class Gasoil extends AutoDecorator {

    public Gasoil(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + Gasoil"; }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 900; }
    
}
