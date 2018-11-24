package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.saludar.HolaMundoService;


/**
 *
 * @author Antonio
 */

public class Principal {
	
	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-config.xml");
          
        HolaMundoService h = (HolaMundoService)context.getBean("HOLAMUNDO");
        h.saludar("Antonio");
        
        ((ConfigurableApplicationContext)context).close();
    }

}