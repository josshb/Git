package modelo;

public class Director {
	private Empleado dire;
	private Departamento dep;
	public Director() {
		super();
	}
	public Director(Empleado dire, Departamento dep) {
		super();
		this.dire = dire;
		this.dep = dep;
	}
	public Empleado getDire() {
		return dire;
	}
	public void setDire(Empleado dire) {
		this.dire = dire;
	}
	public Departamento getDep() {
		return dep;
	}
	public void setDep(Departamento dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Director [dire=" + dire + ", dep=" + dep + "]";
	}
	
	

}
