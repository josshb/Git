package model;

public class Estudiante {
	

    public Estudiante() {
    }

    //Inyectaremos 2 propiedades via setter
    private String nombre;
    private int edad;
    
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
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
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

}
