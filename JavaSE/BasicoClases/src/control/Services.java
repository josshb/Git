package control;

import datos.Datos;
import model.Producto;

public class Services {
		private Datos dat=new Datos();

	public void annadir(Producto p) {
		
		if (p.getNombre().equals("carne")) {
			System.out.println("muerte por steakkkkk");
		}else {
			dat.anadir(p);
		
	}
	}
	
	
	
}
