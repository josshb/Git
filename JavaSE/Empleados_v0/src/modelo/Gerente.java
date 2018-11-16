package modelo;

import java.util.Date;

/**
 *
 * @author Antonio
 */
public class Gerente extends Empleado {

    private double incentivo = 5.0d;

    public Gerente() {
    }

    public Gerente(String nombre, double salario, Date fecha_nac, double incentivo) {
        super(nombre, salario, fecha_nac);
        this.incentivo = incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public void incentivar() {
        double cantidad = getSalario() * (1 + incentivo / 100);
        super.setSalario(cantidad);
        System.out.println("Soy gerente y estoy incentivao: " + getSalario());
    }

    @Override
    public String toString() {
        String datos_emp = super.toString();
        return "Gerente{" + datos_emp + "incentivo=" + incentivo + '}';
    }
}
