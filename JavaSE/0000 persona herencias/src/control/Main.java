package control;

import java.util.Date;
import java.util.GregorianCalendar;

import control.Main.persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona[] per1=new persona[2];
		per1[0]=new Alumno("perico", "ciencilogia");
		per1[1]=new Empleado("ernesto", 1000, 1999, 10, 11);
		
		
		
		
	}
	abstract class persona{
		
		private String nom;

		public persona(String nom) {
			// TODO Auto-generated constructor stub
			this.nom=nom;
			
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}
		public abstract String damedescripcion();
	}
		
		
	
	class Empleado extends persona{
	
		public Empleado(String nom, double sueldo, int ano, int mes, int dia) {
			super(nom);
			this.sueldo = sueldo;
			GregorianCalendar calendario = new GregorianCalendar(ano, mes - 1, dia);
			altaContrato = calendario.getTime();
			System.out.println(toString());

		}
		public String damedescripcion() {
			return "id ";
			
		}
		public double getsueldo() {
			return sueldo;
		}

		public Date getaltaContrato() {
			return altaContrato;
		}

		public void subesueldo(double porcentaje) {
			double aumento = sueldo * porcentaje / 100;
			sueldo += aumento;
		}

		private String nom;
		private double sueldo;
		private Date altaContrato;

		@Override
		public String toString() {
			return "Empleado [nom=" + nom + ", sueldo=" + sueldo + ", altaContrato=" + altaContrato + "]";
		}

	}

}
class Alumno extends persona{
	private String carrera;
	public Alumno(String nom, String carrera) {
		super(nom);
		this.carrera=carrera;
		
	}
	

	@Override
	public String damedescripcion() {
		// TODO Auto-generated method stub
		return null;
	}
	
}