package servicios;

import modelo.Empleado;

public interface IServiciosEmpresa {

	public void addEmpleado(Empleado p);
	public void addEmpleado();

	public int encontrarEmpleado(Empleado e);

	public void eliminarEmpleado();
	public void eliminarEmpleado(Empleado e);
	
	public boolean existeEmpleado();
	public boolean existeEmpleado(Empleado e);

	public void modificarEmpleado();
	public void modificarEmpleado(Empleado e);
	
	public void CasosDePrueba();

	public void listado();
}
