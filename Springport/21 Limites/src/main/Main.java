package main;

import utilities.LeerDatos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		int min;
		long numero;

		System.out.println("define tu rango maximo");

		max = LeerDatos.Leer();

		System.out.println("define tu rango minimo");

		min = LeerDatos.Leer();

		System.out.println("Elige un numero dentro del rango seleccionado");
		numero=LeerDatos.Leer();
		while (numero > max || numero <min) {
		System.out.println("tu numero es incorrecto :( introduce otro");
		numero=LeerDatos.Leer();
		
		}
		
		numero=(long) Math.pow (numero, 2);
		System.out.println("tu numero entre  "+max+" y "+ min+" es "+ numero+" al cuadrado.");

//		
//		if (numero < max) {
//			if (numero > min) {
//				numero=(long) Math.pow (numero, 2);
//				System.out.println("tu numero entre  "+max+" y "+ min+" es "+ numero+" al cuadrado.");
//			}
//		
//		}
	}
}
