package csh.abstract_exa;

/**
 * @author: cshdev110
 * @version: 0.0.1
 */
public class Circle extends GeometricShape{
    public Circle(String shapeType) {
        super(shapeType);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle: " + this.getClass().getSimpleName());
    }

    @Override
    public void draw2() {
        System.out.println("Drawing a circle two: " + this.getClass().getSimpleName());
    }
}
