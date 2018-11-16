package patos;

import Behavior.graznar.Quack;
import Behavior.volar.FlyWithWings;

/**
 *
 * @author Antonio
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        
        quackBehavior = new Quack();
        ﬂyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}

