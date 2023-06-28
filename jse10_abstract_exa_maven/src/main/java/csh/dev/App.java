package csh.dev;

import csh.abstract_exa.*;
/**
 * author: cshdev110
 * version: 0.0.1
 */
public final class App {
    
    public static void main(String[] args) {
        GeometricShape circle = new Circle("Circle");
        GeometricShape rectangle = new Rectangle("Rectangle");
        GeometricShape triangle = new Triangle("Triangle");

        circle.draw();
        circle.draw2();

        rectangle.draw();
        rectangle.draw2();

        triangle.draw();
        triangle.draw2();
        
        System.out.println();

        // toString is implicitly called.
        System.out.println("Circle: " + circle);
        System.out.println("Rectangle: " + rectangle);
        System.out.println("Triangle: " + triangle);

    }
}
