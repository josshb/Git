package com.pruebas.spring.controller;

import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pruebas.spring.domain.Cliente;

@Controller
public class ClienteController {
	
	private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);
	
	//como llego aqui wwww.wwww.com/cliente   vvvv si es un get o un post
	@RequestMapping(value="/cliente", method= RequestMethod.GET)
	//                          vvv genero este objeto cliente vvvv
	public String initForm(@ModelAttribute("cliente") Cliente cliente) {
		logger.info("ha pasao");
		return "form1";
	}
	
	@RequestMapping(value="/addCliente", method=RequestMethod.POST)
	
	//                                         vv si no esta te lo genero vv mapa de objetos enlazados
	public String processForm(@ModelAttribute ("cliente")Cliente cliente, ModelMap model) {
		model.addAttribute(cliente);
		return "form2";
	}
	
}
