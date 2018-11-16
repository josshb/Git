package servicios;

import datos.DatosEmpresaImp;
import datos.IDatosEmpresa;
import modelo.Empleado;
import modelo.EmpleadoMaker;

// Como es nuestra primera incursion en el mundo de Servicios,
// vamos a pasarle el marron a la capa de Datos.
// En el futuro ya mejoraremos esta parte de Servicios
public class ServiciosEmpresa implements IServiciosEmpresa {
	
	private IDatosEmpresa datos = new DatosEmpresaImp();
	
	public void addEmpleado(Empleado p){
		datos.addEmpleado(p);
	}
	
	public void addEmpleado(){
		//Opcion 01
		datos.addEmpleado();
		
		//Opcion 02
		//datos.addEmpleado(new Empleado());
		
		//opcion 03  <-- la mas correcta
		//datos.addEmpleado(EmpleadoMaker.dameEmpleado());
	}	
	
	public void listado(){
		datos.listado();
	}

	@Override
	public int encontrarEmpleado(Empleado e) {
		return datos.encontrarEmpleado(e);
	}

	@Override
	public void eliminarEmpleado() {
		datos.eliminarEmpleado();
	}

	@Override
	public void eliminarEmpleado(Empleado e) {
		datos.eliminarEmpleado(e);
	}

	@Override
	public boolean existeEmpleado() {
		return datos.existeEmpleado();
	}

	@Override
	public boolean existeEmpleado(Empleado e) {
		return datos.existeEmpleado(e);
	}

	@Override
	public void modificarEmpleado() {
		datos.modificarEmpleado();
	}

	@Override
	public void modificarEmpleado(Empleado e) {
		datos.modificarEmpleado(e);
	}
	
	public void CasosDePrueba(){
		datos.CasosDePrueba();
	}

}
