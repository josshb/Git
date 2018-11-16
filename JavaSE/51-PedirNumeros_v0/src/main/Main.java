package main;

/**
*
* @author Antonio
*/

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int veces = 0;
		boolean noconseguido = true;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Indica un numero entre 1 y 100");
			int numero = teclado.nextInt();
			veces++;
			if ((numero > 100) || (numero < 1)) {
				System.out.println("Rango no válido");
			} else {
				System.out.println("Valor correcto en " + veces + " intentos");
				noconseguido = false;
			}

		} while (noconseguido);
	}

}
