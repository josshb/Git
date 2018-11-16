package patos;

import Behavior.graznar.Quack;
import Behavior.volar.FlyWithWings;

/**
 *
 * @author Antonio
 */
public class RedHeadDuck  extends Duck {

    public RedHeadDuck() {
        quackBehavior = new Quack();
        ﬂyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a RedHeadDuck duck");
    }
    
}
