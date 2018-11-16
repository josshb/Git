package control;

import java.util.Arrays;

import utilidades.LecturaDatos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dime tu array separado por comas");
		String texto=LecturaDatos.leerString();
		
		String[] arraytoshort= {texto};
		
		
		Arrays.parallelSort(arraytoshort);
		
			System.out.println(Arrays.toString(arraytoshort));
		}
				
		
		
		
		
	}

