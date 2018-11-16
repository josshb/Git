package subject;

/**
 *
 * @author Antonio
 */
import observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherBroadcast implements Subject {

    private List<Observer> listOfObservers;
    private int temperature;

    public WeatherBroadcast() {
        listOfObservers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : listOfObservers) {
            observer.update(temperature);
        }
    }

    // Método muy importante
    //Si huberia más propiedades que cambian llamariamos desde aqui a los distintos métodos
    public void temperatureChanged(int newTemperature) {
        temperature = newTemperature;
        notifyObservers();
    }
}
