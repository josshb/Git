package beans;

import java.util.Arrays;
import utilidades.SimuladorLoto;

/**
 *
 * @author Antonio
 */
public class Apuesta {
    
    private int[] apuesta = new int[6];
    

    public Apuesta() {
    }

    public int[] getApuesta() {
        return apuesta;
    }

    public void setApuesta(int[] apuesta) {
        this.apuesta = apuesta;
    }
    
    public void rellenarApuesta(){
       apuesta = SimuladorLoto.simuladorApuestalotoNoRepes();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Apuesta other = (Apuesta) obj;
        if (!Arrays.equals(this.apuesta, other.apuesta)) {
            return false;
        }
        return true;
    }
    
    public void leerApuesta(){
    	Arrays.sort(apuesta);
        for (int i = 0; i < 6; i++) {
            System.out.println("["+(i+1)+"]: "+apuesta[i]);
        }
    }

    @Override
    public String toString() {
        return "Apuesta{" + "apuesta=" + apuesta + '}';
    }
    
    
    
    
}
