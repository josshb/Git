package observer;

/**
 *
 * @author Antonio
 */
public class WeatherInfoWebsite implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("-- Weather Info Websites  ha sido informada de la temperatura: " + temperature + " grados");
    }
}
