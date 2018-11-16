package utilities;

public class Escritor {
	int L_Largo=new ComparadorLados().getLadoMasLargo();
	
	
	
	String msg=("El lado mas largo mide: "+L_Largo);
	
	public void Escribe() {
		System.out.println(msg);
	}
	
}
