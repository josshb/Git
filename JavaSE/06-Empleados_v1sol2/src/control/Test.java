package control;

import java.util.ArrayList;
import java.util.List;

import modelo.Departamento;
import modelo.Empleado;

/**
 *
 * @author formador
 */
public class Test {

	public static void prueba1() {

		
		Empleado dire1 = new Empleado("Antonio3", "Santos3", "cualquier cosa", "12345w");
		Departamento d1 = new Departamento("RRHH", "BCN", "1234",dire1);
		
		//Prueba para hacer un listado de empleados
		List<Empleado>  l1 = new ArrayList<>();
		Empleado e1 = new Empleado("Antonio", "Santos", "Can Buixas 16", "123w");
		Empleado e2 = new Empleado("Antonio2", "Santos2", "Anabel Segura", "1234w");
		l1.add(e1);
		l1.add(e2);	
		d1.setListaEmpleados(l1);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(dire1);
		System.out.println(d1);		
		
	}

}
