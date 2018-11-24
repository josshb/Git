package controller;

import domain.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
//@SessionAttributes("cliente")
public class ClienteController {

  // Este m�todo lo tengo aqui para que cuando alguien pregunte por cliente... le devuelva un objeto vacio
  // De hecho, se ejecuta antes de ejecutar el metodo initForm y antes del processSubmit
  @ModelAttribute("cliente")
  public Cliente getClienteObject() {
      System.out.println("-- devuelvo un objeto vacio");
      return new Cliente();
  }

  @RequestMapping(value = "/cliente", method = RequestMethod.GET)
  public String initForm() {
      System.out.println("--- metodo cliente");

      // Aqui es muy simple porque lo unico que necesito es un objeto vacio
      // En el formulario necesito indicarlo con    modelAttribute
      // Antes de entrar a este m�todo, ya ha realizado lo del @ModelAttribute
      return "form1";
  }
  

  @RequestMapping(value = "/addCliente", method = RequestMethod.POST)
  public String processSubmit(
          @ModelAttribute("cliente") Cliente cliente,
          ModelMap model) {
      System.out.println("--- metodo addcliente");
      //En vez de guardar uno a uno... los guardo de golpe
      //En el proximo JSP tendre que sacarlos como   cliente.nombre    ciente.id, etc.
      System.out.println("--"+cliente);
      model.addAttribute(cliente);
      return "form2";
  }

}
