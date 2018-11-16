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
    
    //Incluye más variables a observar
    private int temperature;
    private int humedad;
    private int presion;

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
            //observer.update(temperature);
            observer.update(temperature, humedad, presion);
        }
    }

    // Método muy importante
    //Si huberia más propiedades que cambian llamariamos desde aqui a los distintos métodos
    public void conditionsChanged(int newTemperature, int newHumedad,int newPresion) {
        this.temperature = newTemperature;
        this.humedad = newHumedad;
        this.presion = newPresion;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
        notifyObservers();
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
        notifyObservers();
    }
    
    
}
