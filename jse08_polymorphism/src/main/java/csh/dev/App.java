package csh.dev;

import csh.polymorphism.*;

/**
 * @author cshdev110
 * @version 0.0.1
 */
public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Employee employee = new Employee("John", 1000F);

        printDetails(employee);
        System.out.println();

        Administrator admin = new Administrator("Karla", 2000F, "Finance");
        printDetails(admin);
        System.out.println();

        // Polymorphism
        Employee employee2 = new Administrator("Smith", 3000F, "IT");
        printDetails(employee2);
        System.out.println();
    }

    public static void printDetails(Employee employee) {
        System.out.println("Employee: " + employee.getDetails());
    }
}
