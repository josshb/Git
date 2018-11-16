package control;

import subject.WeatherBroadcast;
import observer.NewsPaperAgency;
import observer.NewsChannel;
import observer.WeatherInfoWebsite;
import observer.Agencias;
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
        Agencias ag1 = new NewsPaperAgency("News Paper Agency");
        Agencias ag2 = new NewsChannel("News Channel");
        Agencias ag3 = new WeatherInfoWebsite("Weather Info Website");
        
        //Los añado a la lista
        weatherBroadcast.addObserver(ag1);
        weatherBroadcast.addObserver(ag2);
        weatherBroadcast.addObserver(ag3);
        
        //Les informo
        System.out.println("Cambios en la temperatura. Sube a 30 grados");
        System.out.println("Aviso a todos los Observadores\n");
        weatherBroadcast.setTemperature(30);
        
        //Ocurren cosas
        System.out.println("\nDespues de 5 segundos, la temperatura aumentará a 33 grados, la presion a 60 y la humedad a 85...\n");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WeatherStation.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Aviso a todos los Observadores\n"); 
        //Cambio todo
        weatherBroadcast.conditionsChanged(33,60,85);

    }
  
}