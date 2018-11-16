package control;

import java.util.Date;

import modelo.Director;
import modelo.Empleado;
import modelo.Gerente;


public class Empresa {
	
	public void start(){
		
		Empleado e1 = new Empleado("Luis", 1000.0d, new Date());
		Empleado e2 = new Empleado("Antonio", 1200.0d, new Date());
		Empleado e3 = new Empleado("Maria", 1400.0d, new Date());
		Empleado e4 = new Gerente("Pedro", 3000.0d, new Date(), 5.0);
		Empleado e5 = new Director("Olga", 6500.0d, new Date(), 10.0, true);
		
		//PRUEBA
		//((Gerente)e4).incentivar();
			//^^^casting^^^^
		//((Director)e5).incentivar();
		
		// a partir de aqui hay errores... o no? (icono de persona pensando con mano en barbilla)
		System.out.println("-- antes");
		//((Gerente)e5).incentivar();		
		//((Director)e4).incentivar();
		//((Director)e1).incentivar();
		System.out.println("-- despues");		
		
		//Horrible
		//Habria que usar InstaceOf
		
		if (e4 instanceof Gerente){
			((Gerente)e4).incentivar();
		}
		
		

	}
	
	

}
