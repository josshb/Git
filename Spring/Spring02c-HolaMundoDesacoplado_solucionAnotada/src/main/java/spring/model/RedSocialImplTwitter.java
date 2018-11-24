package spring.model;

import org.springframework.stereotype.Component;

/**
*
* @author Antonio
*/

@Component("TWITTER")
public class RedSocialImplTwitter implements RedSocial {

   public void publicar (String msg){
       System.out.println("--- Publicando mensaje en Twitter ---");
       System.out.println("- Twitteando: " + msg);
   }
   
}