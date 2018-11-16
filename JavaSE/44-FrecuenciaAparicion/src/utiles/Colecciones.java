package utiles;

import java.util.Collection;

public class Colecciones {
	
	public static <E> int frecuencia(Collection<E> col, E elem){
		int suma= 0;
		for(E e:col){
			if(e.equals(elem)){
				suma++;
			}
		}
		return suma;
	}
}
