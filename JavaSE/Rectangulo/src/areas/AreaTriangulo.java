package areas;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		System.out.println("indique la base de su rectangulo");
		double base=teclado.nextDouble();
		System.out.println("introduce la altura de tu rectangulo");
		double altura=teclado.nextDouble();
		
		System.out.println("Tu area es " + (base*altura));
	}

}