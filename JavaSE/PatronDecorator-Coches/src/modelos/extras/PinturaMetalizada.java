package modelos.extras;

import patron.AutoDecorator;
import patron.Vendible;

/**
 *
 * @author Antonio
 */
public class PinturaMetalizada extends AutoDecorator {

    public PinturaMetalizada(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + Pintura metalizada"; }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 1200; }
    
}
