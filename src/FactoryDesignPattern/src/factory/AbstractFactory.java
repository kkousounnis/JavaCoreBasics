package factory;

import interfaces.Color;
import interfaces.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String Color);
    abstract Shape getShape(String shape);
}
