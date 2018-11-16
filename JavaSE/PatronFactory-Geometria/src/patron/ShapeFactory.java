package patron;

import beans.shape.Cuadrado;
import beans.shape.Shape;
import beans.shape.Rectangulo;
import beans.shape.Circulo;

/**
 *
 * @author Antonio
 */
public class ShapeFactory {
    
    //use getShape method to get object of type shape 
    public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCULO")){
         return new Circulo();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGULO")){
         return new Rectangulo();
         
      } else if(shapeType.equalsIgnoreCase("CUADRADO")){
         return new Cuadrado();
      }
      
      return null;
   }
    
}
