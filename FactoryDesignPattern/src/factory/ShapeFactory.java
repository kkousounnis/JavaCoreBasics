package factory;

import interfaces.Shape;
import models.Circle;
import models.Rectangle;
import models.Square;

public class ShapeFactory {

    //use getShape method to get object of typeshape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

}
