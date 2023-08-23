package csh.archive_handler;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

import csh.archive.RegisterSerializable;

/**
 * @author cshdev110
 * @version 1.0
 */

public class SequentialHandlerFiles {

    private ObjectOutputStream output;
    private ObjectInputStream input;

    public void createFile(Path fileName) {
        try {
            this.output = new ObjectOutputStream(new FileOutputStream(fileName.toAbsolutePath().toString()));
        } catch (IOException ioException) {
            System.err.println("Error opening file at ObjectOutputStream.");
        }
    }

    public void openFile(Path fileName) {
        try {
            this.input = new ObjectInputStream(new FileInputStream(fileName.toAbsolutePath().toString()));
        } catch (FileNotFoundException ex) {
            System.err.println("Error opening file at FileInputStream.");

        } catch (IOException ioException) {
            System.err.println("Error opening file at ObjectInputStream.");
        }
    }

    public void readRegisters() {
        try {
            do {
                RegisterSerializable regist = (RegisterSerializable) this.input.readObject();
                System.out.println("Name: " + regist.getName());
                System.out.println("Account: " + regist.getAccount());
            } while(true);
        } catch (EOFException endOfFileException) {
            System.out.println("End of file.");
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Unable to create object.");
        } catch (IOException ioException) {
            System.err.println("Error reading file.");
        }
    }

    public void addInformation(String name, int account) {
        RegisterSerializable regist = new RegisterSerializable(name, account);
        try {
            this.output.writeObject(regist);
        } catch (IOException ioException) {
            System.err.println("Error writing to file.");
        }
    }

    public void closeFile(Object ob) {
        if (ob instanceof ObjectOutputStream) {
            try {
                this.output.close();
            } catch (IOException ioException) {
                System.err.println("Error closing file (output variable).");
                System.exit(1);
            }
        } else if (ob instanceof ObjectInputStream) {
            try {
                this.input.close();
            } catch (IOException ioException) {
                System.err.println("Error closing file (input variable).");
                System.exit(1);
            }
        }
    }

    public ObjectOutputStream getOutput() {
        return this.output;
    }

    public ObjectInputStream getInput() {
        return this.input;
    }
}