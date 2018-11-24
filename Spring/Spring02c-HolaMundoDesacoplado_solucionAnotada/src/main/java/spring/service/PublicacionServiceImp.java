package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.model.RedSocial;

/**
 *
 * @author Antonio
 */

@Component("MENSAJE")
public class PublicacionServiceImp implements PublicacionService {
	
	@Autowired
	//@Qualifier("FACEBOOK")	
	private RedSocial redSocial;
	
	public PublicacionServiceImp(){
		
	}

	public RedSocial getRedSocial() {
		return redSocial;
	}

	public void setRedSocial(RedSocial redSocial) {
		this.redSocial = redSocial;
	}

	public void enviarMensaje(String mensaje) {
		redSocial.publicar(mensaje);
	}
}
