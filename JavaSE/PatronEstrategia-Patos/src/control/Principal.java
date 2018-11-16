package control;

import java.util.ArrayList;
import java.util.List;
import patos.Duck;
import patos.MallardDuck;
import patos.RubberDuck;

/**
 *
 * @author Antonio
 */
public class Principal {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("-------------");
        Duck patitoGoma = new RubberDuck();
        patitoGoma.display();
        patitoGoma.performFly();
        patitoGoma.performQuack();

        List<Duck> l = new ArrayList<>();
        l.add(mallard);
        l.add(patitoGoma);
        for (Duck d : l) {
            d.display();
            d.performFly();
            d.performQuack();
        }

    }

}
