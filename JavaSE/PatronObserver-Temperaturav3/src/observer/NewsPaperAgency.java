package observer;

import java.util.Observable;
import java.util.Observer;
import subject.WeatherBroadcast;

/**
 *
 * @author Antonio
 */
public class NewsPaperAgency extends Agencias {

    public NewsPaperAgency() {
    }

    public NewsPaperAgency(String nombre) {
        super(nombre);
    }

    @Override
    public void update(Observable o, Object arg) {
        //Yo sé que estoy midiendo un objeto Estacion Meteorologica
        // Y lo que me han pasado como segundo argumento es de tipo   WeatherBroadcast
        WeatherBroadcast w = (WeatherBroadcast) arg;
        System.out.println("-- News Paper ha sido informada de la temperatura " + w.getTemperature() + " grados, humedad " + w.getHumedad() + " y presion " + w.getPresion());

    }
}
