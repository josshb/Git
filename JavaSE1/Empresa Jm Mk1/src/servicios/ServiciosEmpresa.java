package servicios;

import datos.DatosEmpresaImp;
import datos.IDatosEmpresa;
import modelo.Empleado;

public class ServiciosEmpresa implements IServiciosEmpresa {
	private IDatosEmpresa datos=new DatosEmpresaImp();
	
	@Override
	public void addEmpleado(Empleado p) {
		// TODO Auto-generated method stub
		
	}
	datos.addEmpleado(e);
	
	
	@Override
	public void addEmpleado() {
		datos.addEmpleado();
		
	}

	@Override
	public int encontrarEmpleado(Empleado e) {
		
		return datos.encontrarEmpleado(e);
	}

	@Override
	public void eliminarEmpleado(Empleado e) {
		datos.eliminarEmpleado(e);
	}

	@Override
	public void eliminarEmpleado() {
		datos.eliminarEmpleado();
	}

	@Override
	public boolean existeEmpleado(Empleado e) {

		return datos.existeEmpleado(e);
	}

	@Override
	public boolean existeEmpleado() {
		datos.existeEmpleado();
		return false;
	}

	@Override
	public void modificarEmpleado(Empleado e) {
		datos.modificarEempleado(e);
	}

	@Override
	public void modificarEmpleado() {
		datos.modificarEmpleado();
	}

	@Override
	public void casosDePrueba() {
		datos.casosDePrueba();
	}

	@Override
	public void listado() {
		datos.listado();
	}

}
