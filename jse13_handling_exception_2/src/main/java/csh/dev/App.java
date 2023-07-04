package csh.dev;

import csh.data.*;
import csh.exceptions.*;

/**
 * @author cshdev110
 * @version 0.0.1
 */
public final class App {
    public static void main(String[] args) {

        DataAccess dataAccess = new ImplementationMYSQL();

        dataAccess.ErrorSimulation(false);

        execute(dataAccess, "list");
        System.out.println("--------------------------------------------------");
        execute(dataAccess, "insert");

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

        dataAccess = new ImplementationOracle();

        dataAccess.ErrorSimulation(true);

        execute(dataAccess, "list");
        System.out.println("--------------------------------------------------");
        execute(dataAccess, "insert");
    }

    private static void execute(DataAccess dataAccess, String action) {
        
        if ("list".equals(action)) {
            try {
                dataAccess.list();
            } catch (DataReadingEx e) {
                System.out.println("Error reading data");
                e.printStackTrace(System.out);
            } catch (DataAccessEx e) {
                System.out.println("Error DataAccess");
                e.printStackTrace(System.out);
            } catch (Exception e) {
                System.out.println("Error Exception");
                e.printStackTrace(System.out);
            } finally {
                System.out.println("Finally block. It always executes");
            }
        } else if ("insert".equals(action)) {
            try {
                dataAccess.insert();
            } catch (DataWritingEx e) {
                System.out.println("Error writing data");
                e.printStackTrace(System.out);
            } catch (DataAccessEx e) {
                System.out.println("Error DataAccess");
                e.printStackTrace(System.out);
            } catch (Exception e) {
                System.out.println("Error Exception");
                e.printStackTrace(System.out);
            } finally {
                System.out.println("Finally block. It always executes");
            }
        } else {
            System.out.println("Invalid action");
        }            
    }
}
