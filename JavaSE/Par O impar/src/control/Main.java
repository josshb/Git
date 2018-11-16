package control;

import utilidades.Numero;

public class Main {

	public static void main(String[] args) {

		int numero=new Numero().getnumero();
		
		if (numero%2==0) {
			System.out.println("tu numero es par");
			
		}else {
			System.out.println("tu numero es impar");
		}
		
	}

}
