package beans;

import utilidades.LecturaDatos;

/**
 *
 * @author Antonio
 */
public class Punto {
    
    private int px;
    private int py;

    public Punto() {
    }

    public Punto(int px, int py) {
        this.px = px;
        this.py = py;
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public int getPy() {
        return py;
    }

    public void setPy(int py) {
        this.py = py;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.px;
        hash = 23 * hash + this.py;
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
        final Punto other = (Punto) obj;
        if (this.px != other.px) {
            return false;
        }
        if (this.py != other.py) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "P(" + px + "," + py + ')';
    }
    
    

    

    public void crearPunto() {
        System.out.println("CREADOR DE PUNTOS");

        this.setPx(LecturaDatos.leerInteger("Coordenada X: "));
        this.setPy(LecturaDatos.leerInteger("Coordenada Y: "));        
        // ...
    }

    public void imprimeInforme() {    
        System.out.println(this.toString());
    }

}
