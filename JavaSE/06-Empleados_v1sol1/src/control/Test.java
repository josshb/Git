package control;

import modelo.Departamento;
import modelo.Empleado;
import modelo.Director;

/**
 *
 * @author formador
 */
public class Test {

	public static void prueba1() {

		Empleado e1 = new Empleado("Antonio", "Santos", "Can Buixas 16", "123w");
		Empleado e2 = new Empleado("Antonio2", "Santos2", "Anabel Segura", "1234w");
		Departamento d1 = new Departamento("RRHH", "BCN", "1234");
		Director dire1 = new Director(e2,d1);
		e1.setDep(d1);
		System.out.println(d1);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(dire1);		
		
	}

}
