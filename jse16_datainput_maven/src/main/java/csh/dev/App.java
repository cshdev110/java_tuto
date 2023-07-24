package csh.dev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Using InputStreamReader to read data from the keyboard
 * Using BufferedReader to store the data from InputStreamReader then read it
 * This class can only read character per character
 */

public final class App {
    public static void main(String[] args) {
        String getInput;

        //This class can only read character per character
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter a data: ");

        try {
            getInput = br.readLine();
            System.out.println("You entered: " + getInput);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
