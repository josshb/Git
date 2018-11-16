package utilidades;

import java.util.ArrayList;
import java.util.List;

public class Conversor {

	
	
	
	public static <E> void ArrayToArrayList(E[] a, ArrayList<E> lst) {
		for (E e : a) {
			lst.add(e);
		}
		System.out.println("---"+lst);
	}
	
	public static <E> void ArrayToArrayList2(E[] a, List<E> lst) {
		for (E e : a) {
			lst.add(e);
		}
		System.out.println("---"+lst);
	}	
	
	
	//Me parece mas correcta esta versión
	public static <E> void ArrayToArrayList(E[] a) {
		List<E> lst = new ArrayList<>();
		for (E e : a) {
			lst.add(e);
		}
		System.out.println("---"+lst);
	}	
	
}

