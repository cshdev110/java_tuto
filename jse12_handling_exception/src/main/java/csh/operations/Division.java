package csh.operations;

/**
 * @author cshdev110
 * @version 0.0.1
 */

public class Division {
    private int numerator;
    private int denominator;

    public Division(int numerator, int denominator) throws ArithmException {
        if(denominator == 0) {
            throw new ArithmException("Denominator is zero");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void getResult() {
        System.out.println("The division results is: " + (double) this.numerator / this.denominator);
    }
    
}
