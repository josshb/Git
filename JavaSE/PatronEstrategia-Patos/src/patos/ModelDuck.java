package patos;

import Behavior.graznar.Quack;
import Behavior.volar.FlyNoWay;

/**
 *
 * @author Antonio
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        ﬂyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}
