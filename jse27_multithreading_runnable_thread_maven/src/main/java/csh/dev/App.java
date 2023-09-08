package csh.dev;

import csh.taskPrint.TaskPrintOut;

/**
 * @author csh110dev
 * @version 1.0
 * 
 * Thread is a class that implements Runnable interface.
 * It is a low-level class that is used to create threads.
 * It requires to manually handle the thread life cycle.
 * Using Executors and ExecutorService is recommended as many details
 * are handled automatically.
 */
public final class App {
    public static void main(String[] args) {
        System.out.println("Creating threads...");

        Thread subp1 = new Thread(new TaskPrintOut("task1"));
        Thread subp2 = new Thread(new TaskPrintOut("task2"));
        Thread subp3 = new Thread(new TaskPrintOut("task3"));

        System.out.println("Threads created.");

        subp1.start();
        subp2.start();
        subp3.start();

        System.out.println("Main method ends.");

    }
}
