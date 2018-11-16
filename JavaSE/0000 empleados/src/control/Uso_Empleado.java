package control;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Empleado em1 = new Empleado("antonio", 1000, 2015, 2, 10); Empleado em2 = new
		 * Empleado("Paco", 1300, 2003, 4, 3); Empleado em3 = new Empleado("Maria",
		 * 1200, 2009, 4, 30);
		 * 
		 * em1.subesueldo(53); em2.subesueldo(47); em3.subesueldo(10);
		 * 
		 * System.out.println(em1.getsueldo());
		 */
		Jefatura jefe1=new Jefatura("Paco", 12000, 1990, 3, 5);
		
		jefe1.setIncentivo(7334);
		
		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("antonio", 1000, 2015, 2, 10);
		misEmpleados[1] = new Empleado("maria", 1000, 2015, 2, 10);
		misEmpleados[2] = new Empleado("paco", 1000, 2015, 2, 10);
		misEmpleados[4] = jefe1;
		misEmpleados[5]	= new Jefatura("ernesta", 239934, 1999, 17, 2);
		
		
		
		/*
		 * for (int i = 0; i < misEmpleados.length; i++) {
		 * misEmpleados[i].subesueldo(7);
		 * 
		 * } for (int i = 0; i < misEmpleados.length; i++) { System.out.println("nombre"
		 * + Arrays.toString(misEmpleados)); }
		 */
		Arrays.sort(misEmpleados);
		for (Empleado e : misEmpleados) {
			e.subesueldo(10);
		}
		for (int i = 0; i < misEmpleados.length; i++) {
			System.out.println(Arrays.toString(misEmpleados));
		}
	}

}

class Empleado {

	public Empleado(String nom, double sueldo, int ano, int mes, int dia) {
		this.nom = nom;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(ano, mes - 1, dia);
		altaContrato = calendario.getTime();
		System.out.println(toString());

	}

	public String getNom() {
		return nom;
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

class Jefatura extends Empleado {

	public Jefatura(String nom, double sueldo, int ano, int mes, int dia) {
				super(nom, sueldo, ano, mes, dia);
				// TODO Auto-generated constructor stub
			}
	private double incentivo;
	public double getIncentivo() {
		return incentivo;
	}
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	public double getsueldo() {
		double sueldojefe=super.getsueldo();
		return sueldojefe+getIncentivo();
		
	}
	
	
}