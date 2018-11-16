package observer;

/**
 *
 * @author Antonio
 */
public class NewsChannel implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("-- News Channel ha sido informada de la temperatura: " + temperature + " grados");
    }
}
