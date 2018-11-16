package beans;

import beans.materiales.Materiales;
import beans.materiales.Porcelana;

/**
 *
 * @author Antonio
 */
public class Taza<T> {

    private T item;   
    private short capacidad;

    public Taza() {
    }

    public Taza(T item, short capacidad) {
        System.out.println("Taza " + item.getClass());
        this.item = item;
        this.capacidad = capacidad;
    }
    
    public Taza(T item, String msg) {
        System.out.println(msg);
        System.out.println("Taza " + item.getClass());
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

	public short getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(short capacidad) {
		this.capacidad = capacidad;
	}
	
	public int costeTaza(){
		//Ojo. Me caso con Materiales
		
		int coste = capacidad * ((Materiales)item).getPrecio(); 
		
		//Lo siguiente es mu feo pero es para ilustrar
		//Para que esto fuera correcto necesito que el precio final
		//viniera ya dado
		// Patron Decorator
		if (item instanceof Porcelana){
			if (((Porcelana)item).getProcedencia().equals("Ming")){
				coste *= 2.15;
			}
			
		}
		return coste;
	}

	@Override
	public String toString() {
		return "Taza [item=" + item + ", capacidad=" + capacidad + " y su coste es :"+this.costeTaza()+ "]";
	}
	
	
    
    
    



}

