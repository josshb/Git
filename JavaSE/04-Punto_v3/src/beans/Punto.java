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
		final int prime = 31;
		int result = 1;
		result = prime * result + px;
		result = prime * result + py;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (px != other.px)
			return false;
		if (py != other.py)
			return false;
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

    public void distanciaDosPuntos(Punto p){
        System.out.println("-- calcular distancia");
        System.out.println("Punto 1: "+this);
        System.out.println("Punto 2: "+p);        
        double x = Math.pow((p.px - this.px),2);
        double y = Math.pow((p.py - this.py),2);        
        double dist = Math.sqrt(x+y);
        System.out.println("Distancia: "+dist);
    }
    
    //SE podria hacer static? ¿einn?
    //Si la haces el cuerpo te pide la version v4
    public static void distanciaDosPuntos(Punto p1, Punto p2){
        System.out.println("-- calcular distancia");
        System.out.println("Punto 1: "+p1);
        System.out.println("Punto 2: "+p2);        
        double x = Math.pow((p1.px - p2.px),2);
        double y = Math.pow((p1.py - p2.py),2);        
        double dist = Math.sqrt(x+y);
        System.out.println("Distancia: "+dist);
    }
    
    public void distanciaCentro(){
        this.distanciaDosPuntos(new Punto(0,0));
    }
    public void imprimeInforme() {    
        System.out.println(this.toString());

        
    }

}
