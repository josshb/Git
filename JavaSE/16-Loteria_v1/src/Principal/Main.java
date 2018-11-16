package Principal;

/**
*
* @author Seguro, seguro que fue un alumno
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Perezon!!!!!!!
		//Úseme la clase LeerTeclado o similares
		Scanner teclado = new Scanner(System.in);

		int apuesta = 0;
		for(int i =1;i<=8;i++){
			
		}

		do {

			System.out.println("Introduce un numero del 1 al 49");
			byte numero = teclado.nextByte();

			if (numero <= 49 && numero >= 1) {
				System.out.println("Ha elegido el " + numero);
				apuesta++;

			} else {
				System.out.println("Elija oto numero");
			}
			// Me congratula esta loteria de 8 apuestas
		} while (apuesta != 8);

		System.out.println("Su apuesta ha sido registrada");

	}
// Es una apuesta de postureo
}
