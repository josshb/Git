package spring.model;

import org.springframework.stereotype.Component;

/**
*
* @author Antonio
*/

@Component("FACEBOOK")
public class RedSocialImplFacebook implements RedSocial {

	   public void publicar (String msg){
	       System.out.println("--- Publicando mensaje en Facebook ---");
	       System.out.println("- Publicando en el muro: " + msg);
	   }
   
}