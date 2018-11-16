package observer;

/**
 *
 * @author Antonio
 */
public class NewsChannel implements Observer {

   
    @Override
    public void update(int temperature, int humedad, int presion) {
        System.out.println("-- News Channel ha sido informada de la temperatura " + temperature + " grados, humedad "+ humedad+ " y presion "+presion);
    }
}
