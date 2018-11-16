package servicios;

import modelo.Empleado;

public interface IServiciosEmpresa {

	public void addEmpleado(Empleado p);
	//Ojo. Esta no se incluye en la interface de Datos
	public void addEmpleado();
	public void listado();
}
