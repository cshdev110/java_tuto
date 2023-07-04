package csh.data;

import csh.exceptions.*;

/**
 * @auth cshdev110
 * @version 0.0.1
 */

public class ImplementationMYSQL implements DataAccess {

    private boolean error;

    @Override
    public void insert() throws DataAccessEx {
        if (error) {
            throw new DataWritingEx("Error writing data to MYSQL");
        } else {
            System.out.println("Data inserted in MYSQL");
        }
    }

    @Override
    public void list() throws DataAccessEx {
        if (error) {
            throw new DataReadingEx("Error reading data from MYSQL");
        } else {
            System.out.println("Data read from MYSQL");
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
