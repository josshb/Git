package edades;

import javax.swing.JOptionPane;

public class Edades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Edad=Integer.parseInt(JOptionPane.showInputDialog("introduce tu edad"));
		
		if (Edad<=4) {
			JOptionPane.showMessageDialog(null, "Peque�in");
			
		}else if (Edad<10) {
			JOptionPane.showMessageDialog(null, "ni�o");

			
		}else if (Edad<40) {
			JOptionPane.showMessageDialog(null, "adulto");
		
		}else if (Edad<100) {
			JOptionPane.showMessageDialog(null, "talludito");
		}else {
			JOptionPane.showMessageDialog(null, "te queda poquito");
		}
	}

}
