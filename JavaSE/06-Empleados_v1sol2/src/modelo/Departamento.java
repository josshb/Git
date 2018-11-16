package modelo;

import java.util.List;

public class Departamento {
	private String nombre;
	private String ubicacion;
	private String telefono;
	
	private Empleado director;
	private List<Empleado> listaEmpleados;

	public Departamento() {
		super();
	}

	public Departamento(String nombre, String ubicacion, String telefono, Empleado director,
			List<Empleado> listaEmpleados) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.director = director;
		this.listaEmpleados = listaEmpleados;
	}
	
	public Departamento(String nombre, String ubicacion, String telefono, Empleado director) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.director = director;
	}	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Empleado getDirector() {
		return director;
	}

	public void setDirector(Empleado director) {
		this.director = director;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", ubicacion=" + ubicacion + ", telefono=" + telefono + ", director="
				+ director + ", listaEmpleados=" + listaEmpleados + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Departamento other = (Departamento) obj;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}


	
	
	

}
