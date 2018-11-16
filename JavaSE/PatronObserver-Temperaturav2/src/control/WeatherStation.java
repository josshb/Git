package control;

import subject.WeatherBroadcast;
import observer.NewsPaperAgency;
import observer.NewsChannel;
import observer.WeatherInfoWebsite;
import observer.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio
 */
public class WeatherStation {

    public void iniciar() {
        WeatherBroadcast weatherBroadcast = new WeatherBroadcast();
        //Incluyo tres observadores
        Observer newsPaperAgency = new NewsPaperAgency();
        Observer newsChannel = new NewsChannel();
        Observer weatherInfoWebsite = new WeatherInfoWebsite();
        //Los añado a la lista
        weatherBroadcast.addObserver(newsPaperAgency);
        weatherBroadcast.addObserver(newsChannel);
        weatherBroadcast.addObserver(weatherInfoWebsite);
        //Les informo
        System.out.println("Cambios en la temperatura. Sube a 30 grados");
        System.out.println("Aviso a todos los Observadores\n");
        weatherBroadcast.setTemperature(30);
        System.out.println("\nDespues de 10 segundos, la temperatura aumentará a 33 grados, la presion a 60 y la humedad a 85...\n");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WeatherStation.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Cambios en la temperatura. Sube a 33 grados, la presion a 60 y la humedad a 85");
        System.out.println("Aviso a todos los Observadores\n");        
        weatherBroadcast.conditionsChanged(33,60,85);

    }
  
}
