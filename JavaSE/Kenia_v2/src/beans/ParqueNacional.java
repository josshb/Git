package beans;

/**
 *
 * @author Antonio
 */
public abstract class ParqueNacional {

    private String nombre;
    private int extension;
    private int numEspecies;

    public ParqueNacional() {
    }

    public ParqueNacional(String nombre, int extension, int numEspecies) {
        this.nombre = nombre;
        this.extension = extension;
        this.numEspecies = numEspecies;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEspecies() {
        return numEspecies;
    }

    public void setNumEspecies(int numEspecies) {
        this.numEspecies = numEspecies;
    }

    public abstract void abrirParque();

    @Override
    public String toString() {
        return "        nombre=" + nombre + ", extension=" + extension + ", numEspecies=" + numEspecies + '}';
    }
}
