package csh.dev;

import csh.taskPrint.TaskPrintOut;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
* @author csh110dev
* @version 1.0
* 
* Executors and ExecutorService are used to manage threads.
* They are higher level APIs that are a more convenient and flexible
* way to create and manage threads. Many of the details of thread 
* management are handled by the Executors and ExecutorService APIs.
* The ExecutorService has two methods for submitting tasks for execution:
* execute(Runnable) and submit(Callable). The execute() method takes a
* Runnable object and returns void. The submit() method takes a Runnable
* or Callable object and returns a Future object. The Future object can
* be used to determine if the task has completed, to cancel the task, or
* to retrieve the result of the task.
 */

public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */

    public static void main(String[] args) throws InterruptedException, 
                                                  ExecutionException, 
                                                  TimeoutException {
        System.out.println("Hello World!");

        TaskPrintOut task1 = new TaskPrintOut("Task 1");
        TaskPrintOut task2 = new TaskPrintOut("Task 2");
        TaskPrintOut task3 = new TaskPrintOut("Task 3");

        System.out.println("Initializing the ExecutorService");

        // Two ways to initialize the ExecutorService for multithreading
        // * ExecutorService exeService = Executors.newFixedThreatPool(3);
        // * ExecutorService exeService = Executors.newCachedThreadPool();

        ExecutorService exeService = Executors.newCachedThreadPool();

        Future<String> future1 = exeService.submit(task1);
        Future<String> future2 = exeService.submit(task2);
        Future<String> future3 = exeService.submit(task3);
        // The Future object can be used to determine if the task has completed,
        // to cancel the task, or to retrieve the result of the task.
        // The get() method blocks until the task is complete and returns the result.

        System.out.println("Waiting for the tasks to complete");

        // By the use of the isDone boolean array and the do-while loop,
        // we can check if the tasks are done and print the result
        // in the order they are completed.

        boolean[] isDone = new boolean[] {false, false, false};

        do {

            // The isDone() method returns true if the task is complete.
            if (future1.isDone() && !isDone[0]) {
                System.out.println(future1.get());
                isDone[0] = true;
            }
            if (future2.isDone() && !isDone[1]) {
                System.out.println(future2.get());
                isDone[1] = true;
            }
            if (future3.isDone() && !isDone[2]) {
                System.out.println(future3.get());
                isDone[2] = true;
            }
        } while (!future1.isDone() || !future2.isDone() || !future3.isDone());

        // System.out.println(future1.get());
        // System.out.println(future2.get());
        // System.out.println(future3.get());

        System.out.println("All tasks initialized and completed.");
        // The shutdown() method is used to stop the ExecutorService
        // and release the resources used by the threads.
        exeService.shutdown();

    }
}
