package control;

import java.util.ArrayList;
import java.util.List;
import model.Coche;

import utiles.Colecciones;

/**
 *
 * @author Antonio
 */
public class Test {

	public static void prueba1() {
		List<Integer> col = new ArrayList();
		col.add(23);
		col.add(42);
		col.add(42);
		col.add(2);
		System.out.println("Apariciones: "+Colecciones.frecuencia(col, 43));
	}
	
	public static void prueba2() {
		List<Coche> col = new ArrayList();
		
		col.add(new Coche("Opel", "Corsa","123"));
		col.add(new Coche("Opel", "Astra","124"));
		col.add(new Coche("Opel", "Corsa","125"));

		Coche c4 = new Coche("Opel", "Corsa","123");
		Coche c5 = new Coche("Opel", "Astra","124");
		Coche c6 = new Coche("Renault", "Clio","126");
		System.out.println("Apariciones: "+Colecciones.frecuencia(col, c4));
		System.out.println("Apariciones: "+Colecciones.frecuencia(col, c5));
		System.out.println("Apariciones: "+Colecciones.frecuencia(col, c6));		
	}
}
