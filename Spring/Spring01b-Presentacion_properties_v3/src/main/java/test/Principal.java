package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
               
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig appConfig = context.getBean(AppConfig.class);
        System.out.println(appConfig.getListaStudents());
        ((ConfigurableApplicationContext)context).close();
    }

}
