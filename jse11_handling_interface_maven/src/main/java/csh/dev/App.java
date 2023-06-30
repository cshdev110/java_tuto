package csh.dev;

import csh.data.*;

/**
 * @author: cshdev110
 * @version: 0.0.1
 */
public final class App {
    public static void main(String[] args) {
        DataAccess dataAccess = new ImplementationOracle();

        dataAccess.insert();
        dataAccess.list();

        dataAccess = new ImplementationMYSQL();

        dataAccess.insert();
        dataAccess.list();

        System.out.println("MAX_REGISTERS: " + DataAccess.MAX_REGISTERS);
    }
}
