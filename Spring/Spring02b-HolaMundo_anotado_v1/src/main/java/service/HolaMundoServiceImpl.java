package service;

import org.springframework.stereotype.Component;

/**
*
* @author Antonio
*/

@Component("HOLAMUNDO")
public class HolaMundoServiceImpl implements HolaMundoService {
	
   public void saludar(String nombre){
      System.out.println("Hola mundo, y en especial a "+nombre);
   }
}
