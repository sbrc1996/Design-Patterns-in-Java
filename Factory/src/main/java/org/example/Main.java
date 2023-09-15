package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Factory Pattern");

        ShapeFactory shapeFactoryObject = new ShapeFactory();
        IShape shapeObj = shapeFactoryObject.getShape("CIRCLE");
        shapeObj.draw();

        shapeObj = shapeFactoryObject.getShape("SQUARE");
        shapeObj.draw();

        shapeObj = shapeFactoryObject.getShape("RECTANGLE");
        shapeObj.draw();

    }
}