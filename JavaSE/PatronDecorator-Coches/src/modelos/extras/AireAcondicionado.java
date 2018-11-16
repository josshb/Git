package modelos.extras;

import patron.AutoDecorator;
import patron.Vendible;

/**
 *
 * @author Antonio
 */
public class AireAcondicionado extends AutoDecorator {

    public AireAcondicionado(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + Aire acondicionado"; }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 1500; }
    
}
