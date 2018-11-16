package patos;

import Behavior.graznar.Squeak;
import Behavior.volar.FlyNoWay;

/**
 *
 * @author Antonio
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        ﬂyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I’m a RubberDuck");
    }

}
