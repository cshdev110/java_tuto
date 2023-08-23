package csh.dev;

import csh.archive_handler.SequentialHandlerFiles;

import java.nio.file.Paths;
import java.nio.file.Path;

/**
 * @author cshdev110
 * @version 1.0
 */
public final class App {
    public static void main(String[] args) {
        
        Path filePath = Paths.get("jse19_file_serializable/src/main/java/csh/docs_test/user1.ser");
        SequentialHandlerFiles handler = new SequentialHandlerFiles();

        handler.createFile(filePath);
        handler.addInformation("John", 100);
        handler.addInformation("Mary", 200);
        handler.addInformation("Peter", 300);
        handler.addInformation("Paul", 400);
        handler.closeFile(handler.getOutput());

        System.out.println("Reading file...");

        handler.openFile(filePath);
        handler.readRegisters();
        handler.closeFile(handler.getInput());
    }
}
