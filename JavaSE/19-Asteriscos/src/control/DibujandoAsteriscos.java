
package control;

/**
 *
 * @author Antonio
 */
public class DibujandoAsteriscos {
    
    public static void Metodo1(int numAsteriscos){
        for (int fila = 1; fila <= numAsteriscos; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void Metodo2(int numAsteriscos){
        for (int fila = 1; fila <= numAsteriscos; fila++) {
            for (int columna = 1; columna <= numAsteriscos-fila; columna++) {
                System.out.print("  ");
            }            
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }  
    
    public static void Metodo3(int numAsteriscos){
        for (int fila = 1; fila <= numAsteriscos; fila++) {
            for (int columna = 1; columna <= numAsteriscos-fila; columna++) {
                System.out.print("  ");
            }            
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* * ");
            }
            System.out.println("");
        }
    }       
}
