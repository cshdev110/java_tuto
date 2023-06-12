package csh.dev;

// import VolumeBox;

/**
 * @author cshdev110
 */
public final class App {
    public static void main(String[] args) {

        System.out.println();        
        System.out.println("In centimeters");
        
        VolumeBox box1 = new VolumeBox();
        VolumeBox box2 = new VolumeBox(1.0, 2.0, 3.0);
        System.out.println();

        box1.printVolume("box1");
        box1.calculateVolume();
        System.out.println();

        box2.printVolume("box2");
        box2.calculateVolume();
    }
}
