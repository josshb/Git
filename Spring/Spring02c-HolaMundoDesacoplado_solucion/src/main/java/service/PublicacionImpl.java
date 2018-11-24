package service;

import model.RedSocial;

/**
 *
 * @author Antonio
 */
public class PublicacionImpl implements Publicacion {

	private RedSocial redSocial;
	
	public PublicacionImpl(){
		
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
