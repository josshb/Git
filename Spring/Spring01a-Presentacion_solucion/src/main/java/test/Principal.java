package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Libro;

/**
 *
 * @author Antonio
 */

public class Principal {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Libro libro = (Libro) context.getBean("librito");
		System.out.println(libro);
		
		((ConfigurableApplicationContext)context).close();
		
	}

}
