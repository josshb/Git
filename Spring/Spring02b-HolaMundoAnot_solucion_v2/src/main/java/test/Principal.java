package test;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppComidaConfig;
import service.ComidaService;


/**
 *
 * @author Antonio
 */

public class Principal {
	
	public static void main(String[] args) {
       
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppComidaConfig.class);
         
		// Quiero comer sano
        ComidaService c = (ComidaService)context.getBean("ENDOCRINO");
        // Quiero saber sus calorias
        c.caloriasComida("garbanzos");
        
        ((ConfigurableApplicationContext)context).close();

    }

}





