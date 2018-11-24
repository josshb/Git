package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.HolaMundoService;
import service.HolaMundoServiceImpl;

/**
 *
 * @author Antonio
 */

public class Principal {
	
	public static void main(String[] args) {
        //Deprecated
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-config.xml");
          
       
        //No aparece el new por ninguna parte.
        //Spring crea el objeto y se le inyecta
        //Pero tampoco aparece la implementación...
        HolaMundoService h = (HolaMundoServiceImpl)context.getBean("HOLAMUNDO");
        h.saludar("Antonio");
        
        ((ConfigurableApplicationContext)context).close();
    }

}





