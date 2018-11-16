package beans;

/**
 *
 * @author Antonio
 */
public class AreaProtegidaAcuatica extends AreaProtegida {

    private int numLagos;

    public AreaProtegidaAcuatica() {
    }

    public AreaProtegidaAcuatica(double subvencion, String ONG, int numLagos) {
        super(subvencion, ONG);
        this.numLagos = numLagos;
    }

    public AreaProtegidaAcuatica(double subvencion, String ONG, String nombre, int extension, int numEspecies, int numLagos) {
        super(subvencion, ONG, nombre, extension, numEspecies);
        this.numLagos = numLagos;
    }

    public int getNumLagos() {
        return numLagos;
    }

    public void setNumLagos(int numLagos) {
        this.numLagos = numLagos;
    }

    @Override
    public String toString() {
        return "   AreaProtegidaAcuatica{\n" + super.toString() + "numLagos=" + numLagos + '}';
    }
}
