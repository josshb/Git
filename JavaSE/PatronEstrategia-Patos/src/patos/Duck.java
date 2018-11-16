package patos;

import Behavior.graznar.QuackBehavior;
import Behavior.volar.FlyBehavior;

/**
 *
 * @author Antonio
 */
public abstract class Duck {

    FlyBehavior ﬂyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        ﬂyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        ﬂyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All ducks ﬂoat, even decoys!");
    }

}
