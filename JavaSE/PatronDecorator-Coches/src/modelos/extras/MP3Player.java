package modelos.extras;

import patron.AutoDecorator;
import patron.Vendible;

/**
 *
 * @author Antonio
 */
public class MP3Player extends AutoDecorator {

    public MP3Player(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + MP3Player"; }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 90; }
    
}
