package model;

import org.springframework.beans.factory.annotation.Value;

public class Estudiante {
	

    public Estudiante() {
    }

    public Estudiante(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	//Inyectaremos 2 propiedades via setter
    @Value("${estudiante.nombre}")
    private String nombre;
    
    @Value("${estudiante.edad}")  
    private Integer edad;

    public Integer getEdad() {   	
        return edad;
    }

    public void setEdad(Integer edad) {    	
        this.edad = edad;
    }

    public String getNombre() {  	
        return nombre;
    }

    public void setNombre(String nombre) { 	
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return '\n' +"Estudiante{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

}
