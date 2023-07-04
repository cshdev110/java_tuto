package csh.data;

import csh.exceptions.*;

/**
 * @auth cshdev110
 * @version 0.0.1
 */

public class ImplementationOracle implements DataAccess {

    private boolean error;

    @Override
    public void insert() throws DataAccessEx {
        if (error) {
            throw new DataWritingEx("Error writing data to Oracle");
        } else {
            System.out.println("Data inserted in Oracle");
        }
    }

    @Override
    public void list() throws DataAccessEx {
        if (error) {
            throw new DataReadingEx("Error reading data from Oracle");
        } else {
            System.out.println("Data read from Oracle");
        }
    }

    @Override
    public void ErrorSimulation(boolean error) {
        this.error = error;
    }

    public boolean getError() {
        return error;
    }
    
}
