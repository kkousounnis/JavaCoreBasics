package factory;

import interfaces.Color;
import interfaces.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String Color);
    public abstract Shape getShape(String shape);
}
