package control;

import java.util.Arrays;
import java.util.Random;

public class Control {

	public static void main(String[] args) {

		int[] array1 = new int[100];
		int tirada = 0;
		int[] frecuencia= new int[6];

		Random r = new Random();
		int min = 1;
		int max = 7;
		int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0;
		int resultado = 0;
		
		for (int i = 0; i < array1.length; i++) {
			
			tirada=r.nextInt(max - min) + min;
			array1[i]=tirada;
			int j = 0;
			int k = 0;
			if (tirada== 1){
				frecuencia[0]++;
				j++;
			}else if (tirada== 2){
				frecuencia[1]++;
				j++;
			}else if (tirada== 3){
				frecuencia[2]++;
				j++;
			}else if (tirada== 4){
				frecuencia[3]++;
				j++;
			}else if (tirada== 5){
				frecuencia[4]++;
				j++;
			}else frecuencia[5]++;
			
			
		}

		System.out.println(Arrays.toString(array1));
		System.out.println("las frecuencias en tantos por ciento son:" + Arrays.toString(frecuencia)+"%");
		/*for (int j = 0; j < array1.length; j++) {
			
			if (array1[j] == 1) {
				uno=uno++;
				
			} else if (array1[j]==2) {
				dos=dos++;
				
			}else if (array1[j]==3) {
				tres=tres++;
				
			}else if (array1[j]==4) {
				cuatro=cuatro++;
				
			}else if (array1[j]==5) {
				cinco=cinco++;
		
			}else {
				seis=seis++;
				
			}
			System.out.println(uno+dos+tres+cuatro+cinco+seis);

		}
*/
	}

}