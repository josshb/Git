package model;

public class Gerente extends Empleado {

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return super.getSalario()*1.05;
	}
	
	
}
