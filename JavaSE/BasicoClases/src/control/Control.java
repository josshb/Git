package control;

import datos.Datos;
import model.Producto;

public class Control {
	
	private Services servicios=new Services();
	Producto p=new Producto();
	
	
	
	public void iniciar() {
		
		/*Producto p=new Producto("carne");
		if (p.getNombre().equals("carne")) {
			System.out.println("muerte por steakkkkk");
		}else {
			datos.anadir(p);
			
		}
		datos.anadir(p);
		System.out.println(datos);
	}
	*/
	
		services.annadir(p);
	
}
