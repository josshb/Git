package control.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Antonio Santos
 */
/*
 En el web.xml hubieramos escrito
 <listener>
 <description>ServletContextListener, HttpSessionListener, RequestListener</description>
 <listener-class>Listener.ControlEventosListener</listener-class>
 </listener> 
 */
@WebListener("ServletContextListener, HttpSessionListener, RequestListener")
public class ControlEventosListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {

    ServletContext servletContext;
    //int numSesiones = 0;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        servletContext = sce.getServletContext();
        servletContext.log("--- método invocado: contextInitialized");
        //Vamos a hacer un caso practico
        // Creo un contexto
        ServletContext context = sce.getServletContext();
        // Obtengo el parametro guardado como <context-param>
        String frase = context.getInitParameter("despedida");
        // Lo paso a atributo para que lo puedan utilizar. 
        context.setAttribute("frasefinal", frase+",majete");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        servletContext.log("--- método invocado: contextDestroyed");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        servletContext.log("--- método invocado: sessionCreated");
        //numSesiones++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        servletContext.log("--- método invocado: sessionDestroyed");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        servletContext.log("--- método invocado: requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        servletContext.log("--- método invocado: requestInitialized");
    }
}
