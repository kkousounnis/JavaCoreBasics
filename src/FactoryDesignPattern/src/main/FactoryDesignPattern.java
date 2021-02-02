/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import factory.AbstractFactory;
import factory.FactoryProducer;
import interfaces.Color;
import interfaces.Shape;

/**
 *
 * @author konstantinos
 */
public class FactoryDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        
        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");        
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        
        //get an object of Color
        Color color1 = colorFactory.getColor("RED");        
        color1.fill();
        
        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();
        
        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }

}
