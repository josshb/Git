package model;

public class ProcesadorImplConsola implements Procesador {

    public void procesar (String s){
        System.out.println("--- IMPRIMIENDO EN UNA CONSOLA ---");
        System.out.println(s);
    }
	 

}
