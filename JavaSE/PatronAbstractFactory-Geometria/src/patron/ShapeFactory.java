package patron;

import beans.color.Color;
import beans.shape.Circulo;
import beans.shape.Shape;
import beans.shape.Rectangulo;
import beans.shape.Cuadrado;

/**
 *
 * @author Antonio
 */
public class ShapeFactory extends AbstractFactory {
    
    // Es nuevo lo de heredar de AbsractFactory

    //use getShape method to get object of type shape 
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCULO")) {
            return new Circulo();

        } else if (shapeType.equalsIgnoreCase("RECTANGULO")) {
            return new Rectangulo();

        } else if (shapeType.equalsIgnoreCase("CUADRADO")) {
            return new Cuadrado();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
