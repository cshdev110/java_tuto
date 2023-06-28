package csh.abstract_exa;

/**
 * author: cshdev110
 * version: 0.0.1
 */
public abstract class GeometricShape {

    protected String shapeType;

    protected GeometricShape(String shapeType) {
        this.shapeType = shapeType;
    }

    public abstract void draw();
    public abstract void draw2();

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public String toString() {
        return "GeometricShape{" +
                "shapeType='" + shapeType + '\'' +
                '}';
    }

}
