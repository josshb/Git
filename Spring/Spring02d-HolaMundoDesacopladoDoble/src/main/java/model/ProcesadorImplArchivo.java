package model;

/**
*
* @author Antonio
*/
public class ProcesadorImplArchivo implements Procesador {

   public void procesar (String s){
       System.out.println("--- IMPRIMIENDO EN UN ARCHIVO ---");
       System.out.println(s);
   }
   
}