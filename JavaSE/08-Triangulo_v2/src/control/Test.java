package control;

import beans.Punto;
import beans.Triangulo;

/**
 *
 * @author Antonio
 */
public class Test {

	public static void prueba1() {
		Punto p1 = new Punto(5, 7);
		Punto p2 = new Punto(9, 12);
		Punto p3 = new Punto(18, 12);
		Triangulo t1 = new Triangulo(p1, p2, p3);
		System.out.println(t1);
		t1.calcularLadoMayor();
	}
}
