package patron;

import beans.color.Color;
import beans.shape.Shape;

/**
 *
 * @author Antonio
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
