package control;

import model.Coche;
import model.FUrgoneta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1=new Coche(4, 2000, 3, 2000, 700, 1000, "blanco", false, true);
		FUrgoneta c2=new FUrgoneta(10, 3);
		c1.setAsientos_cuero("no");
		System.out.println(c1);
	}

}
