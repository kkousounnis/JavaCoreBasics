package factory;

import interfaces.Color;
import interfaces.Shape;
import models.Blue;
import models.Green;
import models.Red;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String colorΤype) {
        if (colorΤype == null) {
            return null;
        }
        if (colorΤype.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorΤype.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (colorΤype.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

}
