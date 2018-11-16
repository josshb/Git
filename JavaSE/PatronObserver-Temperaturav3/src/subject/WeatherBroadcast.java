package subject;

/**
 *
 * @author Antonio
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherBroadcast extends Observable {

    private List<Observer> listOfObservers;

    //Incluye las variables a observar
    private int temperature;
    private int humedad;
    private int presion;

    public WeatherBroadcast() {
        listOfObservers = new ArrayList<>();
    }

    public WeatherBroadcast(int temperature, int humedad, int presion) {
        this.temperature = temperature;
        this.humedad = humedad;
        this.presion = presion;
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

    //Sobreescribo el metodo de la clase java.util.Observable// existen dos cabeceras
    // public void notifyObservers()
    // public void notifyObservers(Object arg)
    @Override
    public void notifyObservers() {
        // El primer this es el objeto Observable
        // El segundo this es por la propiedad modificada
        //      En este caso proporciono todas
        listOfObservers.stream().forEach(
                (observer) -> {
                    observer.update(this, this);
                }
        );
    }

    //Debo hacerlo pq el método original no sabe que yo tengo una lista 
    @Override
    public synchronized void addObserver(Observer o) {
        listOfObservers.add(o);
    }

    public void conditionsChanged(int newTemperature, int newHumedad, int newPresion) {
        this.temperature = newTemperature;
        this.humedad = newHumedad;
        this.presion = newPresion;
        notifyObservers();
    }

}
