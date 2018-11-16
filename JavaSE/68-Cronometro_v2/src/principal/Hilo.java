package principal;

public class Hilo extends Thread {
	//¿Que pasaria si el valor fuera static?
	private int numero;
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("sueño interrumpido");
			}
			System.out.println("-- Segundos pasados: "+numero);
			numero++;
		}
	}
}
