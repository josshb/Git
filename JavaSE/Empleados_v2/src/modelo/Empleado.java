package modelo;

import java.util.Date;

import utilidades.LeerTeclado;

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
    
    public Empleado(String nombre){
    	this.nombre=nombre;
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
    
    public void crearEmpleado() {
        this.nombre = LeerTeclado.leerLinea("Introduzca el nombre:");
        this.salario = LeerTeclado.leerDouble("Insalario:");
        this.fecha_nac = new Date();
    }
    
    

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", fecha_nac=" + fecha_nac + '}';
    }
}
