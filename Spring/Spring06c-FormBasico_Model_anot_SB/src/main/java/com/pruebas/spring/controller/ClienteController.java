package com.pruebas.spring.controller;

import com.pruebas.spring.domain.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ClienteController {

	//Pregunta... ¿y si quito @ModelAttribute("cliente")... funciona?
  @RequestMapping(value = "/cliente", method = RequestMethod.GET)
  public String initForm(@ModelAttribute("cliente") Cliente cliente) {
      System.out.println("-- metodo Cliente");

      // Aqui es muy simple porque lo unico que necesito es un objeto vacio
      return "form1";
  }

  @RequestMapping(value = "/addCliente", method = RequestMethod.POST)
  public String processSubmit(
          @ModelAttribute("cliente1") Cliente cliente,
          ModelMap model) {
      System.out.println("-- metodo addCliente");
      System.out.println("--"+cliente);
      model.addAttribute(cliente);
      return "form2";
  }

}
