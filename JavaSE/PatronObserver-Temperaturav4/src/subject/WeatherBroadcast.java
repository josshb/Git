package subject;

/**
 *
 * @author Antonio
 */
import beans.WeatherData;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherBroadcast extends Observable {

    // Quienes observan
    private List<Observer> listOfObservers;
    // Que observan
    private WeatherData pronostico;
    

    public WeatherBroadcast() {
        listOfObservers = new ArrayList<>();
    }

    public WeatherBroadcast(WeatherData pronostico) {
        listOfObservers = new ArrayList<>();
        this.pronostico = pronostico;
    }

    public List<Observer> getListOfObservers() {
        return listOfObservers;
    }

    public void setListOfObservers(List<Observer> listOfObservers) {
        this.listOfObservers = listOfObservers;
    }

    public WeatherData getPronostico() {
        return pronostico;
    }

    public void setPronostico(WeatherData pronostico) {
        this.pronostico = pronostico;
    }

    @Override
    public void notifyObservers() {
        // El primer this es el objeto Observable
        // El segundo this es por la propiedad modificada
        //      En este caso proporciono solo el pronostico
        listOfObservers.stream().forEach(
                (observer) -> {
                    observer.update(this, pronostico);
                }
        );
    }

    @Override
    public synchronized void addObserver(Observer o) {
        listOfObservers.add(o);
    }

    public void conditionsChanged(int newTemperature, int newHumedad, int newPresion) {
        pronostico.cambioTotal(newTemperature, newHumedad, newPresion);
        notifyObservers();
    }

}
