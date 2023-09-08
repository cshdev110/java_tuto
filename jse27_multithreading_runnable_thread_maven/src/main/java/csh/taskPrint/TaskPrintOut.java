package csh.taskPrint;

import java.util.Random;

/*
 * @author csh110dev
 * @version 1.0
 */

public class TaskPrintOut implements Runnable {
    private final int timeInactivity;
    private final String taskName;
    private final static Random generator = new Random();

    public TaskPrintOut(String name) {
        this.taskName = name;
        this.timeInactivity = generator.nextInt(5000);
    }

    @Override
    public void run() {
        try{
            System.out.printf("%s is going to sleep for %d milliseconds.\n", this.taskName, this.timeInactivity);
            Thread.sleep(this.timeInactivity);
        } catch (InterruptedException e) {
            System.out.printf("%s %s\n", this.taskName, "terminated prematurely due to interruption.");
        }
        System.out.printf("%s done sleeping.\n", this.taskName);
    }
}