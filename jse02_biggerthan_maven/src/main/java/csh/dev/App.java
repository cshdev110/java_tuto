package csh.dev;

import java.util.Scanner;

/**
 * @author schdev110
 */
public final class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var num1 = 0;
        var num2 = 0;

        System.out.print("Type the first number: ");
        num1 = Integer.parseInt(scan.nextLine());
        System.out.println();

        System.out.print("Type the second number: ");
        num2 = Integer.parseInt(scan.nextLine());
        System.out.println();

        System.out.println("The bigger number is: \n" + ((num1 == num2)? "both are equals" : ((num1 > num2)? num1 : num2)));

        scan.close();
    }
}
