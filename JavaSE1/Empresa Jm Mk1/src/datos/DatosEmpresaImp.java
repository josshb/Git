package datos;

import java.util.ArrayList;
import java.util.List;

import modelo.Empleado;

public class DatosEmpresaImp implements IDatosEmpresa {

	private List<Empleado> personal=new ArrayList<>();
	
	
	
	
	public List<Empleado> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Empleado> personal) {
		this.personal = personal;
		
		
	}

	public void addEmpleado(Empleado e) {
		personal.add(e);
	}

	public void addEmpleado() {
		Empleado e=new Empleado();
		e.crearEmpleado();
		addEmpleado(e);
	}

	public int encontrarEmpleado(Empleado e) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void eliminarEmpleado(Empleado e) {
		// TODO Auto-generated method stub

	}

	public void eliminarEmpleado() {
		// TODO Auto-generated method stub

	}

	public boolean existeEmpleado(Empleado e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean existeEmpleado() {
		// TODO Auto-generated method stub
		return false;
	}

	public void modificarEmpleado(Empleado e) {
		// TODO Auto-generated method stub

	}

	public void modificarEmpleado() {
		// TODO Auto-generated method stub

	}

	public void casosDePrueba() {
		// TODO Auto-generated method stub

	}

	public void listado() {
		// TODO Auto-generated method stub

	}

}
