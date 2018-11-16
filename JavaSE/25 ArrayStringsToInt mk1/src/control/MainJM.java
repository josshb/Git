package control;

import java.util.Arrays;

public class MainJM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array1[]= {"enero","febrero","marzo","abril"};
		
		int array2[]=new int[array1.length];
		
		
		
		for (int i = 0; i < array1.length; i++) {
		array2[i]=array1[i].length();
		
		}
		System.out.println(Arrays.toString(array2));
	}

}
