package modelos.extras;

import patron.AutoDecorator;
import patron.Vendible;

public class TechoSolar extends AutoDecorator {

    public TechoSolar(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + Techo Solar"; }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 15000; }
    
}