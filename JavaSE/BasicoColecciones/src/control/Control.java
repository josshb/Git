package control;

import datos.Datos;
import model.Producto;
import servicios.Services;

public class Control {
	
	private Services servicios = new Services();
	private Services serbicios = new Services();
	
	public void iniciar(){
		
		Producto p = new Producto("carne");
		servicios.annadir(p);
		serbicios.annnnnnadir(p);		
		// TODO esto seria sin capas de servciios
		/*
		if(p.getNombre().equals("carne")){
			System.out.println("me lo quieres envenenar");
		}
		else{
			datos.annadir(p);
		}
		*/
	}
	
}
