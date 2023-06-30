
package csh.dev;

/**
 * VolumeBox
 * 
 * This class is a simple class to calculate the volume of a box.
 * 
 * @since 1.0
 * 
 * @auther cshdev110
 */

public class VolumeBox {
    private double length;
    private double width;
    private double height;
    private double volume;

    public VolumeBox() {}
    public VolumeBox(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = length * width * height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume() {
        this.volume = this.length * this.width * this.height; 
    }

    public void calculateVolume() {
        this.setVolume();
        System.out.println("Box's volume is: " + this.length + " x " + 
                                                this.width + " x " + 
                                                this.height + " = " + 
                                                getVolume() + " [cm^2].");
    }

    public void printVolume(String title) {
        System.out.println(title + "\n" + this);
    }
}
