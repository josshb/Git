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
		super();
	}

	public Punto(int px, int py) {
		super();
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + px;
		result = prime * result + py;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
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

    public void imprimeInforme() {    
        System.out.println(this.toString());
    }

}
