package observer;

/**
 *
 * @author Antonio
 */
public class NewsPaperAgency implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("-- News Paper  ha sido informada de la temperaturas: " + temperature + " grados");
    }
}
