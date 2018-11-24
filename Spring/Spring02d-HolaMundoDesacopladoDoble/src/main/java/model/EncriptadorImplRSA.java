package model;

public class EncriptadorImplRSA implements Encriptador{

	public void encriptar(String msg) {
		System.out.println("Encriptando en formato RSA el mensaje: "+msg);
	}

}
