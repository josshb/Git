package control;

import javax.swing.JOptionPane;

import personas.Personas;

public class Asignador {
	
	
	
	
public static int asignar() {
	
	Personas P1=new Personas(JOptionPane.showInputDialog("�Cu�l es tu nombre?"),Integer.parseInt(JOptionPane.showInputDialog("Ahora introduce tu edad por favor")));
	
	
	int EdadP1;
	
	return EdadP1= P1.getEdad();
	
	
	
	
	
	
}
	
	
}
