package Behavior.graznar;

import Behavior.graznar.QuackBehavior;

/**
 *
 * @author Antonio
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
