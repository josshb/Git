package control;

/**
 *
 * @author Antonio
 */
import beans.Taza;
import beans.materiales.Cristal;
import beans.materiales.Porcelana;
import datos.Vajilla;

public class Alacena {
    
    private Vajilla vajilla = new Vajilla();

    public Alacena() {
    }

    public Vajilla getVajilla() {
        return vajilla;
    }

    public void setVajilla(Vajilla vajilla) {
        this.vajilla = vajilla;
    }
    
    public void gestion(){
        
        //lo que estoy haciendo es mu feo.
        // Realmente estoy haciedno una prueba
        Porcelana p1 = new Porcelana("Ming",100);
        Taza<Porcelana> t1 = new Taza<>(p1,(short)100);
        Porcelana p2 = new Porcelana("Chang",100);        
        Taza<Porcelana> t2 = new Taza<>(p2,(short)150);
        Taza<Porcelana> t3 = t2;
        //guarda solo 2 objetos pq t3 = t2 y estoy usando Set
        vajilla.anadir(t1);
        vajilla.anadir(t2);
        vajilla.anadir(t3);
        
        Cristal c = new Cristal("Esmerilado","pequeño",100);
        Taza<Cristal> c1 = new Taza<>(c,(short)50);
        vajilla.anadir(c1);

        System.out.println(vajilla);
    }
}
