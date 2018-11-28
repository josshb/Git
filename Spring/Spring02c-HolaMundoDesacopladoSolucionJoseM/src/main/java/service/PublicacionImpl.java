package service;

import model.IRedSocial;

/**
 *
 * @author Antonio
 */
public class PublicacionImpl implements Publicacion {

	private IRedSocial redsocial;
	
	public IRedSocial getRedsocial() {
		return redsocial;
	}

	public void setRedsocial(IRedSocial redsocial) {
		this.redsocial = redsocial;
	}

	@Override
	public void enviarMensaje(String mensaje) {
		// TODO Auto-generated method stub
		redsocial.publicar(mensaje);
	}


}
