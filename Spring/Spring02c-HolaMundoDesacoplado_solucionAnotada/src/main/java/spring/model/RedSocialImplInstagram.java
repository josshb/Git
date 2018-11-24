package spring.model;

/**
*
* @author Antonio
*/

import org.springframework.stereotype.Component;

@Component("INSTAGRAM")
public class RedSocialImplInstagram implements RedSocial {

	   public void publicar (String msg){
	       System.out.println("--- Publicando mensaje en Instagram ---");
	       System.out.println("- Compartiendo: "+msg);
	   }
	 

}
