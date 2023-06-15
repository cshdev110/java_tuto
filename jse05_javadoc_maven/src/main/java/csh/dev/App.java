package csh.dev;

import csh.javadoc_arithmetic.Arithmetic;

/**
 * This class is to get hold of the JavaDoc concept.
 * @author cshdev110
 * @version 1.0
 */
public final class App {

    /**
     * This method execute the Arithmetic class
     * 
     * @param args The arguments of the program of command line.
     */
    public static void main(String[] args) {

        Arithmetic arith = new Arithmetic(3, 2);
        int result = arith.add();
        System.out.println("Result: " + result);
        
    }
}
