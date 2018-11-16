package model;

public class FUrgoneta extends Coche {
private int capacidad_carga;
private int plazas_extra;

public FUrgoneta() {
	// TODO Auto-generated constructor stub
}

public FUrgoneta(int capacidad_carga, int plazas_extra) {
	super();
	this.capacidad_carga = capacidad_carga;
	this.plazas_extra = plazas_extra;
}

public int getCapacidad_carga() {
	return capacidad_carga;
}

public void setCapacidad_carga(int capacidad_carga) {
	this.capacidad_carga = capacidad_carga;
}

public int getPlazas_extra() {
	return plazas_extra;
}

public void setPlazas_extra(int plazas_extra) {
	this.plazas_extra = plazas_extra;
}

@Override
public String toString() {
	return "FUrgoneta [capacidad_carga=" + capacidad_carga + ", plazas_extra=" + plazas_extra + "]";
}





}
