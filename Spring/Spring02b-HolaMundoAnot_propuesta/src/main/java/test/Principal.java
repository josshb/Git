package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.ComidaConfig;
import service.IComida;


/**
 *
 * @author Antonio
 */

public class Principal {
	
	public static void main(String[] args) {
       
		
		// Quiero comer sano
        IComida c = (IComida)context.getBean("ENDOCRINO");
        // Quiero saber sus calorias
        c.caloriasComida("garbanzos");

    }

}





