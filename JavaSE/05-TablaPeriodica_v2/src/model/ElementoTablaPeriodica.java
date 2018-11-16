package model;













public class ElementoTablaPeriodica {
	
	private String nombre;
	private String simbolo;
	private short numero;
	private static short numInstancias = 0;
	
	public ElementoTablaPeriodica(){
		numInstancias++;
	}
	public ElementoTablaPeriodica(String nombre, String simbolo, short numero) {
		super();
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.numero = numero;
		numInstancias++;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	
	public static short getNumInstancias() {
		return numInstancias;
	}
	public static void setNumInstancias(short numInstancias) {
		ElementoTablaPeriodica.numInstancias = numInstancias;
	}
	@Override
	public String toString() {
		return "ElementoTablaPeriodica [nombre=" + nombre + ", simbolo=" + simbolo + ", numero=" + numero + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		result = prime * result + ((simbolo == null) ? 0 : simbolo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementoTablaPeriodica other = (ElementoTablaPeriodica) obj;
		if (numero != other.numero)
			return false;
		if (simbolo == null) {
			if (other.simbolo != null)
				return false;
		} else if (!simbolo.equals(other.simbolo))
			return false;
		return true;
	}
	
	
	
	

}
