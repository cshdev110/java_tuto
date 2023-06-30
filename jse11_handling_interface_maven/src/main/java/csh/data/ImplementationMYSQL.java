package csh.data;

/**
* @author: cshdev110
* @version: 0.0.1
*/

public class ImplementationMYSQL implements DataAccess {

    @Override 
    public void insert() {
        System.out.println("Inserting data in MYSQL");
    }

    @Override
    public void list() {
        System.out.println("Listing data from MYSQL");
    }
    
}
