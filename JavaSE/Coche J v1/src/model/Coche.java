package model;

public class Coche {
/*
 * Crear la clase Coche
a) Guardar el modelo, color, si la pintura es metalizada, matrícula, el tipo de coche (utilitario,
familiar, deportivo), año de fabricación y la modalidad del seguro (terceros o todo riesgo).
b) Redefinir el método toString() para imprimir los datos
 */
	private String modelo;
	private String color;
	private boolean metalizado;
	private String matricula;
	private String tipo;
	private int año;
	private boolean seguroTodoRiesgo;
	
	public Coche (){
		
	}
	public String getmodelo(){
		return modelo;
		
	}
	public void setmodelo(String modelo){
		this.modelo=modelo;
		
	}
	public String getcolor(){
		return color;
		
	}
	public void setcolor(String color){
		this.color=color;
		
	}
	
	public boolean ismetalizado(){
		return metalizado;
		
	}
	public void setmetalizado(boolean metalizado){
		this.metalizado=metalizado;
		
	}
	public String getmatricula(){
		return matricula;
	}
	public void setmatricula(String matricula){
		this.matricula=matricula;
		
	}
	public String gettipo(){
		return tipo;
		
	}
	public void settipo(String tipo){
		this.tipo=tipo;
		
	}
	public int getaño(){
		return año;
				
	}
	public void setaño(int año){
		this.año=año;
		
	}
	public boolean isseguroTodoRiesgo(){
		return seguroTodoRiesgo;
	}
	public void setseguroTodoRiesgo(boolean seguroTodoRiesgo){
		this.seguroTodoRiesgo=seguroTodoRiesgo;
	}
	
	public String toString() {
		return "Es un " + modelo + " "+ tipo+ " color " +color+" del año "+año+ " con matricula "+matricula + ". \n Pintura metalizada: " + metalizado +"\n Seguro a todo riesgo: "+seguroTodoRiesgo;
	}
	
	
}

