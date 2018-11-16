package servicios;

import datos.Datos;
import model.Producto;

public class Services {

	private Datos dat = new Datos();

	public void annadir(Producto p) {
		if (p.getNombre().equals("carne")) {
			System.out.println("me lo quieres envenenar");
		} else {
			dat.annadir(p);
		}
		System.out.println(dat);
		System.out.println("--------");
	}

	public void annnnnnadir(Producto p) {
		dat.annadir(p);
		System.out.println(dat);
		System.out.println("--------");		
	}

}
