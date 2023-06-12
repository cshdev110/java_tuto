package csh.pcworld;

/**
 * Mouse
 * 
 * @version 1.0 2017-04-13
 * @auther cshdev110
 */

public class Mouse extends InputDevice{
    private int idMouse;
    private static int mouseCount = 0;

    public Mouse(String inputType, String brand) {
        super(inputType, brand);
        this.idMouse = ++mouseCount;
    }

    public int getIdMouse() {
        return idMouse;
    }

    public int getMouseCount() {
        return mouseCount;
    }

    @Override
    public String toString() {
        return super.toString() + "Mouse{" + "idMouse=" + idMouse + ", mouseCount=" + mouseCount + '}';
    }
}
