package csh.data;

/**
* @author: cshdev110
* @version: 0.0.1
*/

public interface DataAccess {

    public static final int MAX_REGISTERS = 10;

    public abstract void insert();
    public abstract void list();
    
}
