package csh.pcworld;

/**
 * Monitor
 * 
 * @version 1.0 2017-04-13
 * @auther cshdev110
 */

public class Monitor {
    private int idMonitor;
    private String brand;
    private double size;
    private static int monitorCount = 0;

    private Monitor() {
        this.idMonitor = ++monitorCount;
    }

    public Monitor(String brand, double size) {
        this();
        this.brand = brand;
        this.size = size;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public int getMonitorCount() {
        return monitorCount;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", brand=" + brand + ", size=" + size + ", monitorCount="
                + monitorCount + '}';
    }        
}
