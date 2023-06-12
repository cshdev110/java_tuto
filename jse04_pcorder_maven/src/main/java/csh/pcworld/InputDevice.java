package csh.pcworld;

/**
 * InputDevice
 * 
 * @version 1.0 2017-04-13
 * @auther cshdev110
 */

public class InputDevice {
    private String inputType;
    private String brand;

    public InputDevice(String inputType, String brand) {
        this.inputType = inputType;
        this.brand = brand;
    }

    public String getInputType() {
        return inputType;
    }

    public String getBrand() {
        return brand;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        String str = "InputDevice{" + "inputType=" + inputType + ", brand=" + brand + '}';
        return str;
    }
}
