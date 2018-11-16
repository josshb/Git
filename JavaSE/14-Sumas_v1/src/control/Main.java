package control;

public class Main {

	public static void main(String[] args) {

		int numero = 7;
		
		System.out.println("Version a");
		System.out.println("2 + 4 + 6");
		System.out.println("----------------");		
		
		int suma1 = 0;
		for (int i = 2; i < numero; i=i+2) {
			System.out.println(i);
			suma1 += i;
		}
		System.out.println("la suma es: "+suma1);
		System.out.println("----------------");		

		System.out.println("Version b");
		System.out.println("2 + 4 + 6 + 8 +10 +12 +14");
		System.out.println("----------------");

		int suma2 = 0;
		for (int i = 1; i <= numero; i++) {
			System.out.println(i * 2);
			suma2 += i*2;			
		}
		System.out.println("la suma es: "+suma2);
		System.out.println("----------------");			
	}

}
