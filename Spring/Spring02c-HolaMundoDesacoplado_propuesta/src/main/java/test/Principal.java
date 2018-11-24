package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Publicacion;


/**
 *
 * @author Antonio
 */

public class Principal {
	
	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Publicacion pub = (Publicacion)context.getBean("MENSAJE");
        pub.enviarMensaje("Estoy jugueteando con la IoC de Spring");
        
        ((ConfigurableApplicationContext)context).close();
    }

}





