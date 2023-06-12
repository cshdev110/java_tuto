package csh.dev;

import csh.pcworld.*;

/**
 * @author cshdev110
 */
public final class App {
    public static void main(String[] args) {
        PC pc1 = new PC("PC 1", new Monitor("LG", 15.6F), new Keyboard("USB", "Logitech"), new Mouse("USB", "Logitech"), 1000.0F);
        PC pc2 = new PC("PC 2", new Monitor("Lenovo", 14.5F), new Keyboard("p2p", "Genius"), new Mouse("p2p", "Genius"), 1001.35F);
        PC pc3 = new PC("PC 3", new Monitor("Samsung", 17.0F), new Keyboard("USB", "EPSON"), new Mouse("p2p", "Logitech"), 1002.0F);
        PC pc4 = new PC("PC 4", new Monitor("Asus", 24F), new Keyboard("p2p", "SAMSUNG"), new Mouse("p2p", "SAMSUNG"), 950.1F);
        PC pc5 = new PC("PC 5", new Monitor("Acer", 21.5F), new Keyboard("p2p", "Viewsonic"), new Mouse("USB", "Viewsonic"), 900.4F);
        PC pc6 = new PC("PC 6", new Monitor("Dell", 23.8F), new Keyboard("USB", "Dell"), new Mouse("USB", "Dell"), 1100.0F);
        PC pc7 = new PC("PC 7", new Monitor("HP", 32F), new Keyboard("p2p", "HP"), new Mouse("p2p", "HP"), 1050.22F);
        PC pc8 = new PC("PC 8", new Monitor("BenQ", 41F), new Keyboard("USB", "Seagate"), new Mouse("USB", "IMB"), 1090.90F);

        Order order = new Order();

        order.addPC(pc1);
        order.addPC(pc2);
        order.addPC(pc3);
        order.addPC(pc4);
        order.addPC(pc5);
        order.addPC(pc6);
        order.addPC(pc7);
        order.addPC(pc8);

        System.out.println("Total price: $" + order.getTotalPrice());

        order.showOrder();
    }
}
