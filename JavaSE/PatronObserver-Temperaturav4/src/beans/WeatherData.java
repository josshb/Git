package beans;

/**
 *
 * @author Antonio
 */
public class WeatherData {

    //Incluye las variables a observar
    private int temperature;
    private int humedad;
    private int presion;

    public WeatherData() {
    }

    public WeatherData(int temperature, int humedad, int presion) {
        this.temperature = temperature;
        this.humedad = humedad;
        this.presion = presion;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }
    
    public void cambioTotal(int temperature, int humedad, int presion) {
        this.temperature = temperature;
        this.humedad = humedad;
        this.presion = presion;
    }    

}
