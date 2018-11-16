package beans;

import control.Visitable;

/**
 *
 * @author Antonio
 */

//debo sobreescribir los metodos visitar() y abrirParque().
//En caso contrario deberia declararla abstract

public class AreaProtegida extends ParqueNacional implements Visitable {

    private double subvencion;
    private String ONG;

    public AreaProtegida() {
    }

    public AreaProtegida(double subvencion, String ONG) {
        this.subvencion = subvencion;
        this.ONG = ONG;
    }

    public AreaProtegida(double subvencion, String ONG, String nombre, int extension, int numEspecies) {
        super(nombre, extension, numEspecies);
        this.subvencion = subvencion;
        this.ONG = ONG;
    }

    public String getONG() {
        return ONG;
    }

    public void setONG(String ONG) {
        this.ONG = ONG;
    }

    public double getSubvencion() {
        return subvencion;
    }

    public void setSubvencion(double subvencion) {
        this.subvencion = subvencion;
    }
    
    @Override
    public void abrirParque() {
        System.out.println("Abriendo area protegida " + this.getNombre());
    }

    @Override
    public String toString() {
        return "   AreaProtegida{\n" + 
                super.toString() + 
                "subvencion=" + subvencion + 
                ", ONG=" + ONG + '}';
    }
    
    @Override
    public String visitar() {
        return ("Visitando Area protegida " + this.getNombre());
    }    
}
