package csh.javadoc_arithmetic;

/**
 * This allows just a simple add arithmetic operation
 * 
 * @author cshdev110
 * @version 1.0
 * 
 */

public class Arithmetic {

    /**
     * First parameter
     */
    int parA;

    /**
     * Second parameter
     */
    int parB;

    /**
     * Emptiy constructor
     */
    public Arithmetic() {}

    /**
     * Constructor with two parameter
     * @param parA is the first
     * @param parB is the second
     */
    public Arithmetic(int parA, int parB) {
        this.parA = parA;
        this.parB = parB;
    }

    /**
     * This return the add arithmetic operation
     * @return [int] added result
     */
    public int add() {
        return this.parA + this.parB;
    }    
}
