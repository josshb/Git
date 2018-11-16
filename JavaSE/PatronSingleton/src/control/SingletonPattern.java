package control;

/**
 *
 * @author Antonio
 *
 * Singleton pattern is one of the simplest design patterns in Java. This type
 * of design pattern comes under creational pattern as this pattern provides one
 * of the best way to create an object.
 *
 * This pattern involves a single class which is responsible to creates own
 * object while making sure that only single object get created. This class
 * provides a way to access its only object which can be accessed directly
 * without need to instantiate the object of the class.
 *
 */
public class SingletonPattern {

    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        //No uso el new. Accedo al objeto a traves de este método
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();

        SingleObject object2 = SingleObject.getInstance();
        object2.showMessage();
        
        SingleObject object3 = SingleObject.getInstance();
        object3.showMessage();        
        
        System.out.println("-------------");
        
        //Clasical
        new ClassicObject().showMessage();
        new ClassicObject().showMessage();        
    }

}
