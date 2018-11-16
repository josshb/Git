package patron;

/**
 *
 * @author Antonio
 */
public abstract class AutoDecorator implements Vendible {
    
    //Incluyo un objeto de esa interface
    private Vendible vendible;

    public AutoDecorator(Vendible vendible) {
        this.vendible = vendible;
    }

    public Vendible getVendible() {
        return vendible;
    }

    public void setVendible(Vendible vendible) {
        this.vendible = vendible;
    }
    
}
