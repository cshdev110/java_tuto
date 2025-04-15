package csh.taskPrint;

import java.util.Random;
import java.util.concurrent.Callable;

public class TaskPrintOut implements Callable<String> {
    private final int inactiveTime;
    private final String taskName;
    private final static Random generator = new Random();

    public TaskPrintOut(String taskName) {
        this.taskName = taskName;

        this.inactiveTime = generator.nextInt(10000);
    }

    @Override
    public String call() {
        try {
            System.out.printf("%s will be incative for %d miliseconds.\n", 
                            this.taskName, this.inactiveTime);
            Thread.sleep(this.inactiveTime);
        } catch (InterruptedException e) {
            System.out.printf("%s %s", this.taskName, " prematurely interrupted.");
        }
        System.out.printf("%s is done.\n", this.taskName);
        return this.taskName;
    }

}
