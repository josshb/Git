package beans;

import java.util.Objects;
import utilidades.LecturaDatos;

/**
 *
 * @author Antonio
 */
public class Pixel {
    
    private Punto punto = new Punto();
    private String color;

    public Pixel() {
    }

    public Pixel(Punto punto, String color) {
        this.punto = punto;
        this.color = color;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pixel other = (Pixel) obj;
        if (!Objects.equals(this.punto, other.punto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pixel{" + "punto=" + punto + ", color=" + color + '}';
    }
    
    public void crearPixel() {
        System.out.println("CREADOR DE PIXEL");
        this.punto.crearPunto();
        this.color = LecturaDatos.leerString("Digame el color: ");        
        // ...
    }    
    public void imprimeInforme() {    
        System.out.println(this.toString());

        
    }    
    
    
    
}
