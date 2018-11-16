package principal;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Hilo();
		t1.start();
		
		Thread t2 = new Hilo();
		Thread t3 = new Hilo();		

		t2.start();
		t3.start();	
		System.out.println("Terminado o no...");
		
		
	}

}

