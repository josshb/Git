package service;

import utilidades.LeerTeclado;

public class ComidaImpl implements IComida {

	@Override
	public void caloriasComida(String comida) {
		System.out.println("elija la comida de hoy , lentejas, judias,");
		int calorias = 0;
		
		switch (comida) {
		case "lentejas":
			calorias = 500;
			break;
		case "judias":
			calorias = 600;
			break;
		case "garbanzos":
			calorias = 800;
			break;
		case "manteca_cacahuete_con_mantequilla":
			calorias = 3500;
		}
		System.out.println("Que le aprovechen su plato de " + comida + " que tiene: " + calorias + " cal");

	}
}