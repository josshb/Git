package main;

/**
*
* @author Antonio
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int veces = 0;
		boolean noconseguido = true;
		Scanner teclado;
		do {
			teclado = new Scanner(System.in);
			try {
				System.out.println("Indica un numero entre 1 y 100");

				int numero = teclado.nextInt();

				System.out.println("--- sigo ejecutando");
				veces++;
				if ((numero > 100) || (numero < 1)) {
					throw new Exception("Rango no válido");
				} else {
					System.out.println("Valor correcto en " + veces + " intentos");
					noconseguido = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Problema de tipos: " + e.getMessage());
				System.out.println("Escribe un entero");
			} catch (Exception e) {
				System.out.println("Problema: " + e.getMessage());
			}
		} while (noconseguido);
		

	}

}
