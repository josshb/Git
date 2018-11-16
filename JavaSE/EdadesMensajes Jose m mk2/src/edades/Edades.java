package edades;

import javax.swing.JOptionPane;

import model.Numero;

public class Edades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Edad=new Numero().getNumero();
		
		//int Edad=Integer.parseInt(JOptionPane.showInputDialog("introduce tu edad"));
		
		if (Edad<=4) {
			JOptionPane.showMessageDialog(null, "Ohh tienes solo " + Edad +" eres un Pequeñin");
			
		}else if (Edad<10) {
			JOptionPane.showMessageDialog(null, "Que mono, aun te queda por aprender a tus "+Edad+". Niño");

			
		}else if (Edad<40) {
			JOptionPane.showMessageDialog(null, "Estas en la flor de la vida. A tus "+Edad+" ¿eres un adolescente? ¬¬ ");
		
		}else if (Edad<100) {
			JOptionPane.showMessageDialog(null, "Hay que cuidarse, con " +Edad+" empiezas a estar ya talludito");
		}else {
			JOptionPane.showMessageDialog(null, "Con "+Edad+" te queda poquito");
		}
	}

}
