package model;

/**
*
* @author Antonio
*/
public class ProcesadorImplRed implements Procesador {

   public void procesar (String s){
       System.out.println("--- IMPRIMIENDO PARA LA RED ---");
       System.out.println(s);
       //Abro socket (IP, puerto)
       //socket.send()
   }
   
}