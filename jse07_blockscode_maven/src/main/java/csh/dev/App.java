package csh.dev;

import csh.blockscode.Person;

/**
 * @author cshdev110
 * @version 1.0
 */
public final class App {
    public static void main(String[] args) {
        Person p1 = new Person();

        int idPerson = p1.getIdPerson();
        System.out.println("idPerson = " + idPerson);
    }
}
