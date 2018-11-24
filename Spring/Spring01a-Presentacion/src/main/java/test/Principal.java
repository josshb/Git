package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Estudiante;

/**
 *
 * @author Antonio
 */

public class Principal {
	
	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //No aparece el new por ninguna parte.
        //Spring crea el objeto y se le inyectan dos propiedades
        Estudiante student1 = (Estudiante) context.getBean("student1");     
        System.out.println(student1);
        
        Estudiante student2 = (Estudiante) context.getBean("student2");   
        System.out.println(student2);       
        
        student1.setNombre(student2.getNombre());
        System.out.println(student1);        
        
        ((ConfigurableApplicationContext)context).close();
    }

}
