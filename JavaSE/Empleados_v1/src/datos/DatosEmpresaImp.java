package datos;

import java.util.ArrayList;
import java.util.List;

import  modelo.Empleado;

public class DatosEmpresaImp implements IDatosEmpresa {
	
	private List<Empleado> lista = new ArrayList<>();
		//   palabra reservada <nombre de>
	public void addEmpleado(Empleado p){
		lista.add(p);
	}
	
	public void listado(){
		for(Empleado p:lista){
			System.out.println(p.getNombre());
		}

	}
	//Y asi 42 métodos más


}
