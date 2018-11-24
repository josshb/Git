package service;

import model.Encriptador;
import model.Procesador;

/**
 *
 * @author Antonio
 */
public class HolaMundoServiceImpl implements HolaMundoService {

	private Procesador procesador;
	private Encriptador encriptador;

	/*
	 * DI via Constructor Injection
	 */
	public HolaMundoServiceImpl(Encriptador encriptador) {
		this.encriptador = encriptador;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	/*
	 * DI via Setter
	 */
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public void saludar(String msg) {
		encriptador.encriptar(msg);
		procesador.procesar("Enviando... " + msg);
	}
}
