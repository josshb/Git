package com.ejemplos.spring.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.ui.ModelMap;
//import org.springframework.web.servlet.ModelAndView;

public class HelloWorldControllerTest {
	
    @Test
    public void testHandleRequestView() throws Exception{		
    	HelloWorldController controller = new HelloWorldController();
    	//Espero un ModelMap para trabajar. Como hago yo la llamada, debo pasarlo
    	//Mira en el controller que lo que devuelve es "welcome"
    	assertEquals("welcome", controller.sayHello(new ModelMap()));
    	
    	//Si trabajara con un ModelAndView sería algo así
        //ModelAndView modelAndView = controller.sayHello(null);		
        //assertEquals("welcome.jsp", modelAndView.getViewName());
    }


}
