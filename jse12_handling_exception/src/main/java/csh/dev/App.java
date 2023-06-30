package csh.dev;

import csh.operations.Division;
import csh.operations.ArithmException;

/**
 * @author cshdev110
 * @version 0.0.1
 */

public final class App {
    public static void main(String[] args) {

        try {
            Division div = new Division(10, 0);
            div.getResult();
            System.out.println("Continue.");
        } catch (ArithmException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
