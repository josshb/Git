package com.ejemplos.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
 
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
 
//Reeemplaza al web.xml
//Basado en Servlet 3.0
public class MyWebInitializer implements WebApplicationInitializer {
 
	@Override
    public void onStartup(ServletContext container) throws ServletException {
 
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringWebConfig.class);
        //ASR. Prueba desde 
        //http://www.baeldung.com/apache-cxf-with-spring
        container.addListener(new ContextLoaderListener(ctx));
        ctx.setServletContext(container);
 
        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
 
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
 
}
