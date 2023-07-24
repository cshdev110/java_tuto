package csh.dev;

import java.util.Scanner;

/**
 * Using Scanner to read data from the keyboard
 */
public final class App {
    public static void main(String[] args) {
        String getInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a data: ");

        do{
            getInput = sc.nextLine();
            System.out.println("You entered: " + getInput);
        } while(!getInput.equals("exit"));

        sc.close();
    }
}
