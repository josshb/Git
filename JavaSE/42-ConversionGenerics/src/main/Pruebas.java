package main;

import utilidades.Conversor;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class Pruebas {
	
	public static void Prueba1(){
		Integer[] aux1 = {1,2,3,4,5};
		Producto[] aux2 = {new Producto(),new Producto()};
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Producto> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		List<Producto> l4 = new ArrayList<>();
		
		Conversor.ArrayToArrayList(aux1, l1);
		Conversor.ArrayToArrayList(aux2, l2);
		
		Conversor.ArrayToArrayList(aux1);
		Conversor.ArrayToArrayList(aux2);
		
		Conversor.ArrayToArrayList2(aux1, l3);
		Conversor.ArrayToArrayList2(aux2, l4);

		
	}

}
