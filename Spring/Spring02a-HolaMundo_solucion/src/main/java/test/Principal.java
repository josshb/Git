package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ComidaService;


/**
 *
 * @author Antonio
 */

public class Principal {
	
	public static void main(String[] args) {
       
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans-config.xml");
          
		// Quiero comer sano
        ComidaService c = (ComidaService)context.getBean("ENDOCRINO");
        // Quiero saber sus calorias
        c.caloriasComida("manteca_cacahuete_con_mantequilla");
        
        ((ConfigurableApplicationContext)context).close();

    }

}





