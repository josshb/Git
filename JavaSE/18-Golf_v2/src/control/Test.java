package control;

import model.Cliente;
import model.Club;

public class Test {

    public static void prueba1() {
    	Cliente c1 = new Cliente();
		c1.crearCliente();
		new Club().calcularCuota(c1);
    }

}
