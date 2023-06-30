package csh.abstract_exa;

/**
 * @author: cshdev110
 * @version: 0.0.1
 */
public class Triangle extends GeometricShape{
    public Triangle(String shapeType) {
        super(shapeType);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle: " + this.getClass().getSimpleName());
    }

    @Override
    public void draw2() {
        System.out.println("Drawing a triangle two: " + this.getClass().getSimpleName());
    }

    @Override
    public String getShapeType() {
        return "The method got overridden in Triangle class";
    }
}
