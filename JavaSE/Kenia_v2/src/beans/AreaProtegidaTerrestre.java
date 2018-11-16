package beans;

/**
 *
 * @author Antonio
 */
public class AreaProtegidaTerrestre extends AreaProtegida {
    
    private String tipoTerreno;

    public AreaProtegidaTerrestre() {
    }

    public AreaProtegidaTerrestre(double subvencion, String ONG, String tipoTerreno) {
        super(subvencion, ONG);
        this.tipoTerreno = tipoTerreno;
    }

    public AreaProtegidaTerrestre(double subvencion, String ONG, String nombre, int extension, int numEspecies, String tipoTerreno) {
        super(subvencion, ONG, nombre, extension, numEspecies);
        this.tipoTerreno = tipoTerreno;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    @Override
    public String toString() {
        return "   AreaProtegidaTerrestre{\n" + super.toString() + "TipoTerreno=" + tipoTerreno + '}';
    }
}
