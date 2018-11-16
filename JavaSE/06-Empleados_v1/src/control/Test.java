package control;

import modelo.Departamento;
import modelo.Empleado;

/**
 *
 * @author Antonio
 */
public class Test {

	public static void prueba1() {

		Empleado e1 = new Empleado("Antonio", "Santos", "Anabel Segura 11", "123w");
		Departamento d1 = new Departamento("RRHH", "MADz", "1234", e1);
		e1.setDep(d1);
		System.out.println(d1);

	}

}
