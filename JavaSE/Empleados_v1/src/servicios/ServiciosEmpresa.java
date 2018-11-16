package servicios;

import datos.DatosEmpresaImp;
import datos.IDatosEmpresa;
import modelo.Empleado;
import modelo.EmpleadoMaker;

public class ServiciosEmpresa implements IServiciosEmpresa {
	
	private IDatosEmpresa datos = new DatosEmpresaImp();
	
	public void addEmpleado(Empleado p){
		datos.addEmpleado(p);
	}
	
	public void addEmpleado(){
		//Opcion 01
		//datos.addEmpleado();
		
		//Opcion 02
		//datos.addEmpleado(new Empleado());
		
		//opcion 03
		datos.addEmpleado(EmpleadoMaker.dameEmpleado());
	}	
	
	public void listado(){
		datos.listado();
	}

}
