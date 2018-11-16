package datos;

import modelo.Empleado;

public interface IDatosEmpresa {
	
	public void addEmpleado(Empleado p);
	//Esta no me hace falta. Lo soluciona la Logica de negocio
	//public void addEmpleado();
	public void listado();
}
