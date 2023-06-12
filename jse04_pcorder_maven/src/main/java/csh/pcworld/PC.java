package csh.pcworld;

/**
 * PC
 * 
 * @version 1.0 2017-04-13
 * @auther cshdev110
 */

public class PC {
   private int idPC;
   private String name;
   private Monitor monitor;
   private Keyboard keyboard;
   private Mouse mouse;
   private double price;
   
   public PC () {}

   public PC (String name, Monitor monitor, Keyboard keyboard, Mouse mouse, double price) {
    //   this.idPC = ++PCCount;
      this.name = name;
      this.monitor = monitor;
      this.keyboard = keyboard;
      this.mouse = mouse;
      this.price = price;
   }

    public int getIdPC() {
        return idPC;
    }

    public String getName() {
        return name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public double getPrice() {
        return price;
    }

    public void setIdPC(int idPC) {
        this.idPC = idPC;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nPC{" + "idPC=" + idPC + 
                        ", name=" + name + 
                        ", monitor=" + monitor + 
                        ", keyboard=" + keyboard + 
                        ", mouse=" + mouse + 
                        ", price=" + price + '}';
    }
}
