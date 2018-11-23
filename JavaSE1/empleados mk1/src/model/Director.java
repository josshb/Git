package model;

public class Director extends Gerente{

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return super.getSalario()*1.05;
	}

}
