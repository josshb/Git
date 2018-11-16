package model;

import utilidades.LeerTeclado;

public class Cliente {

	private int edad;
	private boolean genero; // si true mujer, si false hombre
	private boolean padreSocio;

	public Cliente() {

	}

	public Cliente(int edad, boolean genero, boolean padreSocio) {
		this.edad = edad;
		this.genero = genero;
		this.padreSocio = padreSocio;

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	public boolean isPadreSocio() {
		return padreSocio;
	}

	public void setPadreSocio(boolean padreSocio) {
		this.padreSocio = padreSocio;
	}

	public void crearCliente(){
		this.setEdad(LeerTeclado.leerInt("Indica la edad"));
		this.setGenero(Boolean.parseBoolean(LeerTeclado.leerPalabra("indica si eres mujer (true) u hombre (false)")));
		this.setPadreSocio(
				Boolean.parseBoolean(LeerTeclado.leerPalabra("indica si tu padre es socio (true) o no(false")));
		
	}

}
