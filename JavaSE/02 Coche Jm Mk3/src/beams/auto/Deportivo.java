package beams.auto;

import util.LecturaDatos;

public class Deportivo extends Coche{
private int descapotable;

public Deportivo() {
	}

public Deportivo(int descapotable, String marca, String modelo, String color, String combustible, int numPuertas, int potencia,
		int consumoGas) {
	super(marca, modelo, color, combustible, numPuertas, potencia, consumoGas);
	// TODO Auto-generated constructor stub
}

public int getDescapotable() {
	return descapotable;
}

public void setDescapotable(int descapotable) {
	this.descapotable = descapotable;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Deportivo [descapotable=");
	builder.append(descapotable);
	builder.append("]");
	return builder.toString();
}
public void crearDeportivo() {
	super.crearCoche();
	this.setDescapotable(LecturaDatos.leerInteger("Es descapotable: "));

}
public void imprimirInforme() {
	super.imprimirInforme();
	System.out.println(super.toString()+this.toString());
}






}
