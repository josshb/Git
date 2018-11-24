package model;

public class EncriptadorImplPGP implements Encriptador{

	public void encriptar(String msg) {
		System.out.println("Encriptando en formato PGP el mensaje: "+msg);
	}

}
