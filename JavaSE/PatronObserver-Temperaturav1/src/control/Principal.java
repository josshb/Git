package control;

/**
 *
 * @author Antonio
 *
  * Observer pattern is used when there is one to many relationship between
 * objects such as if one object is modified, its depenedent objects are to be
 * notified automatically. Observer pattern falls under behavioral pattern
 * category.
 *
 * Implementation
 *
 * Observer pattern uses three actor classes. Subject, Observer and Client.
 * Subject, an object having methods to attach and de-attach observers to a
 * client object. We've created classes Subject, Observer abstract class and
 * concrete classes extending the abstract class the Observer. *
 */
public class Principal {

    public static void main(String[] args) {
        new WeatherStation().iniciar();
    }
    
}
