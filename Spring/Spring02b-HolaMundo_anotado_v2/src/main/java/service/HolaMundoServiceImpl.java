package service;


/**
*
* @author Antonio
*/
public class HolaMundoServiceImpl implements HolaMundoService {
	
   public void saludar(String nombre){
      System.out.println("Hola mundo, y en especial a "+nombre);
   }
}
