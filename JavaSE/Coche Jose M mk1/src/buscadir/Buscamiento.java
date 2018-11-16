package buscadir;

import model.Coche;

public class Buscamiento {
	public void buscadir(){
		
		Coche c1=new Coche();
		c1.setaño(1996);
		c1.setcolor("blanco");
		c1.setmatricula("m6746ud");
		c1.setmetalizado(false);
		c1.setmodelo("Ibiza");
		c1.setseguroTodoRiesgo(false);
		c1.settipo("hatchback");
		
		System.out.println(c1);

	
	}
	


}
