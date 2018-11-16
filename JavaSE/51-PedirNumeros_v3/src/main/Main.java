package main;

/**
*
* @author Antonio
*/

import java.util.InputMismatchException;

import excepciones.RangoException;
import utilidades.LecturaDatos;

public class Main {

	public static void main(String[] args) {
		int veces = 0;
		boolean noconseguido = true;
		do {
			try {
				// Al colocarlo aqui, hago que tb cuente los intentos de texto
				veces++;
				int numero = LecturaDatos.LeerInt("Indica un numero entre 1 y 100");

				if ((numero > 100) || (numero < 1)) {
					throw new RangoException(numero);
				} else {
					System.out.println("Valor correcto en " + veces + " intentos");
					noconseguido = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Problema de tipos: " + e.getMessage());
				System.out.println("Escribe un entero");
			} catch (RangoException e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println("Problema Excepcion: " + e.getMessage());
			}
		} while (noconseguido);

	}

}
