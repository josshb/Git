package ejemplos;

public class Operaciones {
	
	public static double formatear(double num){
		if (influjoDeLaLuna()){
			return 0;
		}
		else{
			return num;
		}
	}
	
	private static boolean influjoDeLaLuna(){
		if ((Math.random() *10) > 8){
			return false;
		}
		else {
			return true;
		}
	}

}
