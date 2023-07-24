package csh.dev;

import java.util.Scanner;
import static csh.arithm.Operation.*;

/**
 * Simple arithmetic operations
 */
public final class App {
    public static void main(String[] args) {
        char op = ' ';
        var input1 = 0;
        var input2 = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n** Start **\n");
            System.out.println("Choose what arithmetic operation you want to perform:");
            System.out.println("1. Addition type +\n2. Subtraction type -\n3. Multiplication type *\n4. Division type /\n5. Exit type q");

            var input = sc.nextLine();
            if(input.isEmpty()){
                op = sc.nextLine().charAt(0);
            }      
            else{
                op = input.charAt(0);
            }    

            switch (op) {
                case '+':
                    System.out.println("Enter two numbers to add:");
                    input1 = sc.nextInt();
                    input2 = sc.nextInt();
                    System.out.println("Result: " + input1 + " + " + input2 + " = " + add(input1, input2));
                    break;
                case '-':
                    System.out.println("Enter two numbers to subtract:");
                    input1 = sc.nextInt();
                    input2 = sc.nextInt();
                    System.out.println("Result: " + input1 + " - " + input2 + " = " + subtract(input1, input2));
                    break;
                case '*':
                    System.out.println("Enter two numbers to multiply:");
                    input1 = sc.nextInt();
                    input2 = sc.nextInt();
                    System.out.println("Result: " + input1 + " x " + input2 + " = " + multiply(input1, input2));
                    break;
                case '/':
                    System.out.println("Enter two numbers to divide:");
                    input1 = sc.nextInt();
                    input2 = sc.nextInt();
                    System.out.println("Result: " + input1 + " / " + input2 + " = " + divide(input1, input2));
                    break;
                case 'q':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Default: Invalid input: " + op + ". Try again.\n\n");
                    break;
            }
        } while (op != 'q');

        sc.close();
    }
}
