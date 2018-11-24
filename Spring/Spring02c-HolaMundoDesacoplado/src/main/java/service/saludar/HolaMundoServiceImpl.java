package service.saludar;

import model.Procesador;


/**
*
* @author Antonio
*/
public class HolaMundoServiceImpl implements HolaMundoService {
	
	//¿Qué patrón estoy usando?
	private Procesador procesador;

    public Procesador getProcesador() {
        return procesador;
    }

	/*
	 * DI via Setter
	 */
    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public void saludar(String nombre){
       //System.out.println("Hola mundo, "+nombre);
       procesador.procesar("Hola mundo, y en especial a "+nombre);
    }
}
