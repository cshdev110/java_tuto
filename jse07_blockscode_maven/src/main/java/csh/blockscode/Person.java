package csh.blockscode;

/**
 * @author cshdev110
 */

public class Person {

    private final int idPerson;
    private static int countPeople;

    protected String title = "Hi!";

    /**Initialiser static block*/
    static {
        countPeople = 10;
        // 'this' is not allowed into the static block
        System.out.println();
        System.out.println("Static block execution.");
        System.out.println("Count people: " + countPeople);
        System.out.println();
    }

    // Anonymous block. It is not static and copies to every created object
    {
        System.out.println("Anonymous block execution (no static).");
        this.idPerson = ++countPeople;
        System.out.println("idPerson: " + this.idPerson);
        System.out.println();
    }

    public Person() {
        System.out.println("Constructor's execution.");
    }

    public int getIdPerson() {
        return this.idPerson;
    }

    public int get2IdPerson() {
        return this.idPerson;
    }    
}
