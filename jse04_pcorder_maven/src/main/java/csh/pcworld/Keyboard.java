package csh.pcworld;

/**
 * Keyboard
 * 
 * @version 1.0 2017-04-13
 * @auther cshdev110
 */

public class Keyboard extends InputDevice{
    private int idKeyboard;
    private static int keyboardCount = 0;

    public Keyboard(String inputType, String brand) {
        super(inputType, brand);
        this.idKeyboard = ++keyboardCount;
    }

    public int getIdKeyboard() {
        return idKeyboard;
    }

    public int getKeyboardCount() {
        return keyboardCount;
    }

    @Override
    public String toString() {
        return super.toString() + "Keyboard{" + "idKeyboard=" + idKeyboard + ", keyboardCount=" + keyboardCount + '}';
    }
}
