package distancias;

import java.util.Scanner;

public class Punto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double X1 = 5;
		double Y1= 7;
		double X2 = 34;
		double Y2= 8;
		
		Scanner teclado= new Scanner(System.in);

		System.out.println("introduce el primer numero de tu primera coordenada");
		
		X1=teclado.nextDouble();
		
		System.out.println("introduce el segundo numero de tu primera coordenada");
		
		Y1=teclado.nextDouble();
		
		System.out.println("introduce el primer numero de tu segunda coordenada\nSi quieres calcular la distancia al centro introduce 0");
		
		X2=teclado.nextDouble();
		
		System.out.println("introduce el segundo numero de tu segunda coordenada\nSi quieres calcular la distancia al centro introduce 0");
		
		Y2=teclado.nextDouble();
		
		
		
		
		
				
		
		
		
		
		double distancia=Math.sqrt((Math.pow((X1-X2), 2)*((Math.pow((X1-X2), 2)))));
		
		System.out.println(distancia);
		
		
	}

}
