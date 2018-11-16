package observer;

import java.util.Observable;
import java.util.Observer;
import beans.WeatherData;

/**
 *
 * @author Antonio
 */
public class Agencias implements Observer {

    private String nombre;

    public Agencias() {
    }

    public Agencias(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        //Yo sé que estoy midiendo un objeto Estacion Meteorologica
        // Y lo que me han pasado como segundo argumento es de tipo   WeatherData
        WeatherData w = (WeatherData) arg;
        System.out.println("-- "+this.getNombre()+ " ha sido informada de la temperatura " + w.getTemperature() + " grados, humedad " + w.getHumedad() + " y presion " + w.getPresion());

    }    

}
