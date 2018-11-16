package modelo;

import java.util.Date;

/**
 *
 * @author Antonio
 */
public class Empleado {

    private String nombre;
    private double salario;
    private Date fecha_nac;
    //private Departamento dep;

    public Empleado() {
    }

    public Empleado(String nombre, double salario, Date fecha_nac) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha_nac = fecha_nac;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", fecha_nac=" + fecha_nac + '}';
    }
}
