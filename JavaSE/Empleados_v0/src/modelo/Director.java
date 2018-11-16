package modelo;

import java.util.Date;

/**
 *
 * @author Antonio
 */
public class Director extends Empleado {

    private double incentivo = 10.0d;
    private double incremento = 100.0d;
    private boolean coche = true;
    //private Departamento depDirigido;

    public Director() {
    }

    public Director(String nombre, double salario, Date fecha_nac, double incentivo, boolean coche) {
        super(nombre, salario, fecha_nac);
        this.incentivo = incentivo;
        this.coche = coche;
    }

    public boolean isCoche() {
        return coche;
    }

    public void setCoche(boolean coche) {
        this.coche = coche;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }
    public void incentivar() {
        double cantidad = getSalario() * (1 + incentivo / 100);
        this.setSalario(cantidad);
        System.out.println("Soy director y estoy incentivadisimo: " + getSalario());
    }    

    @Override
    public String toString() {
        String datos_emp = super.toString();
        return "Director{" + datos_emp + "incentivo=" + incentivo + ", incremento=" + incremento + ", coche=" + coche + '}';
    }
}
