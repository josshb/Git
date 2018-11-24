package model;

import org.springframework.beans.factory.annotation.Value;

public class Estudiante {
	

	//Inyectaremos 2 propiedades via setter
    @Value("${estudiante.nombre}")
    private String nombre;
    
    @Value("${estudiante.edad}")  
    private Integer edad;
    
    public Estudiante() {
    }

    public Estudiante(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

    public Integer getEdad() {
    	System.out.println("-- en get");    	
        return edad;
    }

    public void setEdad(Integer edad) {
    	System.out.println("-- en setE");
    	
        this.edad = edad;
    }

    public String getNombre() {
    	System.out.println("-- en getn");    	
        return nombre;
    }

    public void setNombre(String nombre) {
    	System.out.println("-- en setN");    	
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

}
