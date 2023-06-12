package csh.pcworld;

/**
 * Order
 * 
 * @version 1.0 2017-04-13
 * @auther cshdev110
 */

public class Order {
    // private int idOrder;
    // private static int orderCount = 0;
    private static int PCCount = 0;
    private static final int MAX_COMPUTERS = 10;
    private PC[] computers;

    public Order () {
        // this.idOrder = ++orderCount;
        this.computers = new PC[MAX_COMPUTERS];
    }

    public void addPC (PC pc) {
        pc.setIdPC(PCCount);
        this.computers[PCCount++] = pc;
    }

    public double getTotalPrice () {
        double totalPrice = 0;
        for (int i = 0; i < PCCount; i++) {
            totalPrice += this.computers[i].getPrice();
        }
        return totalPrice;
    }

    public void showOrder () {
        for (int i = 0; i < PCCount; i++) {
            System.out.println(this.computers[i]);
        }
    }
}
