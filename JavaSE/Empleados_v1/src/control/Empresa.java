package control;

import java.util.Date;

import modelo.Director;
import modelo.Empleado;
import modelo.Gerente;
import gui.Menus;
import servicios.IServiciosEmpresa;
import servicios.ServiciosEmpresa;

public class Empresa {
	
	//atributos
	private IServiciosEmpresa servicios = new ServiciosEmpresa();
	

	
	public void start(){
		
		Empleado e1 = new Empleado("Luis", 1000.0d, new Date());
		Empleado e2 = new Empleado("Antonio", 1200.0d, new Date());
		Empleado e3 = new Empleado("Maria", 1400.0d, new Date());
		Empleado e4 = new Gerente("Pedro", 3000.0d, new Date(), 5.0);
		Empleado e5 = new Director("Olga", 6500.0d, new Date(), 10.0, true);
		
		servicios.addEmpleado(e1);
		servicios.addEmpleado(e2);
		servicios.addEmpleado(e3);
		servicios.addEmpleado(e4);
		servicios.addEmpleado(e5);	
		
		servicios.listado();
		
		((Gerente)e4).incentivar();
		((Director)e5).incentivar();	
		//System.out.println("-- a partir de aqui errores");
		//((Gerente)e5).incentivar();		
		//((Director)e4).incentivar();
		//((Director)e1).incentivar();
		

	}
	
	

}
