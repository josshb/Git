package observer;

import java.util.Observable;
import java.util.Observer;
import subject.WeatherBroadcast;

/**
 *
 * @author Antonio
 */
public class WeatherInfoWebsite extends Agencias {

    public WeatherInfoWebsite() {
    }

    public WeatherInfoWebsite(String nombre) {
        super(nombre);
    }

    @Override
    public void update(Observable o, Object arg) {
        //Yo sé que estoy midiendo un objeto Estacion Meteorologica
        // Y lo que me han pasado como segundo argumento es de tipo   WeatherBroadcast
        WeatherBroadcast w = (WeatherBroadcast) arg;
        System.out.println("-- Weather Info Websites ha sido informada de la temperatura " + w.getTemperature() + " grados, humedad " + w.getHumedad() + " y presion " + w.getPresion());

    }
}
