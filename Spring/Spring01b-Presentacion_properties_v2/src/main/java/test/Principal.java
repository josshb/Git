package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Estudiante;

//Deprecated
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.core.io.FileSystemResource;

/**
 *
 * @author Antonio
 */

public class Principal {
	
	public static void main(String[] args) {
        
		/*
		 * Es posible que dé un warning
		 * 
		 * close() is not defined in ApplicationContext interface.
		 * 
		 * The only way to get rid of the warning safely is the following
		 * 
		 * ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(...); 
		 * try { 
		 *     [...] 
		 * } 
		 * finally {
		 *     context.close(); 
		 * } 
		 * 
		 * Or, in Java 7
		 * 
		 * try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(...)) {
		 *     [...] 
		 * }
		 */		
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Estudiante student = (Estudiante) context.getBean("student");
        System.out.println(student);
        
        // Esta es una mejor opcion al warning. Si la quitas verás que aparece
        ((ConfigurableApplicationContext)context).close();
    }

}
