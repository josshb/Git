package control;

public class MainHole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cuotainicial=500;
		final double descuentovejete=0.50;
		final double descuentomenorpapi=0.65;
		final double descuentomenor=0.75;
		final double descuentomujer=0.85;
		final boolean vejete=false;
		final boolean menorpapi=false;
		final boolean menor=false;
		final boolean mujer=true;
		
		
		if (vejete==true) {
			System.out.println("Usted pagar�a "+cuotainicial*descuentovejete);
			
		}else if (menorpapi==true) {
			System.out.println("Usted pagar�a "+cuotainicial*descuentomenorpapi);

		}else if (menor==true) {
			System.out.println("Usted pagar�a "+cuotainicial*descuentomenor);
			
			
		}else if (mujer==true) {
			
			System.out.println("Usted pagar�a "+cuotainicial*descuentomujer);
			
		}else {
			System.out.println("Lo siento no tiene descuento debe pagar "+cuotainicial);
		}
		
		
					
		
		
	}

}
