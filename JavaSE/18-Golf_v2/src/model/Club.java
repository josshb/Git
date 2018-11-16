package model;

public class Club {
	
	final float CUOTA_BASE = 500;
	
	//realmente sería un metodo estatico
	public void calcularCuota(Cliente socio) {
		
		float cuotaFinal = CUOTA_BASE;
		
		int edad = socio.getEdad();
		if (edad > 64) {
			System.out.println("Su cuota es de: " + (cuotaFinal - (CUOTA_BASE * .5)));
		} else if (edad < 18 && socio.isPadreSocio()) {
			System.out.println("Su cuota es de :" + (cuotaFinal - (CUOTA_BASE * 0.35)));
		} else if (edad < 18) {
			System.out.println("Su cuota es de :" + (cuotaFinal - (CUOTA_BASE * 0.25)));
		} else if (socio.isGenero()) {
			System.out.println("Su cuota es de :" + (cuotaFinal - (CUOTA_BASE * 0.15)));
		} else {
			System.out.println("Su cuota es de : "+ cuotaFinal);
		}
		
		//Es mejorable ya que habria que devolver la cuota

	}

}
