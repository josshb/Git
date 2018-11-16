package observer;

/**
 *
 * @author Antonio
 */
public class WeatherInfoWebsite implements Observer {

    @Override
    public void update(int temperature, int humedad, int presion) {
        System.out.println("-- Weather Info Websites ha sido informada de la temperatura " + temperature + " grados, humedad " + humedad + " y presion " + presion);
    }
}
