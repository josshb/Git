package servicios;

import modelo.Empleado;

public interface IServiciosEmpresa {
	public void addEmpleado(Empleado p);
	public void addEmpleado();
	
	public int encontrarEmpleado(Empleado e);
	
	public void eliminarEmpleado(Empleado e);
	public void eliminarEmpleado();
	
	public boolean existeEmpleado(Empleado e);
	public boolean existeEmpleado();
	
	public void modificarEmpleado(Empleado e);
	public void modificarEmpleado();
	
	public void casosDePrueba();
	
	public void listado();
	
	

}
