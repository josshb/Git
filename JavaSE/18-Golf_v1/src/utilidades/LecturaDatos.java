package utilidades;

import java.util.Scanner;

public class LecturaDatos {

	
	static public int leerint(){
		
		return new Scanner(System.in).nextInt();
	}
	static public String leerString(){
		
		return new Scanner(System.in).next();
	}
	static public Short leerShort(){
		
		return new Scanner(System.in).nextShort();
	}

}
