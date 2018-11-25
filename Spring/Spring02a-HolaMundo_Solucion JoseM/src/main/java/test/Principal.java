package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ComidaImpl;
import utilidades.LeerTeclado;



/**
 *
 * @author Antonio
 */

public class Principal {
	
	public static void main(String[] args) {
       
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
          
		// Quiero comer sano. Ej lentejas
        
        // Quiero saber sus calorias
        
		ComidaImpl c = (ComidaImpl) context.getBean("NOMBREINVENTADISIMO");
		c.caloriasComida(LeerTeclado.leerLinea());
				
    }

}





