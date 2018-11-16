package control;
import util.LecturaDatos;
import beams.auto.Coche;
import beams.auto.Deportivo;

public class Test {

	public static void prueba() {
		// TODO Auto-generated method stub
		Coche c1 = new Coche();
		Deportivo d1= new Deportivo();
		
		if (LecturaDatos.leerString("¿Se trata su coche de un deportivo? S/N").equalsIgnoreCase("s")) {
			d1.crearDeportivo();
			d1.imprimirInforme();
			
			
		}else {
		c1.crearCoche();
		c1.imprimirInforme();
		}
	}
}
