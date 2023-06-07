package csh.dev;

import java.util.Scanner;

/**
 * @author cshdev110
 */
public final class App {
    private App() {
    }
    public static void main(String[] args) {
        Scanner scanName = new Scanner(System.in);
        Scanner scanId = new Scanner(System.in);
        Scanner scanPrice = new Scanner(System.in);
        Scanner scanSymbol = new Scanner(System.in);
        Scanner scanFreeDelivery = new Scanner(System.in);

        String name;
        int id;
        double price;
        char symbol;
        boolean freeDelivery;

        System.out.print("Type the name: ");
        name = scanName.nextLine();
        System.out.println();

        System.out.print("Type the ID: ");
        id = Integer.parseInt(scanId.nextLine());
        System.out.println();

        System.out.print("Type the price: ");
        price = Double.parseDouble(scanPrice.nextLine());
        System.out.println();
        
        System.out.print("Type the symbol: ");
        symbol = scanSymbol.nextLine().charAt(0);
        System.out.println();

        System.out.print("Type the free delivery: ");
        freeDelivery = scanFreeDelivery.nextLine().equals("yes") ? Boolean.TRUE : Boolean.FALSE;
        System.out.println();

        System.out.println("***** BOOK STORE *****");
        System.out.println(name + " #" + id);
        System.out.println("Price: " + symbol + price);
        System.out.println("Free delivery: " + freeDelivery);

        scanId.close();
        scanPrice.close();
        scanSymbol.close();
        scanFreeDelivery.close();
        scanName.close();
    }
}
