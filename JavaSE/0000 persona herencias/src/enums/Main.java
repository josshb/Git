package enums;

import java.util.Scanner;

import enums.Enums.Talla;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe una talla");
		String Datos = entrada.next().toUpperCase();
		Talla latalla=Enum.valueOf(Talla.class, Datos);
		System.out.println(latalla);
				}

}
