package csh.dev;

import csh.objs.Employee;
import csh.objs.Writer;
import csh.objs.WritingType;

/**
 * author: cshdev110
 * version: 0.0.1
 */
public final class App {

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Employee emp = new Writer("John Doe", 1000.0, WritingType.CLASIC);

        System.out.println(emp.getDetails());

        System.out.println(((Writer) emp).getWritingTypeTxt());
        System.out.println(((Writer)emp).getWritingTypeTxt());

        Employee emp1;

        Writer writer = new Writer("Jane DOe", 2000.0, WritingType.MODERN);
        emp1 = writer;
        System.out.println("emp1: " + emp1.getDetails());

    }
}
