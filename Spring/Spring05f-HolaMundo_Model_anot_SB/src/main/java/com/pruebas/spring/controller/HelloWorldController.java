package com.pruebas.spring.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Holaaaa... ya no uso configuraciones");
		//Sí, ya sé que Date es obsoleto
		model.addAttribute("fecha", new Date());		
		System.out.println("----saliendo del controller");
		return "welcome";
	}

}