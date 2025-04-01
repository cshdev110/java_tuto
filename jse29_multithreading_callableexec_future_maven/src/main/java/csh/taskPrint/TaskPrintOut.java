package csh.taskPrint;

import java.util.Random;
import java.util.concurrent.Callable;

public class TaskPrintOut implements Callable<String> {
    private final int inactivityTime;
    private final String taskName;
    private final static Random generator = new Random();
    private final static int MAX_INACTIVITY_TIME = 10000;

    public TaskPrintOut(String taskName) {
        this.taskName = taskName;
        this.inactivityTime = generator.nextInt(MAX_INACTIVITY_TIME);
    }

    @Override
    public String call() {
        try {
            System.out.printf("%s is going to sleep for %d milliseconds.\n",
                                this.taskName, this.inactivityTime);
            Thread.sleep(this.inactivityTime);
        } catch(InterruptedException e) {
            System.out.printf("%s %s \n", this.taskName, "Premature interreption due to " + e.getMessage());
        }
        return String.format("%s has woken up after %d milliseconds. \n", this.taskName, this.inactivityTime);
    }
    
}
