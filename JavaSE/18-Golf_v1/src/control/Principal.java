package control;

import model.Persona;
import utilidades.LecturaDatos;

public class Principal {

	public static void main(String[] args) {

		final float DESC_MAYOR = 0.5f;
		final float DESC_MUJER = 0.15f;
		final float MENOR_SOCIO = 0.35f;
		final float MENOR_NO_SOCIO = 0.25f;
		byte cont = 0;
		Persona p = new Persona();

		System.out.println("Bienvenido al club de Golf 'El Agujerito'");

		System.out.println("Indique su nombre");
		p.setNombre(LecturaDatos.leerString());
		System.out.println("Indique su edad");
		p.setEdad(LecturaDatos.leerShort());
		System.out.println("Indique si es varón o mujer -> V/M");
		p.setSexo(LecturaDatos.leerString().charAt(0));

		if (p.getEdad() < 18) {
			System.out.println("¿ Tu padre es socio ? s/n");
			String socio = LecturaDatos.leerString();
			if (socio.equals("s")) {
				p.setSocio(true);
			}
			if (p.isSocio()) {
				p.setCuota((int) (p.getCuota() - p.getCuota() * MENOR_SOCIO));
				System.out.println("Se te ha aplicado el descuento del " + MENOR_SOCIO * 100 + " %");
			} else {
				p.setCuota((int) (p.getCuota() - p.getCuota() * MENOR_NO_SOCIO));
				System.out.println("Se te ha aplicado el descuento del " + MENOR_NO_SOCIO * 100 + " %");
			}
		}
		if (p.getSexo() == 'M') {
			p.setCuota((int) (p.getCuota() - p.getCuota() * DESC_MUJER));
			System.out.println("Se te ha aplicado el descuento del " + DESC_MUJER * 100 + " %");
		}
		if (p.getEdad() > 65) {
			p.setCuota((int) (p.getCuota() - p.getCuota() * DESC_MAYOR));
			System.out.println("Se te ha aplicado el descuento del " + DESC_MAYOR * 100 + " %");
		}

		System.out.println("Tu cuota queda en " + p.getCuota());

		// p.setSocio();

	}

}
