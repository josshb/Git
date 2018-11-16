package utilidades;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class LecturaDatos {
    
   
    //metodo estatico
    public static String leerString(){
         return new Scanner(System.in).nextLine();
    }  
    public static int leerInt(){
         return new Scanner(System.in).nextInt();
    }      
    
}
