package cervezas.domain;

public class Cerveza {
	private String nombre;
	private String color;
	private float graduacion;
	private String descripcion;
	
	public Cerveza(){
		
	}
	
	public Cerveza(String nombre){
		this.nombre=nombre;
	}
	public Cerveza(String nombre, String color, float graduacion, String descripcion) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.graduacion = graduacion;
		this.descripcion = descripcion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getGraduacion() {
		return graduacion;
	}
	public void setGraduacion(float graduacion) {
		this.graduacion = graduacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Cerveza [nombre=" + nombre + ", color=" + color + ", graduacion=" + graduacion + ", descripcion="
				+ descripcion + "]";
	}
	
	
	
	

}
