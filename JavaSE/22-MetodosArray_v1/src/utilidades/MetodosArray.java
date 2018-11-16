package utilidades;

import java.util.Arrays;

public class MetodosArray {

	// Ejercicio 22a

	public static void imprimir0(int[] valores) {
		String cad = "[";
		for (int i = 0; i < valores.length; i++) {
			cad += valores[i];
			// si no es el ultimo valor...
			if (i < (valores.length - 1)) {
				cad += ",";
			}
		}
		cad += "]";
		System.out.println(cad);
	}

	public static void imprimir1(int[] valores) {
		String cad = "[";
		for (int num : valores) {
			cad += num;
			cad += ",";
		}
		cad = cad.substring(0, cad.length() - 1);
		cad += "]";
		System.out.println(cad);
	}

	// Ejercicio 22a
	public static void imprimir2(int[] valores) {
		StringBuilder cad = new StringBuilder("[");
		for (int num : valores) {
			cad.append(num).append(",");
		}
		cad.replace(cad.length() - 1, cad.length(), "");
		cad.append("]");
		System.out.println(cad);
	}

	// Ejercicio 22b
	public static int[] rellenarArray(int[] valores) {

		int tope = valores.length;
		for (int i = 0; i < tope; i++) {
			System.out.print("\nDame numero " + (i + 1) + " de " + tope + " --> ");
			valores[i] = LecturaDatos.leerInteger();
		}
		return valores;
	}

	public static int[] rellenarArray2(int cantidad) {
		System.out.println("Rellenando array de " + cantidad);
		int[] valores = new int[cantidad];
		// Relleno array
		return (rellenarArray(valores));
	}

	// Ejercicio 22c
	public static int sumaElementos(int[] valores) {
		int suma = 0;
		for (int valor : valores) {
			suma += valor;
		}
		return suma;
	}

	// Ejercicio 22d
	public static int[] darLaVuelta(int[] valores) {
		int[] aux = new int[valores.length]; // otro array PRUEBA2 de la misma
												// longitud que el anterior
		int i = 0;
		for (int j = valores.length - 1; j >= 0; j--) {
			// aux[valores.length - j] = valores[j];
			aux[i++] = valores[j];
		}
		return aux;
	}

	// Otra forma curiosa
	public static String darLaVuelta2(int[] valores) {
		StringBuilder sb = new StringBuilder(Arrays.toString(valores));
		return sb.reverse().toString();
	}

	public static int[] ordenar(int[] valores) {
		Arrays.sort(valores);
		return valores;
	}

}
