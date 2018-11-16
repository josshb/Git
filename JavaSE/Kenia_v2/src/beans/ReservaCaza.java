package beans;

/**
 *
 * @author Antonio
 */
public class ReservaCaza extends ParqueNacional {

    private double costeLicencia;
    private String tipoArma;

    public ReservaCaza() {
    }

    public ReservaCaza(String nombre, int extension, int numEspecies) {
        super(nombre, extension, numEspecies);
    }

    public ReservaCaza(double costeLicencia, String tipoArma, String nombre, int extension, int numEspecies) {
        super(nombre, extension, numEspecies);
        this.costeLicencia = costeLicencia;
        this.tipoArma = tipoArma;
    }

    public double getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(double costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    @Override
    public void abrirParque() {
        System.out.println("Abriendo Reserva de caza" + this.getNombre());
    }

    @Override
    public String toString() {
        return "   ReservaCaza{\n" + "   "+super.toString() + "costeLicencia=" + costeLicencia + ", tipoArma=" + tipoArma + '}';
    }
}
