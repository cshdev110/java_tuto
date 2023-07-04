package csh.data;

import csh.exceptions.*;

/**
 * @auth cshdev110
 * @version 0.0.1
 */

public interface DataAccess {

    public static final int MAX_REG = 10;

    public abstract void insert() throws DataAccessEx;

    public abstract void list() throws DataAccessEx;

    public abstract void ErrorSimulation(boolean error);
    
}
