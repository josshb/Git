package patron;

import beans.color.Azul;
import beans.color.Verde;
import beans.color.Rojo;
import beans.color.Color;
import beans.shape.Shape;

/**
 *
 * @author Antonio
 */
public class ColorFactory extends AbstractFactory {

    // Es nuevo lo de heredar de AbsractFactory
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {

        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("ROJO")) {
            return new Rojo();

        } else if (color.equalsIgnoreCase("VERDE")) {
            return new Verde();

        } else if (color.equalsIgnoreCase("AZUL")) {
            return new Azul();
        }

        return null;
    }

}
