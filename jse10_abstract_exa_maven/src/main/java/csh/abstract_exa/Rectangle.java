package csh.abstract_exa;

/**
 * @author: cshdev110
 * @version: 0.0.1
 */
public class Rectangle extends GeometricShape{
    public Rectangle(String shapeType) {
        super(shapeType);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle: " + this.getClass().getSimpleName());
    }

    @Override
    public void draw2() {
        System.out.println("Drawing a rectangle two: " + this.getClass().getSimpleName());
    }
    
}
